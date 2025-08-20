package caithuattoantimkiemnhiphankhongsudungquyde;

public class BinarySearch {

    // mảng này khởi tạo, các phân tử đã được đúng thứ tự từ bé -> lơn
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    static int binarySearch(int[] list, int key) {
        int low = 0;
        int hight = list.length - 1;
        while (hight >= low) {
            int mid = (low + hight) / 2;
            if (key < list[mid]) // mid là chỉ so ở giữa của phần tử bị chia đôi
                hight = mid - 1; // thu hẹp về bên trái ( hight = phần tử cuối cùng mid)
            else if (key == list[mid])
                return mid; // còn nếu tìm thấy thì trả về vị trí
            else
                low = mid + 1; // thu hẹp vào bên hải
        }
        return -1; // không tìm thấy
    }

    //lưu ý đây là một list đươc tạo có các phần tử có thứ tự lần lượt bé -> lớn có thể sử dụng luôn cách làm trên
    // còn đối với list hỗn hợp không đúng thứ tự cao thâp thì phải dùng thuật toán sắp xếp rồi mới timd kiếm
}


