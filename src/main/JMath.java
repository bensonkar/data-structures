package main;

public class JMath {

    static int add(int a, int b) {
        return Math.addExact(a, b);
    }

    static int subtract(int a, int b) {
        return Math.subtractExact(a, b);
    }

    public static void main(String[] args) {
        JMath math = new JMath();
        System.out.println(add(2, 3));
        System.out.println(subtract(5, 4));
        System.out.println(2+"test "+2+2);
        System.out.println(2+2+4);
        System.out.println(2+(-2));
    }
}
