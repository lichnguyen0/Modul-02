package CaseStudy;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> studentList = new ArrayList<Student>();
    private Scanner sc = new Scanner(System.in);


    //add thong tin sinh vien
    public void addStudent() {
        System.out.print("Nhập họ và tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());

        //Validate Id
        String id;
        do {
            System.out.print("Nhập ID sinh viên: ");
            id = sc.nextLine();
            if (!Validate.validateId(id)) {
                System.out.println("ID không hợp lệ! ID bắt đầu phải là SV, độ dài phải là 6 ký tự.😥");
            }
        } while (!Validate.validateId(id));

        // validate Email
        String email;
        do {
            System.out.print("Nhâp Email: ");
            email = sc.nextLine();
            if (!Validate.validateEmail(email)) {
                System.out.println("Email không hợp lệ vui lòng nhập đúng! Ví dụ: abc@gmail.com 😥");
            }
        } while (!Validate.validateEmail(email));

        // validate số điện thoại
        String phoneNumber;
        do {
            System.out.print("Nhập số điện thoại: ");
            phoneNumber = sc.nextLine();
            if (!Validate.validatePhone(phoneNumber)) {
                System.out.println("Số điện thoại không hợp lệ! Phải có 10 chữ số và bắt đầu bằng 08 or 09.😥");
            }
        } while (!Validate.validatePhone(phoneNumber));


        System.out.println("Nhập điểm trung bình học tập");
        float GPA = Float.parseFloat(sc.nextLine()); //định dạng đúng là 8.8 nếu dùng dấu "phẩy" là sai

        Student sv = new Student(name, age, id, email, phoneNumber, GPA);
        studentList.add(sv);

        System.out.println("Đã thêm sinh viên thành công!🤩");
    }

    // hien thi
    public void showStudentList() {
        if (studentList.isEmpty()) {
            System.out.println("Danh sách sinh viên trống");
        } else {
            for (Student sinhvien : studentList) {
                System.out.println(sinhvien);
            }
        }
    }

    //tim sinh vien theo
    public void searchById() {
        System.out.println("Nhập ID cần tìm kiếm");
        String id = sc.next();
        boolean show = false;
        for (Student sinhvien : studentList) {
            if (sinhvien.getId().equalsIgnoreCase(id)) {
                System.out.println("Kết quả tìm kiếm: ");
                System.out.println(sinhvien);
                show = true;
            }
        }
        if (!show) {
            System.out.println("Không tìm thấy ID sinh viên.");
        }
    }

    //delete sinh vien theo ID
    public void deleteById() {
        System.out.print("Nhập ID sinh viên cần xoá: ");
        String id = sc.next();
        boolean delete = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equalsIgnoreCase(id)) {
                System.out.println("Tìm thấy sinh viên: " + studentList.get(i));
                System.out.println("Bạn có chắc muốn xoá không (Y/N): ");
                String confirm = sc.next();
                if (confirm.equalsIgnoreCase("Y")) {
                    studentList.remove(i);
                    System.out.println("Đã xoá sinh viên có mã ID là: " + id);
                    delete = true;
                } else {
                    System.out.println("Huỷ thao tác xoá");
                }
                break;
            }
        }
        if (!delete) {
            System.out.println("Không tìm thấy sinh viên cần xoá.");
        }
    }

    // sửa thông tin sinh viên (có validate)
    public void updateStudentInformation() {
        System.out.println("Nhập ID sinh viên cần chỉnh sửa: ");
        String id = sc.nextLine();
        boolean update = false;
        for (Student sinhvien : studentList) {
            if (sinhvien.getId().equalsIgnoreCase(id)) {
                System.out.println(" Tìm thấy sinh viên: " + sinhvien);


                System.out.println(" Bạn có muốn chỉnh sửa không (Y/N): ");
                String confirm = sc.nextLine();
                if (!confirm.equalsIgnoreCase("Y")) {
                    System.out.println("Huỷ thao tác sửa");
                    return;
                }
                System.out.print("Nhập họ và tên: ");
                String newName = sc.nextLine();
                System.out.print("Nhập tuổi: ");
                int newAge = Integer.parseInt(sc.nextLine()); // chuyển string thành số nguyên

                // validate ID mới
                String newId;
                do {
                    System.out.print("Nhập ID sinh viên: ");
                    newId = sc.nextLine();
                    if (!Validate.validateId(newId)) {
                        System.out.println("ID không hợp lệ! ID bắt đầu phải là SV, tổng độ dài phải là 6 ký tự.😥");
                    }
                } while (!Validate.validateId(newId));

                // validate email mới
                String newEmail;
                do {
                    System.out.print("Nhập email: ");
                    newEmail = sc.nextLine();
                    if (!Validate.validateEmail(newEmail)) {
                        System.out.println("Email không hợp lệ vui lòng nhập đúng! Ví dụ: abc@gmail.com 😥");
                    }
                } while (!Validate.validateEmail(newEmail));

                // validate số điện thoại mới
                String newPhoneNumber;
                do {
                    System.out.print("Nhập số điện thoại: ");
                    newPhoneNumber = sc.nextLine();
                    if (!Validate.validatePhone(newPhoneNumber)) {
                        System.out.println("Số điện thoại không hợp lệ! Phải có 10 chữ số và bắt đầu bằng 08 or 09.😥");
                    }
                } while (!Validate.validatePhone(newPhoneNumber));


                System.out.print("Nhập điểm trung bình học tập: ");
                float GPA = Float.parseFloat(sc.nextLine()); // chuyển string thành float

                sinhvien.setName(newName);
                sinhvien.setAge(newAge);
                sinhvien.setId(newId);
                sinhvien.setEmail(newEmail);
                sinhvien.setPhoneNumber(newPhoneNumber);
                sinhvien.setGPA(GPA);

                System.out.println(" ➡\uFE0F Thông tin sinh viên đã được câp nhật: \n" + sinhvien);
                update = true;
                break;
            }
        }
        if (!update) {
            System.out.println("Không tìm thấy ID sinh viên cần sửa.");
        }
    }

    //sắp xếp sinnh viên có GPA cao
    public void sortGPA() {
        if (studentList.isEmpty()) {
            System.out.println("Danh sách sinh viên trống!");
            return;
        }
        for (int i = 1; i < studentList.size(); i++) {
            Student key = studentList.get(i);
            int j = i - 1;

            while (j >= 0 && studentList.get(j).getGPA() < key.getGPA()) {
                studentList.set(j + 1, studentList.get(j));
                j = j - 1;
            }
            studentList.set(j + 1, key);
        }
        System.out.println("Danh sách điểm học tập sinh viên xếp theo thứ tự tăng dần");
        showStudentList();
    }

    public void addStudentFromFile(Student s) {
        studentList.add(s);
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }
}
