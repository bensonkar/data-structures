package main;

import java.util.Base64;

/**
 * @author bkariuki
 */
public class QATest extends Abs{
    public static void main(String[] args) {
     Data data = new Data("test",32);
        System.out.println(data.age);
        Abs abs = new QATest();
        abs.tt();
        byte n = 0;

        byte[] encodedBytes = Base64.getEncoder().encode("Test".getBytes());
        System.out.println("encodedBytes " + new String(encodedBytes));
        byte[] decodedBytes = Base64.getDecoder().decode(encodedBytes);
        System.out.println("decodedBytes " + new String(decodedBytes));
    }

    @Override
    void tt() {
        System.out.println("test *********************");
    }
}
