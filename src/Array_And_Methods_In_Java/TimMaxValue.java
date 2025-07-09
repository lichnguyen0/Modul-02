package Array_And_Methods_In_Java;

import java.util.Scanner;

public class TimMaxValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Khởi tạo kiểu gán giá trị trực tiếp
        double[][] arr = {
                {1.2, 5.5, 3.8},
                {7.9, 2.4, 6.3},
                {4.1, 9.0, 0.5}
        };

        // Khởi tạo giá trị lớn nhất và tọa độ
        double max = arr[0][0];
        int row = 0;
        int col = 0;

        // Duyệt tìm giá trị lớn nhất
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println("Giá trị lớn nhất trong ma trận là: " + max);
        System.out.println("Tọa độ: hàng " + row + ", cột " + col);
    }
}
