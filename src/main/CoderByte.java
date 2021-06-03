package main;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author bkariuki
 */
public class CoderByte {
    public static String ArrayChallenge(int[] arr) {
        int i = 0,sum = 0;
        int largest = Arrays.stream(arr).max().getAsInt();
        Arrays.sort(arr);
        while (i < arr.length) {
            sum += arr[i];
            ++i;
        }
        sum = sum - largest;
        if (sum >= largest) {
            return "true";
        }
        return "false";
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5, 7, 16, 1, 2};
        int[] num = new int[]{3, 5, -1, 8, 12};
        System.out.println(ArrayChallenge(nums));
        System.out.println(ArrayChallenge(num));
    }
}
