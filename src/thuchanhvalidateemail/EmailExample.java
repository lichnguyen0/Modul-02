package thuchanhvalidateemail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {

    private static Pattern pattern; // Pattern là lớp trong java.util.regex
                                    //• Biểu diễn mẫu regex đã biên dịch.
                                    //• Tạo ra từ phương thức Pattern.compile(regex).

    private Matcher matcher; //kiểu dữ liệu là Matcher
   /* Được tạo ra từ một Pattern và một chuỗi cần kiểm tra.
    • Nó là công cụ để so khớp (match) chuỗi với regex.
   • Cho phép kiểm tra, tìm kiếm, và thay thế chuỗi theo regex.*/

    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public EmailExample() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
