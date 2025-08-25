package thuchanhtinhtongcacsotrongfiletext;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Nhập đường dẫn file: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();

        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText(path);
    }
}

//link vị trí file để chạy bài:  C:\Users\DungG\Java\Module-02\src\thuchanhtinhtongcacsotrongfiletext\numbers.txt