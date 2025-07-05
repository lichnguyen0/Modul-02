package IntroductiontoJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MoneyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long usdAmount, vndAmount;
        final long tyle = 23_000;  // đây là cách khai báo biến hằng số có kiểu cụ thể trong Java
        // cũng tương tự như const rate = 23000; trong JS nhưng Java có cách viết theo quy trình, rõ ràng, chặt chẽ

        System.out.println("Nhập tiền (USD) để chuyển sang tiền VND: ");
        usdAmount = scanner.nextLong();

        vndAmount = usdAmount * tyle;  // sử dụng gạch dưới để cho dễ đọc hơn không ảnh hưởng đến kết quả 23_000 vẫn là 23000
        // Định dạng số tiền
        DecimalFormat chuyendoi = new DecimalFormat("#,###");
        // in ra màn hình
        System.out.println("Giá trị quy đổi: " + chuyendoi.format(vndAmount) + " VND");
    }
}
