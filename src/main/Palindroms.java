package main;

/**
 * @author bkariuki
 */
public class Palindroms {
    static boolean palindrom(Object obj) {
        String str = String.valueOf(obj);
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static boolean numberPalindrom(int num) {
        int remainder, sum = 0, ref = num;
        while (num > 0) {
            remainder = num % 10;
            sum = (sum * 10) + remainder;
            num = num / 10;
        }
        if (ref != sum) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(palindrom("level"));
        System.out.println(palindrom(1144));
        System.out.println(numberPalindrom(11));
        System.out.println(numberPalindrom(122));
        String s = "benson";
        String res = "";
        int len = s.length() - 1;
        while (len >= 0) {
            res = res + s.charAt(len);
            len--;
        }
        System.out.println("reversed string using tradition method " + res);
    }
}
