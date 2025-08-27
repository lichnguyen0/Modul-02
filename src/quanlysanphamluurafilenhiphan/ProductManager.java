package quanlysanphamluurafilenhiphan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {

    Scanner sc = new Scanner(System.in);

    private static final String FILE_NAME = "data/products.dat";


    //ghi files
    public static void writeToFile(String fileName, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            fos.close();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //đọc file
    public static List<Product> readFromFile(String fileName) {
        List<Product> products = new ArrayList<>();
        File file = new File(fileName);
        if (!file.exists()) {
            return products;
        }
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);

            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;

    }


    public  void addProducts() {
        System.out.println("Nhập id sản phẩm: ");
        int id = sc.nextInt();
        System.out.println("Nhập tên sản phẩm: ");
        String name = sc.next();
        System.out.println("Nhập giá sản phẩm: ");
        Double price = sc.nextDouble();
        System.out.println("Nhập nhà sản xuất");
        String manufacturer = sc.next();
        System.out.println("Miêu tả sản phẩm");
        String description = sc.next();
        List<Product> products = readFromFile(FILE_NAME);
        products.add(new Product(id, name, price, manufacturer, description));
        writeToFile(FILE_NAME, products);
        System.out.println("Đã thêm sản phẩm!");
    }

    public void disPlayProducts() {
        List<Product> products = readFromFile(FILE_NAME);
        if (products.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
        } else {
            System.out.println("Danh sách sản phẩm:");
            for (Product p : products) {
                System.out.println(p);
            }
        }
    }


    public void searchProduct(Scanner sc) {
        System.out.print("Nhập mã sản phẩm cần tìm: ");
        String id = sc.nextLine();
        List<Product> products = readFromFile(FILE_NAME);
        boolean found = false;
        for (Product p : products) {
            if (p.getId() == Integer.parseInt(id)) {
                System.out.println("Tìm thấy: " + p);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sản phẩm có mã: " + id);
        }
    }
}
