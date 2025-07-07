package Loop_In_Java;

import java.util.Locale;
import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Nhập số tiền gửi: ");
        double money = scanner.nextDouble();

        System.out.println("Nhập số tháng gửi");
        int month = scanner.nextInt();

        System.out.println("Nhập lãi suất");
        double interestRate = scanner.nextDouble();

        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;

        }
        System.out.println("Tổng số tiền lãi: " + totalInterest);
    }
}
