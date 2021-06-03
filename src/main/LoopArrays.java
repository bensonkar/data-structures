package main;

import java.util.Arrays;

/**
 * @author bkariuki
 */
public class LoopArrays {
    protected static int[] array = {23,851, 82, 75, 53, 844, 495, 60, 7, 854, 79};
    protected static int i = 0;

    public static void main(String[] args) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            System.out.println("using for loop " + num);
        }
        for (int i : array) {
            System.out.println("using for each loop " + i);
        }
        Arrays.stream(array).forEach(k -> {
            System.out.println("using array stringeam " + k);
        });
        int s = 0;
        while (i < array.length) {
            System.out.println("using while loop "+array[i]);
            s += array[i];
            System.out.println("sumss "+s);
            i++;
        }
        System.out.println("*********count "+i);
        int sum = Arrays.stream(array).sum();
        System.out.println("******************sum "+sum);
    }
}
