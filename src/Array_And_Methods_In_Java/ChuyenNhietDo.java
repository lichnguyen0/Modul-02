package Array_And_Methods_In_Java;

import java.util.Scanner;

public class ChuyenNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("----Menu----");
            System.out.println("1. Đổi F sang độ C");
            System.out.println("2. Đổi C sang độ F");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Nhập độ F: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Đổi F sang độ C " + fahrenheitTocelsius(fahrenheit));
                    break;
                }
                case 2:
                    System.out.println("Enter Celsius: ");
                    celsius = scanner.nextDouble();
                    System.out.println("Đổi C sang độ F " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitTocelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
