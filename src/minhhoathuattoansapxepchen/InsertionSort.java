package minhhoathuattoansapxepchen;

import java.util.Scanner;

public class InsertionSort {

    Scanner input = new Scanner(System.in);

    //pthuc nhap mang
    public int[] nhapVao(int n) {

        System.out.print("Nhập kích thước mảng: ");
        n = input.nextInt();
        System.out.println("Nhập " + n + " giá trị");
        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử số " + i + " ");
            list[i] = input.nextInt();
        }
        return list;
    }

    // hien thi mang ban dau
    public void mangBanDau(int[] list) {
        for (int output : list) {
            System.out.print(output + " ");
        }
        System.out.println();
    }


    //săp sep chèn
    public void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;

            System.out.println("\nChèn phần tử " + key + " vào mảng con đã sắp xếp");

            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j]; //Gán giá trị của phần tử tại chỉ số j trong mảng list cho phần tử tại chỉ số j+1.
                j--; // làm chỉ số lùi lại 1
            }
            list[j + 1] = key; // chèn key vào mảng đúng vị trí

            // In mảng sau mỗi lần chèn
            System.out.print("Mảng sau khi chèn: ");
            for (int k = 0; k < list.length; k++) {
                System.out.print(list[k] + " ");
            }
            System.out.println();
        }
    }
}
