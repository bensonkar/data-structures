package main;

import java.util.*;

/**
 * @author bkariuki
 */
public class EcleTest {

    /*
     * stack is a linear data structure that is used to store the collection of objects based on LIFO
     * Stack is a class that is in Collection framework that extends the Vector class
     */
    static void stackSample() {
        //creating instance of stack
        Stack<Integer> stack = new Stack<>();
        //performing push operation to insert an item onto the top of the stack
        stack.push(23);
        stack.push(54);
        stack.push(76);
        System.out.println("printing stack after adding elements " + stack);
        //performing pop operation removes an object at the top of the stack and returns the same object
        stack.pop();
        System.out.println("printing element after performing pop " + stack);
        //It looks at the element that is at the top in the stack
        Integer pek = stack.peek();
        System.out.println("printing element after performing peek " + pek);
    }

    static String reverse(String str) {
        String res = "";
        int len = str.length() - 1;
        if (len > 0) {
            while (len >= 0) {
                res = res + str.charAt(len);
                len--;
            }
            return res;
        } else {
            return "";
        }
    }

    static void memoryLeak() {
        //memory leak .This will continuously add a 1MB byte to a vector until it runs out of memory
        List<int[]> integers = new ArrayList<>();
        //infinite loop
        while (true) {
            int[] ints = new int[989767252];
            integers.add(ints);
        }
    }

    static List<int[]> list = new LinkedList();
    public static void main(String[] args) {
        stackSample();
//        memoryLeak();

        for (;;) {
            int[] ints = new int[989767252];
            list.add(ints);
        }
    }
}
