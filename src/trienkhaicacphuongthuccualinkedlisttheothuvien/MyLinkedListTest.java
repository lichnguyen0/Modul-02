package trienkhaicacphuongthuccualinkedlisttheothuvien;

public class MyLinkedListTest {
    public static void main(String[] args) {

        MyLinkedList<String> list = new MyLinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.addFirst("Orange");

        System.out.print("Danh sách: ");
        list.printList();

        System.out.println("Phần tử đầu tiên: " + list.get(0));
        System.out.println("Phần tử thứ 2: " + list.get(1));


        System.out.println("Có 'Banana' không? " + list.contains("Banana"));

        System.out.println("Xóa phần tử 1: " + list.remove(1));
        System.out.print("Danh sách sau xóa: ");
        list.printList();

        System.out.println("Số phần tử: " + list.size());
    }
}

