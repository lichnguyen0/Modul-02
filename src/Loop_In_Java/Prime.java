package Loop_In_Java;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào một số:");
        int number = scanner.nextInt();

        if (number < 2) {

            System.out.println(number+ " Không phải là số nguyên tố");
        }else{
            boolean check = true;
            int i = 2;
            while (i<= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number+ " Là số nguyên tố");
            else
                System.out.println(number+ " Không phải là số nguyên tố");
        }

    }
}
