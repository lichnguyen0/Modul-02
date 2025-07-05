package IntroductiontoJava;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;


public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int year;
        System.out.println("NHập số năm");
        year = scanner.nextInt();
        if (year % 4 == 0){
            if (year%100 ==0){
                if(year%400 == 0){
                    System.out.printf("%d là năm nhuận", year);
                }else{
                    System.out.printf("%d Không phải là năm nhuận");
                }
            }else{
                System.out.printf("%d là năm nhuận", year);
            }
        }else{
            System.out.printf("%d Không phải là năm nhuận", year);
        }
    }
}
