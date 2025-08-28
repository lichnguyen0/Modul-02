package validatesodienthoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SdtValidate {

    private static final String PHONE_REGEX = "^\\(\\d{2}\\)-\\(\\d{10}\\)$";
    private static final Pattern PATTERN_PHONE = Pattern.compile(PHONE_REGEX);

    public static boolean validate(String phone) {
        Matcher matcher = PATTERN_PHONE.matcher(phone);
        return matcher.matches();
    }

    public static void main(String[] args) {

        System.out.println(validate("(84)-(0983718497)")); // true

        System.out.println(validate("(i7)-(0123456789)"));   // false chứa chữ
    }
}
