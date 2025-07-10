package lopvadoituongtrongjava;

import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Nhập chiều rộng
        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();

        // Nhập chiều cao
        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();

        // Tạo đối tượng Rectangle
        Rectangle rectangle = new Rectangle(width, height);

        // Hiển thị kết quả
        System.out.println("Your Rectangle: \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
    }
}
