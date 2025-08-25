package docfile.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadCVSFile {
    public static void main(String[] args) {

        String filePath = "data/country.csv"; // đườn dẫn file csv
        ArrayList<Country> countryList = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineArray = line.split(",");
                int id = Integer.parseInt(lineArray[0]);
                String code = lineArray[1].replaceAll("\"", "").trim();
                String name = lineArray[2].replaceAll("\"", "").trim();

                Country country = new Country(id, code, name);
                countryList.add(country);

            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
// Hiển thị danh sách quốc gia
        for (Country c : countryList) {
            System.out.println(c);

        }
    }
}