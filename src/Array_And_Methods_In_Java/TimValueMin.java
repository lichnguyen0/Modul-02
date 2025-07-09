package Array_And_Methods_In_Java;

import java.util.Scanner;

public class TimValueMin {
    public static void main(String[] args) {
        final int SIZE; // Khai báo hằng số cho kích thước mảng
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập kích thước mảng
        System.out.print("Nhập số phần tử của mảng (SIZE): ");
        SIZE = scanner.nextInt();

        int[] arr = new int[SIZE]; // Bước 1: Khai báo mảng

        // Bước 2: Nhập giá trị cho từng phần tử
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Nhập phần tử arr[" + i + "]: ");
            arr[i] = scanner.nextInt();
        }

        // Bước 3: Giả sử phần tử đầu tiên là nhỏ nhất
        int min = arr[0];

        // Bước 4: Duyệt mảng từ phần tử thứ 2
        for (int i = 1; i < SIZE; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Cập nhật giá trị nhỏ nhất
            }
        }

        // Bước 5: In kết quả
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
        scanner.close();
    }
}

