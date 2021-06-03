package main;

/**
 * @author bkariuki
 */
public class OpenTech {
    static int stringAppear(String str, char c) {
        int count = 0, i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == c) {
                count++;
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(stringAppear("benff", 'f'));
    }
}
