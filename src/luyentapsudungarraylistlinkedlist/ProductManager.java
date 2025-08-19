package luyentapsudungarraylistlinkedlist;

import java.util.ArrayList;

public class ProductManager {

    private ArrayList<Product> products = new ArrayList<>();

    //thêm sản phẩm
    public void addProduct(Product item) {  // trong JV mọi class đều là kiểu dữ liệu tham chiếu như vậy class Product là Kiểu dữ liệu tham chiếu.
        // item là biến tham số laptrinhvien tự đặt ra
        products.add(item);
    }

    // sửa thông tin theo id
    public void editProduct(String id, String newName, double newPrice) {
        for (Product item : products) {
            if (item.getId() == id) {
                item.setName(newName);
                item.setPrice(newPrice);
                break;
            }
        }
    }


    // Xoá theo id
    public void deleteProduct(String id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                break;
            }
        }
    }

    //Hien thi danh sach san pham
    public void displayAllProducts() {
        for (Product item : products) {
            System.out.println(item);
        }
    }

    //tim kiem theo ten
    public void searchProduct(String name) {
        for (Product item : products) {
            if (item.getName().equalsIgnoreCase(name)) {
                System.out.println(item);
            }
        }
    }

    //sap xep tang dan theo gia
    public void sortAscendingByPrice() {
        for (int i = 0; i < products.size() - 1; i++) {
            for (int j = 0; j < products.size() - 1; j++) {
                if (products.get(j).getPrice() > products.get(j + 1).getPrice()) {
                    // đổi chỗ sản phẩm
                    Product temp = products.get(j);
                    products.set(j, products.get(j + 1));
                    products.set(j + 1, temp);
                }
            }
        }
    }

    // sắp xếp giảm dần theo giá
    public void sortDescendingByPrice() {
        int n = products.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (products.get(j).getPrice() < products.get(j + 1).getPrice()) {
                    Product temp = products.get(j);
                    products.set(j, products.get(j + 1));
                    products.set(j + 1, temp);
                }
            }
        }
    }

}

