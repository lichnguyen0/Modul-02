package thuchanhsudungloparrayindexoutofboundsexception;

import java.util.Random;

public class ArrayExample {

    //phương thức trả về mảng số nguyên ngẫu nhiên 0 -100
    public Integer[] CreateRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];

        System.out.println("Danh sách các phần tử của mảng: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]+" ");
        }
        return arr;
    }
}
