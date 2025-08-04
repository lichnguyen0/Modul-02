package com.phonebook;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactManager {
    public ArrayList<Contact> contacts;


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
            System.out.println("Khôn tìm thấy kết quả.");
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
}
