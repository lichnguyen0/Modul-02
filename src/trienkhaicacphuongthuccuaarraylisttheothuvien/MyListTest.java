package trienkhaicacphuongthuccuaarraylisttheothuvien;

public class MyListTest {
    public static void main(String[] args) {

        MyList<String> list = new MyList<>();

        list.add("A");
        list.add("B");
        list.add(1, "C");

        System.out.println("Size: " + list.size());
        System.out.println("Get(1): " + list.get(1));

        list.remove(0);
        System.out.println("Contains A? " + list.contains("A"));

        MyList<String> list2 = list.clone();
        list2.clear();
        System.out.println("List2 size: " + list2.size());
    }
}
