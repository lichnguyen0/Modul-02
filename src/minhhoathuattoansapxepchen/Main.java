package minhhoathuattoansapxepchen;

public class Main {

    public static void main(String[] args) {

        InsertionSort sorter = new InsertionSort();

        //nhap mang
        int[] list = sorter.nhapVao(0); // Tham số n không cần thiết

        // Hiển thị mảng ban đầu
        System.out.println("\nMảng ban đầu:");
        sorter.mangBanDau(list);


        // Sắp xếp mảng bằng thuật toán sắp xếp chèn
        sorter.insertionSort(list);


        // Hiển thị mảng sau khi sắp xếp
        System.out.println("\nMảng sau khi sắp xếp:");
        sorter.mangBanDau(list);
    }
}
