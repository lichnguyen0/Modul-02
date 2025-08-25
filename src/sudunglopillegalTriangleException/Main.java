package sudunglopillegalTriangleException;

import java.util.Scanner;

import static sudunglopillegalTriangleException.TriangleTest.testTamGiac;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập 3 cạnh tam giác: ");
        try {
            System.out.print("Nhập cạnh a: ");
            double a = sc.nextDouble();
            System.out.print("Nhập cạnh b: ");
            double b = sc.nextDouble();
            System.out.print("Nhập cạnh c: ");
            double c = sc.nextDouble();

            testTamGiac(a, b, c);

            System.out.println("Tam giác hợp lệ");
        } catch (IllegalTriangleException e) {
            System.err.println("Lỗi" + e.getMessage());
        } catch (Exception e) {
            System.err.println("Lỗi dữ liệu! Vui lòng nhập số.");
        }
        sc.close();
    }
}
