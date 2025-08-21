package caidatthuattoansapxepchen;

public class Main {

    public static void main(String[] args) {

        CaiDatSapXepChen caidat = new CaiDatSapXepChen();

        int[] list = {9, 10, 5, 1, 6, 4};
        //hiển thị mảng ban đầu
        System.out.println("Mảng ban đầu: ");
        caidat.displayArray(list);

        //sắp xếp
        caidat.insertionSort(list);

        //hiển thị
        System.out.println("\nMảng sau khi sắp xếp");
        caidat.displayArray(list);
    }
}
