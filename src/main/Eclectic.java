package main;

import java.util.Arrays;
import java.util.List;

/**
 * @author bkariuki
 */
public class Eclectic {

    static List arrCheck(int[] arr, int targetSum) {
        int num1, num2;
        int arr1[] = new int[targetSum];

        for (int x = 0; x < arr.length; x++) {
            arr1[arr[x]]++;
        }

        for (int y = 0; y < arr.length; y++) {
            if (arr1[targetSum - arr[y]] == 1) {
                num1 = arr[y];
                num2 = targetSum - arr[y];
                return Arrays.asList(num1, num2);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String message = "Hello";
        System.out.println(arrCheck(new int[]{4, 2, 6, 8, 9, 3, 1,89}, 10));
    }

}
