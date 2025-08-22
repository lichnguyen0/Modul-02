package sudunglopillegalTriangleException;


//trong Java có sẵn nhiều loại Exception nhưng không có loại nào mang ý nghĩa "tam giác không hợp lệ" (IllegalTriangleException).
// Vì vậy lập trình viên tự định nghĩa ngoại lệ riêng để mô tả đúng ngữ cảnh lỗi.
// đây gọi là Tạo ngoại lệ tùy chỉnh kế thừa từ Exception

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}
