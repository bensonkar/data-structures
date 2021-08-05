package main;

/**
 * @author bkariuki
 */
public class Azenia {
    static String occurrence(String S) {
        String result = "";
        if (S.length() > 0) {
           result = S.replaceAll("plus","+").replaceAll("minus","-");
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(occurrence("minusplusminus"));
    }
}
