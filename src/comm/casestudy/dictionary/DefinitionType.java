package comm.casestudy.dictionary;

public class DefinitionType {

    private static final String PRONOUN = "PRONOUN";
    private static final String ADJECTIVE = "ADJECTIVE";
    private static final String VERB = "VERB";
    private static final String SYNONYMOUS = "SYNONYMOUS";

    public static String toOption(String option) {
        switch (option.toLowerCase()) {
            case "pronoun":
            case "p":
                return PRONOUN;
            case "adjective":
            case "a":
                return ADJECTIVE;
            case "verb":
            case "v":
                return VERB;
            case "synonymous":
            case "s":
                return SYNONYMOUS;
            default:
                System.out.println("Loại định nghĩa không hợp lệ "+option);
                return null;
        }
    }
}
