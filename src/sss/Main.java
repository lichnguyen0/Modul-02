package sss;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // Khởi tạo adapter - implement CollectionOperations
        CollectionOperations adapter = new CollectionUtilsAdapter();

        // Tạo client với adapter
        Client client = new Client(adapter);

        // Tạo tập hợp số nguyên
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(7);
        numbers.add(33);
        numbers.add(18);

        // In giá trị lớn nhất trong tập hợp
        client.printMaxValue(numbers);
    }
}