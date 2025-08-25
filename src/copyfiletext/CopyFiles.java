package copyfiletext;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyFiles {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập đường dẫn tệp nguồn:");
        String sourceFileName = sc.nextLine();

        System.out.println("Nhập đường dẫn tệp đích:");
        String targetFileName = sc.nextLine();

        File sourceFile = new File(sourceFileName); // tạo đối tượng đại diện cho file để sau này mở luồng đọc hoặc ghi.
        File targetFile = new File(targetFileName); //tạo đối tượng đại diện cho file để sau này mở luồng đọc hoặc ghi.

        //Kiểm tra tồn tại file nguồn
        if (!sourceFile.exists()) {
            System.out.println("File không tồn tại");
            return;
        }
        //Kiểm tra tồn tại file đích
        if (targetFile.exists()) {
            System.out.println("File đích đã tồn tại không ghi đè.");
            return;
        }

        int charCount = 0; // biến đếm ký tự

        FileReader fr = null;  //là luồng đọc ký tự từ file text.
                              //Đây là khai báo biến fr kiểu FileReader.
                             //Chưa mở file thực sự, chỉ tạo biến trỏ tới luồng đọc.
                            //Mục đích khai báo null trước là để có thể mở file trong try và đóng luồng trong finally sau này:

        FileWriter fw = null;  //là luồng ghi ký tự vào file text.

        try {
            fr = new FileReader(sourceFile);  //mở file nguồn để đọc ký tự.
            fw = new FileWriter(targetFile); //mở file đích để ghi ký tự (hoặc tạo mới file nếu chưa tồn tại).

            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c); // ghi ký tự sang file đích
                charCount++;
            }
            System.out.println("Sao chép file thành công!");
            System.out.println("Tổng số ký tự trong file: " + charCount);

        }catch(IOException e){
            System.out.println( "Có lỗi xảy ra: "+ e.getMessage());
        }
        finally{
            try {
                if(fr != null)fr.close();
                if(fw != null)fw.close();
            } catch (IOException e) {
                System.out.println("Lỗi khi đóng file: "+ e.getMessage() );
            }
        }
        sc.close();
    }
}
