package main;

import java.util.*;

/**
 * @author bkariuki
 */
public class Safs {

    static int duplicate(String S) {
        int count = 0, i = 0, len = S.length() - 1;
        StringBuilder sb = new StringBuilder(S);
        while (i < len) {
            if (S.charAt(i) == S.charAt(i + 1)) {
                sb.delete(i, i + 1);
                count = sb.length();
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
    }

}
