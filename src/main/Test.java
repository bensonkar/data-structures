package main;

import java.util.*;

/**
 * @author bkariuki
 */
public class Test {

    public static int calculate(int num) {
        int factorial = 1, i;
        for (i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("factorial of " + num + " is " + factorial);
        return factorial;
    }

    public static int factorial(int num) {
        int factorial = 1, i = 1;
        do {
            factorial = factorial * i;
            i++;
        } while (i <= num);
        System.out.println("factorial of " + num + " using do while loop is " + factorial);
        return factorial;
    }

    public static int fact(int num) {
        int factorial = 1, i = 1;
        while (i <= num) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("factorial of " + num + " using while loop is " + factorial);
        return factorial;
    }

    public static void iterator() {
        List<String> names = Arrays.asList("deploy", "log", "test", "code", "debug", "error");
        Iterator it = names.iterator();
        while (it.hasNext()) {
            String name = (String) it.next();
            System.out.println("available name is  " + name);
        }
    }

    public static void maps() {
        Map<String, Object> map = new HashMap<>();
        map.put("test1", 80);
        map.put("test2", 30);
        map.put("test3", 50);
        map.put("test4", 70);
        map.put("test5", 40);
        map.put("test6", 60);
        map.forEach((key, value) -> {
            System.out.println("Key : " + key + " Value : " + value);
        });
//                System.out.println("your marks for subject is " + k.getKey() + " and marks is " + k.getValue()));

    }


    public static void main(String[] args) {
        Test test = new Test();
        test.calculate(5);
        Test.calculate(6);
        Test.factorial(6);
        Test.maps();
        Test.iterator();
        Test.fact(4);
    }
}
