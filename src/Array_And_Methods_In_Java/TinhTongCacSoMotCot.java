package Array_And_Methods_In_Java;

import java.util.Scanner;

public class TinhTongCacSoMotCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước mảng
        System.out.print("Nhập số hàng: ");
        int rows = scanner.nextInt();

        System.out.print("Nhập số cột: ");
        int cols = scanner.nextInt();

        double[][] array = new double[rows][cols];

        // Nhập phần tử mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("array[%d][%d] = ", i, j);
                array[i][j] = scanner.nextDouble();
            }
        }

        // Nhập chỉ số cột cần tính tổng
        System.out.print("Nhập chỉ số cột cần tính tổng (bắt đầu từ 0): ");
        int colToSum = scanner.nextInt();

        // Kiểm tra chỉ số cột có hợp lệ không
        if (colToSum < 0 || colToSum >= cols) {
            System.out.println("Chỉ số cột không hợp lệ!");
            return;
        }

        // Tính tổng cột
        double sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += array[i][colToSum];
        }

        // Xuất kết quả
        System.out.printf("Tổng của cột %d là: %.2f\n", colToSum, sum);
    }
    }

