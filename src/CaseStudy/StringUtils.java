package CaseStudy;

import java.text.Normalizer;

public class StringUtils {
    // Chuyển chữ có dấu sang không dấu và in hoa
    public static String normalizeName(String name) {
        // Loại bỏ dấu
        String temp = Normalizer.normalize(name, Normalizer.Form.NFD);
        temp = temp.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        // Chuyển sang in hoa
        return temp.toUpperCase();
    }
}
