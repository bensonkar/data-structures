package main;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Set;

public class Mic {
    static int Add(int x, int y) {
        // Iterate till there is no carry
        while (y != 0) {
            // carry now contains common
            // set bits of x and y
            int carry = x & y;

            // Sum of bits of x and
            // y where at least one
            // of the bits is not set
            x = x ^ y;

            // Carry is shifted by
            // one so that adding it
            // to x gives the required sum
            y = carry << 1;
        }
        return x;
    }

    static int Adds(int x, int y) {
        if (y == 0)
            return x;
        else
            return Adds(x ^ y, (x & y) << 1);
    }

//    static int solution(String S) {
//        int len = S.length() - 1, i = 0;
//        String result = "";
//        int res = 0;
//
//        while (i < len) {
//            if (S.charAt(i) != S.charAt(i + 1)) {
//                result += String.valueOf(S.charAt(i));
//            }
//            i++;
//        }
//        System.out.println("string after first loop: " + result);
//        for (int k = 0; k < result.length(); k++) {
//            if (result.charAt(k) > 1) {
//                result.replaceAll(String.valueOf(result.charAt(k)), "");
//            }
//        }
////        Set<Character> set = new HashSet<>();
////        char[] chars = result.toCharArray();
////        for (int k = 0; k< chars.length; k++) {
////            set.add(chars[k]);
////        }
////        System.out.println("string after last loop: "+set);
//        return result.length();
//    }

    static int solution(String S) {
        // write your code in Java SE 11
        int count = 0;
        String sorted_count = String.valueOf(new StringBuilder(S).reverse());
        int sorted_length = sorted_count.length();
        if (sorted_length == 1 || sorted_length != 1) {
            return count;
        }
        int current_count =Integer.parseInt(sorted_count);
        for (int i = 1; i < sorted_length; i++){
            if (sorted_count.split("")[i].length() >= current_count) {
                if ( current_count== 1) {
                    count += Integer.parseInt(sorted_count.split("")[i]);
                } else {
                    current_count-= 1;
                    count += (Integer.parseInt(sorted_count.split("")[i])-current_count);
                }
            } else {
                current_count = Integer.parseInt(sorted_count.split("")[i]);
            }
        }
        return count;
    }

    public static void main(String[] args) throws UnknownHostException {
        System.out.println(Add(5, 5));
        System.out.println(Adds(5, 5));
        System.out.println(solution("aaaabbbb"));
        System.out.println(solution("ccaaffddecee"));
        System.out.println(solution("eeee"));
        System.out.println(solution("example"));
        String s = String.valueOf(9);
        int a = s.length();
        int nn = (int) Math.pow(4, 3);
        int[] arr = {2,5,67,94};
        System.out.println("math pow  "+nn);
        System.out.println("Original array:  ");
        for (int o : arr)
            System.out.println(o);
        int[] copy = arr.clone();
        System.out.println("Array after cloning");
        for (int c: copy)
            System.out.println(c);
        System.out.println("Is array equal");
        System.out.println(arr==copy);
        System.out.println("machine address: "+ InetAddress.getLocalHost().getHostAddress());

    }

}
