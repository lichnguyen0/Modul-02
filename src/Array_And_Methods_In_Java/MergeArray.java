package Array_And_Methods_In_Java;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //nhap mang 1
        System.out.println("Nhập kích thước array 1:");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            System.out.print("Nhập phần tử [" + i + "]: ");
            arr1[i] = sc.nextInt();
        }

        // nhap mang 2
        System.out.println("Nhập kích thước array 2:");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            System.out.print("Nhập phần tử [" + i + "]: ");
            arr2[i] = sc.nextInt();
        }

        //tao mang 3 co kich thuoc = arr1 + arr2
        int[] arr3 = new int[arr1.length + arr2.length];

        //gan mang 1 vao arr3
        for (int i = 0; i < n1; i++) {
            arr3[i] = arr1[i];
        }
        //gan mang 2 vao arr 3
        for (int i = 0; i < n2; i++) {
            arr3[n1 + i] = arr2[i];  //phép gán luôn đọc từ phải sang trái
        }

        //in mảng đã gộp
        System.out.println("Sau khi gop");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + ", ");
        }


    }
}
