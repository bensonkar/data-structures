package main;

import java.util.*;

/**
 * @author bkariuki
 */
public class Solution {
    static int solution(int[] A) {
        int max = Arrays.stream(A).max().getAsInt();
        boolean existss = Arrays.stream(A).anyMatch(b -> b == 1);
        int res = 1;
        if (max < 1 || !existss) {
            return res;
        }
//        Arrays.sort(A);
        res = Integer.MAX_VALUE;
        for (int a : A) {
            if (a >= 0) {
                boolean exists = Arrays.stream(A).anyMatch(b -> b == a + 1);
                if (!exists) {
                    if (a + 1 < res) {
                        res = a + 1;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 6, 4, 1, 2}));
        System.out.println(solution(new int[]{1, 2, 3}));
        System.out.println(solution(new int[]{7, 8, 9, 11, 12}));
    }
}
