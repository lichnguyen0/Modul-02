package IntroductiontoJava;

import java.util.Scanner;

public class displayLoichao {
    public static void main(String[] args) {
        System.out.println("Enter your name : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.print("Hello: "+ name);
    }
}
