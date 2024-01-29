import java.io.File;
import java.io.FileWriter;

public class BubleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 2, 9, 1, 0, 104, 45, 35, 88, 89};
        arr = sortBuble(arr);
//        FileWriter supe = new FileWriter("log.txt");
//        supe.write(int a = 24);



        for (int elem : arr)
            System.out.println(elem);
    }
    public static int[] sortBuble (int[] arr){
        int tempElem;
        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    tempElem = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tempElem;

                }
            }
        }
        return arr;
    }


}
