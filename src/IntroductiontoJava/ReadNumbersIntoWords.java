package IntroductiontoJava;

import java.util.Scanner;

public class ReadNumbersIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: hỏi số cần đọc
        System.out.print("Nhập số nguyên không âm (tối đa 3 chữ số): ");
        int number = scanner.nextInt();

        String ketQua = ""; // Chuỗi kết quả đọc thành chữ

        // Kiểm tra số có nằm ngoài khả năng không
        if (number < 0 || number > 999) {
            ketQua = "Không đủ khả năng";
        } else if (number < 10) {
            // Bước 2: đọc các số có một chữ số
            switch (number) {
                case 0: ketQua = "Không"; break;
                case 1: ketQua = "Một"; break;
                case 2: ketQua = "Hai"; break;
                case 3: ketQua = "Ba"; break;
                case 4: ketQua = "Bốn"; break;
                case 5: ketQua = "Năm"; break;
                case 6: ketQua = "Sáu"; break;
                case 7: ketQua = "Bảy"; break;
                case 8: ketQua = "Tám"; break;
                case 9: ketQua = "Chín"; break;
            }
        } else if (number < 20) {
            // Bước 3: đọc số có hai chữ số nhỏ hơn 20
            switch (number) {
                case 10: ketQua = "Mười"; break;
                case 11: ketQua = "Mười một"; break;
                case 12: ketQua = "Mười hai"; break;
                case 13: ketQua = "Mười ba"; break;
                case 14: ketQua = "Mười bốn"; break;
                case 15: ketQua = "Mười lăm"; break;
                case 16: ketQua = "Mười sáu"; break;
                case 17: ketQua = "Mười bảy"; break;
                case 18: ketQua = "Mười tám"; break;
                case 19: ketQua = "Mười chín"; break;
            }
        } else if (number < 100) {
            // Bước 4: đọc số có hai chữ số từ 20 đến 99
            int hangChuc = number / 10;
            int hangDonVi = number % 10;

            // Đọc hàng chục
            switch (hangChuc) {
                case 2: ketQua = "Hai mươi"; break;
                case 3: ketQua = "Ba mươi"; break;
                case 4: ketQua = "Bốn mươi"; break;
                case 5: ketQua = "Năm mươi"; break;
                case 6: ketQua = "Sáu mươi"; break;
                case 7: ketQua = "Bảy mươi"; break;
                case 8: ketQua = "Tám mươi"; break;
                case 9: ketQua = "Chín mươi"; break;
            }

            // Đọc hàng đơn vị
            if (hangDonVi != 0) {
                switch (hangDonVi) {
                    case 1: ketQua += " mốt"; break;
                    case 4: ketQua += " tư"; break;
                    case 5: ketQua += " lăm"; break;
                    default:
                        switch (hangDonVi) {
                            case 2: ketQua += " hai"; break;
                            case 3: ketQua += " ba"; break;
                            case 6: ketQua += " sáu"; break;
                            case 7: ketQua += " bảy"; break;
                            case 8: ketQua += " tám"; break;
                            case 9: ketQua += " chín"; break;
                        }
                        break;
                }
            }
        } else {
            // Bước 5: đọc số có ba chữ số
            int hangTram = number / 100;
            int phanDu = number % 100;
            int hangChuc = phanDu / 10;
            int hangDonVi = phanDu % 10;

            // Đọc hàng trăm
            switch (hangTram) {
                case 1: ketQua = "Một trăm"; break;
                case 2: ketQua = "Hai trăm"; break;
                case 3: ketQua = "Ba trăm"; break;
                case 4: ketQua = "Bốn trăm"; break;
                case 5: ketQua = "Năm trăm"; break;
                case 6: ketQua = "Sáu trăm"; break;
                case 7: ketQua = "Bảy trăm"; break;
                case 8: ketQua = "Tám trăm"; break;
                case 9: ketQua = "Chín trăm"; break;
            }

            // Nếu phần chục đơn vị khác 0 thì thêm chữ "lẻ" hoặc đọc tiếp
            if (phanDu == 0) {
                // không thêm gì cả, ví dụ 300
            } else if (phanDu < 10) {
                ketQua += " lẻ";
                switch (hangDonVi) {
                    case 1: ketQua += " một"; break;
                    case 2: ketQua += " hai"; break;
                    case 3: ketQua += " ba"; break;
                    case 4: ketQua += " bốn"; break;
                    case 5: ketQua += " năm"; break;
                    case 6: ketQua += " sáu"; break;
                    case 7: ketQua += " bảy"; break;
                    case 8: ketQua += " tám"; break;
                    case 9: ketQua += " chín"; break;
                }
            } else if (phanDu < 20) {
                switch (phanDu) {
                    case 10: ketQua += " mười"; break;
                    case 11: ketQua += " mười một"; break;
                    case 12: ketQua += " mười hai"; break;
                    case 13: ketQua += " mười ba"; break;
                    case 14: ketQua += " mười bốn"; break;
                    case 15: ketQua += " mười lăm"; break;
                    case 16: ketQua += " mười sáu"; break;
                    case 17: ketQua += " mười bảy"; break;
                    case 18: ketQua += " mười tám"; break;
                    case 19: ketQua += " mười chín"; break;
                }
            } else {
                // từ 20 đến 99
                switch (hangChuc) {
                    case 2: ketQua += " hai mươi"; break;
                    case 3: ketQua += " ba mươi"; break;
                    case 4: ketQua += " bốn mươi"; break;
                    case 5: ketQua += " năm mươi"; break;
                    case 6: ketQua += " sáu mươi"; break;
                    case 7: ketQua += " bảy mươi"; break;
                    case 8: ketQua += " tám mươi"; break;
                    case 9: ketQua += " chín mươi"; break;
                }

                // Đọc hàng đơn vị nếu khác 0
                if (hangDonVi != 0) {
                    switch (hangDonVi) {
                        case 1: ketQua += " mốt"; break;
                        case 4: ketQua += " tư"; break;
                        case 5: ketQua += " lăm"; break;
                        default:
                            switch (hangDonVi) {
                                case 2: ketQua += " hai"; break;
                                case 3: ketQua += " ba"; break;
                                case 6: ketQua += " sáu"; break;
                                case 7: ketQua += " bảy"; break;
                                case 8: ketQua += " tám"; break;
                                case 9: ketQua += " chín"; break;
                            }
                            break;
                    }
                }
            }
        }

        // In kết quả
        System.out.println("Đọc là: " + ketQua);
    }
}
