package CaseStudy;

import java.util.List;
import java.util.Scanner;

public class DemoManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = "file/students.csv";
        String path1 = "file/gpa.csv";

        StudentManager student = new StudentManager();

        // 1. Đọc file lúc khởi động
        List<Student> studentsFromFile = FileUtil.readFile(path);
        for (Student s : studentsFromFile) {
            student.addStudentFromFile(s);
        }

        int choice;
        do {
            System.out.println("=====Menu=====");
            System.out.println("1. Thêm thông tin sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo ID");
            System.out.println("4. Xoá sinh viên theo ID");
            System.out.println("5. Sửa và cập nhật thông tin sinh viên");
            System.out.println("6. Sắp xếp hiển thị danh sách sinh viên có điểm GPA cao nhất.");
            System.out.println("0. Thoát chương trình");
            System.out.println("Chọn chức năng: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    student.addStudent();
                    FileUtil.writeFile(path, student.getStudentList()); // lưu file
                    break;
                case 2:
                    student.showStudentList();
                    break;
                case 3:
                    student.searchById();
                    break;
                case 4:
                    student.deleteById();
                    FileUtil.writeFile(path, student.getStudentList()); // lưu file
                    break;
                case 5:
                    student.updateStudentInformation();
                    FileUtil.writeFile(path, student.getStudentList()); // lưu file
                    break;
                case 6:
                    student.sortGPA();
                    FileUtil.writeFile(path1, student.getStudentList()); // lưu file
                    System.out.println("Danh sách GPA giảm dần đã lưu vào " + path1);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        } while (choice != 0);
    }
}
