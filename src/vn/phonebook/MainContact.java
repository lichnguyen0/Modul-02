package vn.phonebook;

import java.util.Scanner;

public class MainContact {
    public static void main(String[] args) {

        ContactManager manager = new ContactManager();
        Scanner sca = new Scanner(System.in);

        // Đọc file ngay khi khởi động
        manager.readFromFile();


        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm theo tên");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(sca.nextLine());

            switch (choice) {
                case 1:
                    manager.displayAll();
                    break;
                case 2:
                    System.out.print("Nhập số điện thoại: ");
                    String phone = sca.nextLine();
                    System.out.print("Nhập họ tên: ");
                    String name = sca.nextLine();
                    System.out.print("Nhập email: ");
                    String email = sca.nextLine();
                    manager.addContact(new Contact(phone, name, email));
                    manager.writeToFile(); // Ghi file sau khi thêm
                    break;
                case 3:
                    System.out.print("Nhập số điện thoại cần cập nhật: ");
                    manager.updateContact(sca.nextLine());
                    manager.writeToFile(); // Ghi file sau khi cập nhật
                    break;
                case 4:
                    System.out.print("Nhập số điện thoại cần xóa: ");
                    manager.deleteContact(sca.nextLine());
                    manager.writeToFile(); // Ghi file sau khi xóa
                    break;
                case 5:
                    System.out.print("Nhập từ khóa tên: ");
                    manager.searchByName(sca.nextLine());
                    break;
                case 0:
                    System.out.println(">> Thoát chương trình.");
                    return;
                default:
                    System.out.println(">> Lựa chọn không hợp lệ.");
            }
        }
    }
}
