package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author bkariuki
 */
public class Eclectic {

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }

    static List arrCheck(int[] arr, int targetSum) {
//        bubbleSort(arr);
        Arrays.sort(arr);
        int num1, num2;

        for (int y = 0; y < arr.length - 1; y++) {
            if ((arr[y] + arr[y + 1]) == targetSum) {
                num1 = arr[y];
                num2 = arr[y + 1];
                return Arrays.asList(num1, num2);
            }
        }
        return new ArrayList();
    }

    public static void main(String[] args) {
        String message = "Hello";
        System.out.println(arrCheck(new int[]{4, 2, 6, 8, 9, 3, 1, 89}, 10));
    }

}
