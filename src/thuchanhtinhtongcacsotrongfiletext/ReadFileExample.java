package thuchanhtinhtongcacsotrongfiletext;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileExample {

    public void readFileText(String filePath) {

        try {

            // tạo đối tượng đọc file theo đường dẫn
            File file = file = new File(filePath);


            // kiểm tra nếu file có tồn tại thì ném ra ngoại lệ
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            // Đọc từng dòng của file và tiến hành cộng tổng lại
            BufferedReader br = new BufferedReader(new FileReader(file)); //BufferedReader: là để bọc thêm lớp đệm (buffer) giúp đọc nhanh hơn và có tiện ích readLine().
            // FileReader(file) : mở file (dạng text) để đọc ký tự
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line); // chuyển nội dung  String sàn số và cộng dồn vào biến sum
            }
            br.close();

            // hiển thị ra màn hình tổng các số nguyên trong file
            System.out.println("Tổng = " + sum);

        } catch (Exception e) {
            // TH file không tồn tại hoặc nội dung file có lỗi thì sẽ hiển thị thông báo lỗi.
            System.err.println("File không tồn tại or nội dung có lỗi!");
        }
    }
}
