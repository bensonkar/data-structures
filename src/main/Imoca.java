package main;

import java.util.Arrays;

/**
 * @author bkariuki
 */
public class Imoca {
    Imoca() {
        this(5);
        System.out.println("cons 1");
    }
    Imoca(int x) {
        this(5,5);
        System.out.println(x);
    }
    Imoca(int x, int y) {
        System.out.println(x*y);
    }
    public static int winner(int N, int A[]) {
        //this is default OUTPUT. You can change it.
        int result=-404;

        //write your Logic here:
       if (A.length == N) {
           int max = Arrays.stream(A).max().getAsInt();
           for (int i=0; i<A.length; i++) {
               if (A[i] == max) {
                   result = A[i];
               }
           }
       }

        return result;
    }
    public static void main(String[] args) {
new Imoca();
    }
}
