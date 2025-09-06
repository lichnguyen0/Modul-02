package CaseStudy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    //doc file vào bram bộ nhớ tạm

    public static List<Student> readFile(String filePath) {
        List<Student> studentList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) { //readLine() là một phương thức của BufferedReader dùng để đọc một dòng văn bản từ luồng vào (Input Stream).
                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] parts = line.split(",");

                if (parts.length == 6)
                    try {
                        Student s = new Student(
                                parts[0].trim(),                       // name
                                Integer.parseInt(parts[1].trim()),    // age
                                parts[2].trim(),                       // id
                                parts[3].trim(),                       // email
                                parts[4].trim(),                       // phoneNumber
                                Float.parseFloat(parts[5].trim())     // GPA
                        );
                        studentList.add(s); // Thêm Student vào danh sách
                    } catch (NumberFormatException e) {
                        System.err.println("Lỗi định dạng số dòng:" + line);
                    }
                else {
                    // Nếu dòng không đủ trường
                    System.err.println("Dòng không hợp lệ: " + line);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File không tồn tại: " + filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return studentList;
    }

    public static void writeFile(String filePath, List<Student> studentList) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (Student s : studentList) {
                // Tạo dòng CSV từ đối tượng Student
                String line = s.getName() + "," +
                        s.getAge() + "," +
                        s.getId() + "," +
                        s.getEmail() + "," +
                        s.getPhoneNumber() + "," +
                        s.getGPA();
                bw.write(line);   // Ghi dòng vào file
                bw.newLine();     // Xu
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
