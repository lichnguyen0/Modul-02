package thuchanhsudunglopnumberformatexception;

import java.util.Scanner;

public class CalculationExample {
 // bài tập: Sử dụng lớp NumberFormatException
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = sc.nextInt();
        System.out.println("Hãy nhập y: ");
        int y = sc.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);

    }

    //phương thức calculate
    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        } catch (Exception e) { //<-----------------
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage()); //chú ý dòng này sử dụng System.err luồng chuẩn để in thông báo lỗi, chứ không phải System.out
                                                                      //• getMessage() là một phương thức của lớp Throwable (mà Exception kế thừa).
                                                                      //• Nó trả về chuỗi mô tả ngắn gọn về nguyên nhân ngoại lệ.
        }
    }
}

/* giải thích: chú ý vào dòng 30, mặc dù bài tập này là "Sử dụng lớp kiểu NumberFormatException" cụ thể
*  nhưng điều kiện của nó lại là Exception e. Vì sao catch (Exception e) mà không phải NumberFormatException e?
* Trong Java, mọi ngoại lệ (Exception) đều là con của lớp cha Exception.
* Nếu bạn viết: catch (NumberFormatException e) { ... }
→ Chỉ bắt được ngoại lệ sai định dạng số. Ví dụ: nhập "abc" thay vì "123".
* Nếu bạn viết: catch (Exception e) { ... }
→ Bắt được tất cả các loại ngoại lệ (ArrayIndexOutOfBounds, NullPointerException, IOException, NumberFormatException, v.v).
* Vì vậy:
catch (NumberFormatException e) = bắt cụ thể → phù hợp khi bạn biết chính xác lỗi nào sẽ xảy ra.
catch (Exception e) = bắt tổng quát tự động → phù hợp khi bạn muốn đảm bảo chương trình không dừng lại vì bất kỳ lỗi nào, hoặc khi bạn chưa chắc lỗi gì có thể phát sinh.
 Lưu ý: Trong thực tế, lập trình viên thường bắt cụ thể trước rồi mới để một catch (Exception e) ở cuối để gom những lỗi khác.
 * */
