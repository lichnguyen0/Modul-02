package thuchanhsudungloparrayindexoutofboundsexception;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.CreateRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số 5" + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException a) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng"); //chú ý dòng này sử dụng System.err luồng chuẩn để in thông báo lỗi, chứ không phải System.out
        }
    }
}
