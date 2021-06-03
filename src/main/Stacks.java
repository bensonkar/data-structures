package main;

import java.util.Stack;

/**
 * @author bkariuki
 */
public class Stacks {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("test");
        stack.push("test1");
        stack.push("test2");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.add("test3");
        System.out.println(stack);
    }
}
