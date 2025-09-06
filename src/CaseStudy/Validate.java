package CaseStudy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {

    //Regex ID
    private static final String ID_REGEX = "^[S][V]\\d{4}$";

    //Regex Email
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    //regex sdt
    private static final String PHONE_REGEX = "^0[89]\\d{8}$";

    public static boolean validateId(String id) {
        return checkRegex(ID_REGEX, id);
    }

    public static boolean validateEmail(String email) {
        return checkRegex(EMAIL_REGEX, email);
    }

    public static boolean validatePhone(String phone) {
        return checkRegex(PHONE_REGEX, phone);
    }

    // Hàm dùng chung để check
    private static boolean checkRegex(String regex, String input) {
        if (input == null) return false;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}

