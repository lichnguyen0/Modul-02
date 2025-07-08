package Loop_In_Java;

import java.util.Scanner;

public class ShowTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---Menu---");
        System.out.println("1. Hình chữ nhật");
        System.out.println("2. Tam giác Vuông bottom-left");
        System.out.println("3. Tam giác Vuông top-left");
        System.out.println("4. Tam giác cân");
        System.out.println("Nhập lựa chọn của bạn:");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Nhập chiều dài ");
            int dai = scanner.nextInt();
            System.out.println("Nhập chiều rộng: ");
            int rong = scanner.nextInt();

            for (int i = 0; i < dai; i++) {
                for (int j = 0; j < rong; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else if (choice == 2) {
            System.out.println("Nhập chiều cao: ");
            int cao = scanner.nextInt();

            for (int i = 0; i <= cao; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else if (choice == 3) {
            System.out.println("Nhập chiều cao: ");
            int cao = scanner.nextInt();

            for (int i = cao; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else if (choice == 4) {
            System.out.println("Nhập chiều cao");
            int cao = scanner.nextInt();

            for (int i = 1; i <= cao; i++) {
                for (int j = 1; j <= cao - i; j++) {
                    System.out.print("  ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Lựa chọn không hợp lệ!");
        }
    }
}

