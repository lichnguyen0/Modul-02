package com.phonebook;

import java.util.Scanner;

public class MainContact {
    public static void main(String[] args) {

        ContactManager manager = new ContactManager();
        Scanner sca = new Scanner(System.in);

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
                    break;
                case 3:
                    System.out.print("Nhập số điện thoại cần cập nhật: ");
                    manager.updateContact(sca.nextLine());
                    break;
                case 4:
                    System.out.print("Nhập số điện thoại cần xóa: ");
                    manager.deleteContact(sca.nextLine());
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
