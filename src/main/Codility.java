package main;

import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

/**
 * @author bkariuki
 */
public class Codility {
    static int positiveNumberNotInArray(int[] A) {
        Arrays.sort(A);
        int result = 1;
        int i = 0;
        while (i < A.length) {
            if (A[i] == result) {
                result++;
            }
            i++;
        }
        return result;
    }

    static String duplicate(String str, int times) {
        int i = 0;
        String result = "";
        if (times > 0) {
            while (i < times) {
                result += str;
                i++;
            }
            return result;
        } else {
            return str;
        }
    }

    static String reverse(String str) {
        String res = "";
        int len = str.length() - 1;
        if (len > 0) {
            while (len >= 0) {
                res = res + str.charAt(len);
                len--;
            }
            return res;
        } else {
            return "";
        }
    }

    static String reverseStringUsingStack(String input) {
        String output = "";
        Stack stack = new Stack();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);
        }
        while (!stack.isEmpty()) {
            char ch = (char) stack.pop();
            output = output + ch;
        }
        return output;
    }

    static String randomPass() {
        String res = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        int i = 0;
        char[] randomPass = new char[10];
        while (i < 10) {
            randomPass[i] = res.charAt(random.nextInt(res.length()));
            ++i;
        }
        return String.valueOf(randomPass);
    }

    static int machine(String S) {
        int result = 0;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(positiveNumberNotInArray(new int[]{1, 3, 6, 4, 1, 2}));
        System.out.println(duplicate("ben", 2));
        System.out.println(reverse("ben"));
        String benson = "string";
        System.out.println(benson.substring(1));
        System.out.println("random pass " + randomPass());
        System.out.println("reversing string using stack    "+reverseStringUsingStack("benson"));
    }
}
