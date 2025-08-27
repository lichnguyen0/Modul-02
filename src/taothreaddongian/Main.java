package taothreaddongian;

public class Main {
    public static void main(String[] args) {


        NumberGenerator generator1 = new NumberGenerator();
        NumberGenerator generator2 = new NumberGenerator();

        Thread thread1 = new Thread(generator1, "Thread-1");
        Thread thread2 = new Thread(generator2, "Thread-2");

        thread1.setPriority(Thread.MAX_PRIORITY); // ưu tiên cao
        thread2.setPriority(Thread.MIN_PRIORITY); // ưu tiên thấp

        //Bắt đầu 2 thread
        thread1.start();
        thread2.start();
    }
}