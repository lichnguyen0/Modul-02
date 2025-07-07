package Loop_In_Java;

import java.util.Scanner;

public class HienThiSoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int count = 0;
        int n = 2;

        System.out.println("Nhập một số nguyên từ bàn phím");
        number = sc.nextInt();

        while (count < number) {
            boolean isPrime = true;

            if (number < 2) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println(n + " ");
                count++;
            }
            n++;
        }

    }
}
