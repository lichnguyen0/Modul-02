package Array_And_Methods_In_Java;

import java.util.Scanner;

public class DemKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo chuỗi cho trước
        String chuoi = "Lap trinh Java rat thu vi";

        // Bước 2: Nhập ký tự cần đếm từ bàn phím
        System.out.print("Nhập một ký tự để đếm: ");
        char kyTu = scanner.next().charAt(0);

        // Bước 3: Khởi tạo biến đếm
        int count = 0;

        // Bước 4: Duyệt từng ký tự trong chuỗi
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                count++;
            }
        }

        // Bước 5: In ra kết quả
        System.out.println("Số lần xuất hiện của ký tự '" + kyTu + "' là: " + count);
    }
}
