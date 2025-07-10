package Bai_tap;

public class TaoLopVaDoiTuong {
    public static void main(String[] args) {

        // phần đang bị comment bên dưới là một cách khác để khởi tạo đối tượng Student mà không dùng constructor có tham số,
        // mà dùng constructor mặc định (không tham số) và gán giá trị thủ công cho từng thuộc tính.
        // nếu sử dụng construstor thì thôi cái này không sẽ bị trùng.
//        Student s1  = new Student();
//        s1.name= "Lan";
//        s1.age = 20;
//        s1.id = "SV001";
        Student s1 = new Student("Lan", 20, "SV001");  //đây là construstor trong main
        s1.displayInfo();
    }
}

class Student{ //nếu tách riêng ra hai file thì phải thêm public vào đầu class còn viết liền thì bỏ public viết liền như này
    String name; // nếu muốn đóng gói đặt biến private vào các biến name, age ,id. vd: private String name;
    int age;
    String id;

    Student (String name, int age, String id){    //đây là constructor
        this.name = name;
        this.age = age;
        this.id = id;
    }
//    public Student() {// Constructor không tham số (nếu bạn muốn dùng cách gán thủ công trên main) sử dụng cho cách tách ra 2 files
//    }

// đóng gói
/*getter

    public String getName(){
      return name;
 }

 //setter
 public void setName(String name){
 this,name= name;
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

 */









    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("ID: "+id);
    }
}



//mục hướng dẫn:
//1.constructer:
//Để thêm constructor  có 2 cách:
//1. Bạn viết constructor bên trong lớp Student, trước hoặc sau các phương thức khác (như displayInfo()), không nằm trong main.

//2. Dùng constructor trong main
//Bạn không cần gán giá trị từng dòng như trước nữa. Chỉ cần:
//Student s1 = new Student("Lan", 20, "SV001");
//s1.displayInfo();

/*
*  2.Hướng dẫn đóng gói:
* - Ẩn dữ liệu bên trong lớp (không cho truy cập trực tiếp).
- Chỉ cho phép truy cập, chỉnh sửa dữ liệu thông qua phương thức (get/set).
 - Giúp dữ liệu an toàn, dễ kiểm soát.
 * - Làm thế nào để đóng gói trong Java?
 Bước	Việc cần làm
1	Đặt private cho các biến (name, age, id)
2	Tạo getter để lấy giá trị
3	Tạo setter để thay đổi giá trị
*/
