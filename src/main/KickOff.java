package main;

/**
 * @author bkariuki
 */
public class KickOff {
     static Object num;
     static Object getNum(Object n) {
         if (n instanceof Integer) {
             num = n;
             System.out.println("int "+num);
         } else {
             num = n;
             System.out.println("..... "+num);
         }
         return num;
     }

    public static void main(String[] args) {
        getNum(8);
        getNum("test");

    }
}
