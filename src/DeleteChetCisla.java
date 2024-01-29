import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteChetCisla {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[]{1, 4, 5, 2, 13, 45, 23, 424, 7, 18};
        arr1 = new Integer[]{4, 5, 6,  7, 8, 8, 1, 4, 5, 6, 7, 8, 8, 8 , 10, 10,  9, 10};
        removeEvenNumbers(arr1);

    }

    public static void removeEvenNumbers(Integer[] arr) {
        List<Integer> tata = new ArrayList<>(Arrays.asList(arr));
//        System.out.println(tata.toString());

        for (int i = 0; i < tata.size(); i++){
            if (tata.get(i) % 2 == 0){
                tata.remove(i);
                i--;

            }
        }
        arr = tata.toArray(new Integer[tata.size()]);
        System.out.println(Arrays.toString(arr));
    }
}
