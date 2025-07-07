package Bai_tap;

import java.util.Scanner;

public class LuyenTap {
    public static void main(String[] args) {
        System.out.println("---Menu---");
        int choice;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("1. Tìm số nguyên tố");
            System.out.println("2. Tìm ước chung lớn nhất");
            System.out.println("0. Thoát chương trình");

            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhập number để kiểm tra");
                    int number = scan.nextInt();
                    if (number < 2) {
                        System.out.println("Không phải là số nguyên tố");
                        break;
                    }
                    boolean isPrime = true;
                    for (int i = 2; i <= Math.sqrt(number); i++) {
                        if (number % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        System.out.println(number + " Là số nguyên tố");
                    } else {
                        System.out.println(number + " Không phải là số nguyên tố");
                    }
                    break;
                case 2:
                    System.out.println("Nhập số thứ nhất");
                    int a = scan.nextInt();

                    System.out.println("Nhập số thứ hai");
                    int b = scan.nextInt();

                    if (a < 0) a = -a;
                    if (b < 0) b = -b;
                    while (b != 0) {
                        int luu = b;
                        b = a % b;
                        a = luu;
                    }

                    System.out.println("Ước chung lớn nhất là: " + a);
                    break;
                case 0:
                    System.out.println("Thoát Chương trình");
            }
        } while (choice != 0);
    }
}