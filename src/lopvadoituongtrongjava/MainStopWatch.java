package lopvadoituongtrongjava;

import java.util.Random;

public class MainStopWatch {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        Random random = new Random();

        // Khởi tạo mảng ngẫu nhiên
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000); // số từ 0 đến 99999
        }

        StopWatch stopwatch = new StopWatch();
        stopwatch.start();

        // Thuật toán selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Hoán đổi phần tử
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        stopwatch.stop();

        System.out.println("Thời gian chạy selection sort: " + stopwatch.getElapsedTime() + " ms");
    }
}
