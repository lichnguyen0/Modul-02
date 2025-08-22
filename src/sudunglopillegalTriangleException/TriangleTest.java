package sudunglopillegalTriangleException;

import java.util.Scanner;

public class TriangleTest {

    Scanner sc = new Scanner(System.in);

    //phuong thuc kiem tra
    public static void testTamGiac(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException(" Cạnh tam giác không thể là số âm hoặc bằng 0!");
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException(" Tổng 2 cạnh phải lớn hơn cạnh còn lại!");
        }
    }

}