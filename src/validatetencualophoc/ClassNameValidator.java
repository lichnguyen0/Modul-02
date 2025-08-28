package validatetencualophoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameValidator {

    private static final String CLASS_REGEX = "^[CAP]\\d{4}[GHIK]$"; //tạo một biểu thức chính quy (Regex) để validate
    private static final Pattern PATTERN = Pattern.compile(CLASS_REGEX); // Pattern là lớp trong Java (java.util.regex.Pattern), dùng để biên dịch (compile) Regex thành một đối tượng có thể tái sử dụng nhiều lần.

    public static boolean validate(String className) {
        Matcher matcher = PATTERN.matcher(className); //gọi phương thức .matcher Kiểm tra toàn bộ chuỗi nhập vào có khớp với mẫu Regex (định dạng validate) hay không.
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(validate("C0232K"));
        System.out.println(validate("A0232I"));
        System.out.println(validate("P1234I"));

        System.out.println(validate("M0318G"));
        System.out.println(validate("P0323A"));
        System.out.println(validate("C123"));
    }
}
