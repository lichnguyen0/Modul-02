package Array_And_Methods_In_Java;

import java.util.Scanner;

public class XoaPhanTuMang {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //khai bao mang  va nhap so nguyen n từ bàn phím
        System.out.println("Nhập số lượng phần tử");
        int n = scan.nextInt();
        int[] arr = new int[n];  // khởi tạo mảng int có phần tử n nhập từ bàn phím

        for (int i = 0; i < n; i++) {  //dùng for để duyệt mảng và gán giá trị cho mảng
            System.out.print("Nhập phần tử arr [" + i + "]:");
            arr[i] = scan.nextInt();
        }
        //Nhập phần tử cần xoá
        System.out.println("Nhập phần tử cần xoá");
        int x = scan.nextInt();

        // tìm vị trí cần xoá
        int index_dex = -1;  // khai báo biến index_dex kiểu dữ liệu int có giá trị -1 (mục đích -1 Chưa tìm thấy phần tử cần tìm)
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                index_dex = i;
                break;
            }
        }
        // in ra thông báo nếu ko tìm thấy
        if (index_dex == -1) {
            System.out.println("Phần tử" + x + "Không tồn tại trong mảng.");
        } else {
            for (int i = index_dex; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;

            // in mảng sau khi xoá
            System.out.println("Mảng sau khi xoá phần tử " + x + ":");
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }
        }


    }
}
