package thuchanhtimgiatrilonnhatvaghirafile;

import java.util.List;

public class FindMaxValue {

    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFileText("data/numbers.txt");  //quan trọng tạm một thư mục bằng cấp với scr rồi bỏ file txt vào
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("data/result.txt", maxValue); //quan trọng tạm một thư mục bằng cấp với scr rồi bỏ file txt vào
    }
}
