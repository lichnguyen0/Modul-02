package timchuoitangdancododailonnhat;

import java.util.Scanner;

public class AscendingOrder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // nhap chuoi
        System.out.print("Nhập vào một chuỗi: ");
        String n = sc.nextLine();

        // xuất kết quả
        String result = FindAscendingSeries(n);
        System.out.println("Chuỗi có độ dài tăng dần là: " + result);

        sc.close();
    }

    public static String FindAscendingSeries(String find) {
        String result = "";
        if (!find.isEmpty()) {
            result += find.charAt(0);
        }

        for (int i = 1; i < find.length(); i++) {
            if (find.charAt(i) > result.charAt(result.length() - 1)) {
                result += find.charAt(i); //nối
            }
        }
        return result;
    }
}