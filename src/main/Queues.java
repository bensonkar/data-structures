package main;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author bkariuki
 */
public class Queues {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue();
        queue.add(2);
        queue.add(5);
        queue.add(4);
        queue.add(9);
        queue.add(4);
        System.out.println(queue);
        Path path = Paths.get("");

        for (String k: args) {
            System.out.println("command line args "+k);
        }
    }
}
