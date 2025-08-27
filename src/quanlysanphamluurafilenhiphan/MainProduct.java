package quanlysanphamluurafilenhiphan;

import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProductManager manager = new ProductManager();
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    manager.addProducts();   // Gọi phương thức thêm sản phẩm
                    break;            // Thoát khỏi switch sau khi thực hiện xong case này

                case 2:
                    manager.disPlayProducts(); // Gọi phương thức hiển thị sản phẩm
                    break;

                case 3:
                    manager.searchProduct(sc); // Gọi phương thức tìm kiếm sản phẩm
                    break;

                case 0:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }
        }while (choice != 0);
    }
}




