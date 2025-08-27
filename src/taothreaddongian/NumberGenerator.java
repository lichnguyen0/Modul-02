package taothreaddongian;

public class NumberGenerator implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            //in ra 10 số đầu tiên và hashcode của đối tuowngj
            System.out.println("Thread " + Thread.currentThread().getName() +
                    " - Generator hashCode: " + this.hashCode() +
                            " - Number: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
