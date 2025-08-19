package luyentapsudungarraylistlinkedlist;

public class MainProduct {
    public static void main(String[] args) {

        ProductManager manager = new ProductManager();

        //them san pham
        manager.addProduct(new Product("1HTM", "Laptop", 1200));
        manager.addProduct(new Product("2HTM", "Iphone", 1300));
        manager.addProduct(new Product("3HTM", "Samsung", 1400));
        manager.addProduct(new Product("4HTM", "Huawei", 1500));
        manager.addProduct(new Product("5HTM", "Vivo", 1600));
        manager.addProduct(new Product("6HTM", "Google Pixel ", 1700));
        System.out.println("\nDanh sách sản phẩm");
        manager.displayAllProducts();

        //Sua thong tin theo Id
        manager.editProduct("4HTM", "Xiaomi", 1800);
        manager.editProduct("3HTM", "Oppo", 1900);
        System.out.println("\nSau khi sửa.");
        manager.displayAllProducts();

        // xoa theo id
        manager.deleteProduct("6HTM");
        System.out.println("\nSau khi xoá");
        manager.displayAllProducts();

        // tim kem san pham theo ten
        System.out.println("\nTìm kiếm theo tên: "+ "Huawei");
        manager.searchProduct("Huawei");


        //sap xep tang dan
        manager.sortAscendingByPrice();
        System.out.println("\nSắp xếp tăng dần theo giá");
        manager.displayAllProducts();


        //sap xep giam dan
        manager.sortDescendingByPrice();
        System.out.println("\nSắp xếp giảm dần theo giá");
        manager.displayAllProducts();
    }
}
