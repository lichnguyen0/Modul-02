package Array_And_Methods_In_Java;

import java.util.Scanner;

public class TongDuongCheoChinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ===== BƯỚC 1: Tính tổng đường chéo chính với ma trận có sẵn =====
        System.out.println("Bước 1: Tính tổng đường chéo chính với ma trận có sẵn");
        double[][] maTranCoSan = {
                {1.1, 2.2, 3.3},
                {4.4, 5.5, 6.6},
                {7.7, 8.8, 9.9}
        };

        double tongCheoChinh1 = 0;
        for (int i = 0; i < maTranCoSan.length; i++) {
            tongCheoChinh1 += maTranCoSan[i][i];
        }
        System.out.println("Tổng đường chéo chính của ma trận có sẵn: " + tongCheoChinh1);

        System.out.println("\n============================\n");

        // ===== BƯỚC 2: Nhập ma trận từ bàn phím và tính tổng =====
        System.out.println("Bước 2: Nhập ma trận vuông từ người dùng và tính tổng đường chéo chính");
        System.out.print("Nhập kích thước ma trận vuông (n): ");
        int n = scanner.nextInt();

        double[][] maTranNhapTay = new double[n][n];

        // Nhập từng phần tử
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập phần tử [" + i + "][" + j + "]: ");
                maTranNhapTay[i][j] = scanner.nextDouble();
            }
        }

        // Tính tổng đường chéo chính
        double tongCheoChinh2 = 0;
        for (int i = 0; i < n; i++) {
            tongCheoChinh2 += maTranNhapTay[i][i];
        }

        System.out.println("Tổng đường chéo chính của ma trận bạn nhập là: " + tongCheoChinh2);
    }
}

