package comm.casestudy.dictionary;

public class Definition {

    private DefinitionType type; // loại nội dung định nghĩa
    private String content; //Nội dung định nghĩa
    private String example; // ví dụ
    private String exampleMeaning; // nghĩa ví dụ nếu có

    public Definition(DefinitionType type, String content, String example, String exampleMeaning) {
        this.type = type;
        this.content = content;
        this.example = example;
        this.exampleMeaning = exampleMeaning;
    }

    public Definition() {};

    //get & set
    public DefinitionType getType() {//here
        return type;
    }
    public void setType(DefinitionType type) {
        this.type = type;
    }


    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }


    public String getExample() {
        return example;
    }
    public void setExample(String example) {
        this.example = example;
    }

    public String getExampleMeaning() {
        return exampleMeaning;
    }
    public void setExampleMeaning(String exampleMeaning) {
        this.exampleMeaning = exampleMeaning;
    }

/*@Override
    public String toString() {

}*/






}
