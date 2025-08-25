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

        File sourceFile = new File(sourceFileName);
        File targetFile = new File(targetFileName);

        //Kiểm tra tồn tại file nguồn
        if (sourceFile.exists()) {
            System.out.println("File không tồn tại");
            return;
        }
        //Kiểm tra tồn tại file đích
        if (targetFile.exists()) {
            System.out.println("File đích đã tồn tại không ghi đè.");
            return;
        }

        int charCount = 0; // biến đếm ký tự

        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader(sourceFile);
            fw = new FileWriter(targetFile);

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
    }
}
