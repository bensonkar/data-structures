package main;

/**
 * @author bkariuki
 */
@FunctionalInterface
public interface Fun {
    void say(String message);
    String message = "new message from functional interface";
}

class Chess implements Fun{
    public static void main(String[] args) {
        Fun f = new Chess();
        f.say(message);
    }

    @Override
    public void say(String message) {
        System.out.println(message);
    }
}
