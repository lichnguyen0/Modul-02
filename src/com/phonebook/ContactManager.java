package com.phonebook;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactManager {
    public ArrayList<Contact> contacts;

    private static final String FILE_NAME = "C:\\Users\\DungG\\Java\\Module-02\\src\\file\\contact.txt";


    //contruc
    public ContactManager() {
        contacts = new ArrayList<>();
    }

    //them lien he
    public void addContact(Contact c) {
        contacts.add(c);
        System.out.println("Đã thêm thành công");
    }

    //cpa nhat lien he
    public void updateContact(String phone) {
        for (Contact c : contacts) {
            if (c.getPhoneNumber().equals(phone)) {
                Scanner sca = new Scanner(System.in);
                System.out.print("Nhập tên mới: ");
                c.setName(sca.next());
                System.out.print("Nhập email mới: ");
                c.setEmail(sca.next());
                System.out.println("Cập nhật thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy số điện thoại");
    }

    // Xoa lien he
    public void deleteContact(String phone) {
        Scanner sca = new Scanner(System.in);
        for (Contact c : contacts) {
            if (c.getPhoneNumber().equals(phone)) {
                System.out.print("Bạn có muốn xoá? (Y/N): ");
                String confirm = sca.next();
                if (confirm.equalsIgnoreCase("Y")) {
                    contacts.remove(c);
                    System.out.println("Đã xoá xong.");
                } else {
                    System.out.println("Huỷ xoá.");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy số điện thoại.");
    }

    //Tim kiem theo ten
    public void searchByName(String keyword) {
        boolean found = false;
        for (Contact c : contacts) {
            if (c.getName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(c);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy kết quả.");
        }
    }

    //Hien thi all
    public void displayAll() {
        if (contacts.isEmpty()) {
            System.out.println("Danh bạ trống.");
        } else {
            System.out.println("Danh bạ: ");
            int i = 1;
            for (Contact c : contacts) {
                System.out.println(i + ". " + c);
                i++;
            }
        }
    }
    // Ghi danh bạ ra file
    public void readFromFile() {
        contacts.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Contact c = Contact.fromDataString(line);
                if (c != null) {
                    contacts.add(c);
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
            for (Contact c : contacts) {
                writer.write(c.toDataString());
                writer.newLine();
            }
            System.out.println(">> Đã ghi dữ liệu vào file.");
        } catch (IOException e) {
            System.out.println(">> Lỗi ghi file: " + e.getMessage());
        }
    }
    //còn thiếu phần đọc & ghi file
}
