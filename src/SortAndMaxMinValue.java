import java.util.ArrayList;
import java.util.Arrays;

public class SortAndMaxMinValue {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[]{-2, -1, 0, 1, 2, 3, 4, 5};
        analyzeNumbers(arr1);
    }

    public static void analyzeNumbers(Integer[] arr) {
        ArrayList<Integer> tata = new ArrayList<>(Arrays.asList(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Minimum is " + min);
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Maximum is " + max);

        float avg = 0;
        float sum = 0;
        int elem = arr.length;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        avg = sum / elem;
        System.out.println("Average is = " + avg);


    }
}
