package main;


import java.io.File;

public class Recursion {

    static int fact(int n) {
        if (n != 0) {
            return n * fact(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(fact(8));
        String os = System.getProperty("os.name");
        System.out.println("os name:  "+os);
        System.getProperties().list(System.out);
        boolean mkdir = new File("").mkdir();
    }
}
