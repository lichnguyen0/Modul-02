package Bai_tap;

import java.util.Scanner;

public class LuyenTap1 {
    public static void main(String[] args) {
        int a;
        int b;
        int tinhtoan;
        int luachon;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("----Menu----");
            System.out.println("1. tính tổng");
            System.out.println("1. Tính hiệu");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn");

            luachon = scanner.nextInt();

            switch (luachon) {
                case 1: {
                    System.out.println("Nhập a");
                    a = scanner.nextInt();
                    System.out.println("Nhập b");
                    b = scanner.nextInt();
                    System.out.println("Tổng của " + a + "+" + b + " là: " + tinhTong(a,b));
                    break;
                }
                case 2: {
                    System.out.println("Nhập a");
                    a = scanner.nextInt();
                    System.out.println("Nhập b");
                    b = scanner.nextInt();
                    System.out.println("Hiệu của " + a + " và" + b + " là: " + tinhHieu(a,b));
                }
                case 0: {
                    System.exit(0);
                }
            }
        } while (luachon != 0);

    }
    public static int tinhTong(int a,int b) {
        int tinhtoan = a + b;
        return tinhtoan;
    }
    public static int tinhHieu (int a, int b){
        int tinhtoan = a - b;
        return tinhtoan;
    }

}
