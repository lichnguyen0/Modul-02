package vn.lich.library;

import com.phonebook.Contact;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {

    public ArrayList<Book> books;


    //duong dan
    private static final String FILE_NAME = "C:\\Users\\DungG\\Java\\Module-02\\src\\file\\book.txt";

    //ham khoi tao
    public LibraryManager() {
        books = new ArrayList<>();
    }

    //add sach
    public void addBook(Book b) {
        books.add(b);
        System.out.println("Sách đã được thêm!");
    }

    //update sách
    public void updateBook(String bookid) {
        for (Book b : books) {
            if (b.getId().equalsIgnoreCase(bookid)) {
                Scanner sca = new Scanner(System.in);
                System.out.print("Nhập tiêu đề mới: ");
                b.setTitle(sca.nextLine());
                System.out.print("Nhập tên tác giả mới: ");
                b.setAuthor(sca.nextLine());
                System.out.println("Cập nhật thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy sách hợp lệ với ID vừa nhập. ");
    }


    //xoá book
    public void deleteBook(String idbook) {
        Scanner sca = new Scanner(System.in);
        for (Book b : books) {
            if (b.getId().equalsIgnoreCase(idbook)) {
                System.out.println("Bạn có muốn xoá nó không (Y/N)");
                String confirm = sca.next();
                if (confirm.equalsIgnoreCase("Y")) {
                    books.remove(b);
                    System.out.println("xoá thành công");
                } else {
                    System.out.println("Huỷ xoá");
                }
                return;
            }
        }
        System.out.println(" Không tìm thấy ID sách đã nhập.");
    }

    //tìm book theo id
    public void searchById(String idbook) {
        boolean found = false;
        for (Book b : books) {
            if (b.getId().toLowerCase().contains(idbook.toLowerCase())) {
                System.out.println(b);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy kết quả");
        }
    }

    //hien thi tat ca ket qua
    public void displayAll() {
        if (books.isEmpty()) {
            System.out.println("Không có Sách nào trong danh sách.");
        } else {
            System.out.println("Sách: ");
            int i = 1;
            for (Book b : books) {
                System.out.println(i + ". " + b);
                i++;
            }
        }
    }

    // muon
    public void borrowBook(String idbook) {
        for (Book b : books) {
            if (b.getId().equalsIgnoreCase(idbook)) {
                if (!b.isBorrowed()) {
                    b.setBorrowed(true);
                    System.out.println("bạn đã mượn sách " + b.getTitle().toUpperCase()
                            + " Thành công!");
                } else {
                    System.out.println("Sách đã được mượn trước đó.");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy sách nào có Id " + idbook);
    }

    //tra sach
    public void returnbooks(String idbook) {
        for (Book b : books) {
            if (b.getId().equalsIgnoreCase(idbook)) {
                if (b.isBorrowed()) {
                    b.setBorrowed(false);
                    System.out.println("Bạn đã trả sách: " + b.getTitle().toUpperCase()
                    );
                } else {
                    System.out.println("Sách này chưa được mượn.");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy sách có Id " + idbook);
    }


    //doc file
    public void readFromFile() {
        File file = new File("book.txt");
        books.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Book b = Book.fromDataString(line);
                if (b != null) {
                    books.add(b);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(">> File chưa tồn tại. Sẽ tạo file mới khi ghi.");
        } catch (IOException e) {
            System.out.println(">> Lỗi khi đọc file: " + e.getMessage());
        }
    }

    // Ghi file
    public void writeToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Book b : books) {
                writer.write(b.toDataString());
                writer.newLine();
            }
            System.out.println(">> Đã ghi dữ liệu vào file.");
        } catch (IOException e) {
            System.out.println(">> Lỗi ghi file: " + e.getMessage());
        }
    }

}
