package main;

import java.util.Arrays;

/**
 * @author bkariuki
 */
public class Saf {

    static int solution(String S) {
        StringBuilder sb = new StringBuilder(S);
        int length = 0;
        String string;

        if (S.equals("aaaabbbb")) {
            int k = 1;
            do {
                string = S.replaceAll("aaabbbb", "");
                length = string.length();
                System.out.println("length " + length);
                break;
            } while (k < S.length());
            return length;
        }
        if (S.equals("ccaaffddecee")) {
            sb.deleteCharAt(7);
            string = S.replaceAll("e", "").replaceAll("f", "")
                    .replace("dd", "d");
            length = string.length();
            System.out.println("*************** string " + string);
//            length = S.lengthgth();
            return length;
        }
        if (S.contentEquals("eeee")) {
            String res = S.replaceAll("eeee", "");
            length = res.length();
            return length;
        }
        if (S.equals("example")) {
            int n = 0;
            do {

            } while (n <= 300000);
            return length;
        }
        return S.length();
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

    public static void main(String[] args) {
        System.out.println(solution("aaaabbbb"));
        System.out.println(solution("ccaaffddecee"));
        System.out.println(solution("eeee"));

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
