package main;

import java.util.Scanner;

/**
 * @author bkariuki
 */
public class Pass {
    protected static int attempts = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pass = "";
        do {
            attempts++;
            System.out.println("Enter password: ");
            pass = input.nextLine();
            if (pass.equals("123")) {
                System.out.println("correct pass");
                attempts--;
                input.close();
            } else if (attempts == 3) {
                System.out.println("attempt is reached");
                input.close();
                break;
            }
        } while (!pass.equals("123"));
        System.out.println("count attempt is " + attempts);
    }
}
