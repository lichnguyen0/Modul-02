package Array_And_Methods_In_Java;

import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        int size;
        int[] array;  // khai báo mảng.  kiểu này là khai báo, sau đó khởi tạo
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập kích thước:");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Kích thước không vượt quá 20");
            }

        } while (size > 20);

        array = new int[size]; // khởi tạo mảng với độ dài từ người dùng nhập vào từ bàn phím
        int i = 0;
        while (i < array.length){
            System.out.print("Nhập phần tử "+(i+1)+": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
