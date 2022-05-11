package main;

import java.util.Arrays;

/**
 * @author bkariuki
 */
public class Saf {

    static int solution(int[] A) {
        int result = 0;
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i] < A[A.length -1]) {
                A[A.length - 1] = A[A.length - 1] -1;
                A[i] = A[i] +1;
                result ++;
            }
            if (A[i] < A[i ++]) {
                A[i] = A[i] +1;
                result++;
            }
            result++;
        }
        return result;
    }

    static int solutions(String str) {
        StringBuilder sb = new StringBuilder(str);
        int len = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == chars[i + 1]) {
                Arrays.copyOfRange(chars, i, i + 1);
            }
        }
        len = chars.length;
        return len;
    }

    static String stringAppear(String str) {
        int count = 0, i = 0;
        String res = "";
        while (i < str.length() -1) {
            if (str.charAt(i) == str.charAt(i +1)) {
                count++;
                res = String.valueOf(str.charAt(i));
            }
//            if (count == 2) {
//                res = String.valueOf(str.charAt(i));
//            }
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] data = {1,2,2,4};
        int[] data2 = {4,2,4,6};
        int[] data3 = {1,1,2,1};
//        System.out.println(solution(data));
//        System.out.println(solution(data2));
//        System.out.println(solution(data3));
        System.out.println(stringAppear("aba"));


//        System.out.println(solutions("aaab"));
        String name = "benson kariuki";
        String filtered = name.length() > 3 ? name.substring(0, 3) : name;
        int len = name.length();
        if (name.length() > 3) {
            len = len - 3;
            name.subSequence(0, len);
        }
        System.out.println(filtered);

    }
}
