public class SoNguyenTo {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là:");

        for (int n = 2; n < 100; n++) {
            boolean laSoNguyenTo = true;

            // Kiểm tra số nguyên tố
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    laSoNguyenTo = false;
                    break;
                }
            }

            if (laSoNguyenTo) {
                System.out.print(n + " ");
            }
        }

        System.out.println(); // Xuống dòng sau khi in xong
    }
}
