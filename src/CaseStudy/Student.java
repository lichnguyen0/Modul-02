package CaseStudy;

public class Student {
    private String name;
    private int age;
    private String id;
    private String email;
    private String phoneNumber;
    private float GPA;


    public Student(String name, int age, String id, String email, String phoneNumber, float GPA) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.GPA = GPA;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}
