package caidatthuattoantimkiemnhiphansudungdequy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FindANumber finder = new FindANumber();

        //nhap mang
        int[] arr = finder.nhapMang();

        // sắp xep mang
        finder.sortArray(arr);

        //nhap gia tri tim kiem
        int value = finder.valueToFind();
        // tim kiem quy de
        int index = finder.binarySearch(arr, 0, arr.length - 1, value);
        // in ket qua
        if (index != -1) {
            System.out.println("Gia tri " + value + " tim thay ở vi tri: " + index);
        } else {
            System.out.println("Khong tim thay gia tri " + value);
        }
    }

}
