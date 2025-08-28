package thuchanhvalidateemail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {

    private static Pattern pattern; // Pattern là lớp trong java.util.regex
    private Matcher matcher; //kiểu dữ liệu là Matcher

    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public EmailExample() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
