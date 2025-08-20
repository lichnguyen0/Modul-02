package caidatthuattoantimkiemnhiphansudungdequy;

import java.util.Arrays;
import java.util.Scanner;

public class FindANumber {


    // phương thức nhập và khởi tạo mảng
    public int[] nhapMang() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so luong phan tu");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("phần tử số " + i);
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    //pt sắp xếp
    public void sortArray(int[] array) {
        Arrays.sort(array);
        System.out.println("Mảng được sắp xếp: " + Arrays.toString(array));
    }

    //
    public int binarySearch(int[] array, int left, int right, int value) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;

        if (array[mid] == value) {
            return mid;

        } else if (value > array[mid]) {
            return binarySearch(array, mid + 1, right, value);
        } else {
            return binarySearch(array, left, mid - 1, value);
        }
    }

    public int valueToFind() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia tri can tim: ");
        return sc.nextInt();
    }
}
