package Array_And_Methods_In_Java;

import java.util.Scanner;

public class AddPhanTu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap so luong phan tu");
        int n = input.nextInt();
        //Khoi tao va tao mang bang for
        int[] arr = new int[n+1]; //tại sao n phải +1 bởi vì mảng java có kích thước cố định,
                                  // nếu kích thước đúng bằng n thì không còn chỗ để thêm phần tử mới nên sẽ bị lỗi
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu [" + i + "]: ");
            arr[i] = input.nextInt();
        }
        //nhap phan tu can chen
        System.out.println("Nhap phan tu can chen");
        int x = input.nextInt();

        // Nhập vị trí cần chèn
        System.out.println("nhap vi tri can chen");
        int index = input.nextInt();
// kiem tra dieu kien index hop le
        if (index <= -1 || index >= arr.length) {
            System.out.println("Khong chen duoc phan tu vao mang");
        } else {
// Chèn phần tử X vào vị trí index
            for (int i = n; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = x;
            n++; // tăng kích thước logic của mảng

            // In ra mảng sau khi chèn
            System.out.println("Mảng sau khi chèn:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
