package caidatthuattoansapxepchen;

public class CaiDatSapXepChen {

    public void insertionSort(int[] list) {

        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;

            //di chuyển mảng sang phải
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }
            //lưu mảng chèn vào vị trí
            list[j + 1] = key;
        }
    }

    public void displayArray(int[] list) {
        for (int out : list) {
            System.out.print(out + " ");
        }
    }
}
