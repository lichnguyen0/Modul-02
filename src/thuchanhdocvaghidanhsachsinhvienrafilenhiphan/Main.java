package thuchanhdocvaghidanhsachsinhvienrafilenhiphan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void writeDataToFile(String path, List<Student> students) {

        try {
            FileOutputStream fos = new FileOutputStream(path);  //mở một luồng nhị phân để ghi dữ liệu vào file.
            //Nếu file chưa có → tự tạo mới. Nếu có rồi → ghi đè (trừ khi bạn thêm true để bật chế độ append).

            ObjectOutputStream oos = new ObjectOutputStream(fos);  //cho phép ghi nguyên object Java xuống file (không chỉ text).
            //Điều kiện: class của object phải implements Serializable (ví dụ Student).
            oos.writeObject(students);  //writeObject(Object obj) là phương thức có sẵn trong lớp ObjectOutputStream
            oos.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String path) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);//Mở file nhị phân tại path.
            //Đây là luồng đọc raw bytes từ file
            ObjectInputStream ois = new ObjectInputStream(fis); //Bọc fis trong ObjectInputStream.
            // ObjectInputStream dùng để đọc đối tượng đã được tuần tự hóa (serialized) từ file.
            students = (List<Student>) ois.readObject(); //Gọi readObject() để đọc dữ liệu nhị phân từ file và chuyển nó về Object trong Java.
                                                        //Vì writeDataToFile(...) lúc trước bạn đã dùng: oos.writeObject(students);
                                                        //readObject() là một phương thức có sẵn trong lớp ObjectInputStream của Java.
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return students;
    }


    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeDataToFile("student.txt", students);

        List<Student> studentDataFromFile = readDataFromFile("student.txt");
        for (Student student : studentDataFromFile) {
            System.out.println(student);
        }
    }
}
