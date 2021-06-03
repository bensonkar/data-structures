package main;

import java.util.*;

/**
 * @author bkariuki
 */
public class SafTest {

    public static void main(String[] args) {
        String string = "004-034556-42";
        String[] parts = string.split("-", 9);
        System.out.println("parts "+ Arrays.toString(parts));
        String part1 = parts[0]; // 004
        String part2 = parts[1];
        System.out.println(part1);
        System.out.println(part2);
        System.out.println(parts[2]);

        String name = "new name";
        int age = 32;

        System.out.printf("%s is %d\n",name,age);
        System.out.printf("******************************\n");
        System.out.print("///////////////////////////////\n");
        BEnum bb = BEnum.FEMALE;
        BEnum[] b = BEnum.values();
        System.out.println(bb.getCode());

        for (int i = 0; i< b.length;i++) {
            System.out.println("enums "+b[i].getCode());
        }
//        Arrays.stream(b).
        int[] ss = {1,1,4,4};
        int sum = 0;
        for (int i = 0; i<ss.length; i++) {
            sum += ss[i];
        }

        System.out.println("sum   "+sum);

        System.out.println(System.currentTimeMillis());
        int kn = 12;
        int res = kn < 10 ? kn:20;
        System.out.println(res);
    }

}
