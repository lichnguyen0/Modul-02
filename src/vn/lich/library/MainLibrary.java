package vn.lich.library;

import java.util.Scanner;

public class MainLibrary {
    public static void main(String[] args) {

        LibraryManager manager = new LibraryManager();
        Scanner sca = new Scanner(System.in);


        // Đọc file ngay khi khởi động
        manager.readFromFile();

        while (true) {
            System.out.println("======MENU======");
            System.out.println("1. Xem danh sách sách.");
            System.out.println("2. Thêm sách mới.");
            System.out.println("3. Cập nhật sách.");
            System.out.println("4. Xoá sách.");
            System.out.println("5. Tìm kiếm theo ID.");
            System.out.println("6. Mượn sách");
            System.out.println("7. Trả sách");
            System.out.println("0. Thoát");
            System.out.println("Chọn chức năng: ");
            int choice = Integer.parseInt(sca.nextLine());

            switch (choice) {
                case 1:
                    manager.displayAll();
                    break;
                case 2:
                    System.out.print("Nhập mã sách: ");
                    String id = sca.nextLine();
                    System.out.print("Nhập tiêu đề: ");
                    String title = sca.nextLine();
                    System.out.print("Nhập tên tác giả: ");
                    String author = sca.nextLine();
                    manager.addBook(new Book(id, title, author));
                    manager.writeToFile(); // Ghi file sau khi thêm
                    break;
                case 3:

















                 manager.writeToFile(); // Ghi file sau khi cập nhật
                    break;
                case 4:
                    System.out.print("Nhập mã sách cần xoá: ");
                    manager.deleteBook(sca.nextLine());
                    manager.writeToFile(); // Ghi file sau khi xóa
                    break;
                case 5:
                    System.out.print("Nhập mã sách cần tìm: ");
                    manager.searchById(sca.nextLine());
                    break;
                case 6:
                    System.out.print("Nhập ID sách muốn mượn:");
                    manager.borrowBook(sca.nextLine());
                    manager.writeToFile(); // Ghi file sau khi mượn

                    break;
                case 7:
                    System.out.print("Nhập ID sách muốn trả: ");
                    manager.returnbooks(sca.nextLine());
                    manager.writeToFile(); // Ghi file sau khi trả
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }
}
