package main;

public class Threads extends Thread{
    static void run(String thread) {
        try {
            System.out.println("Thread "+thread+" is running");
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Thread "+thread+" interrupted");
        }
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread  is running");
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Thread  interrupted");
        }
    }

    public static void main(String[] args) {
        run("BEN NEW");
        run("BEN NEW");
        run("BEN NEW");
        Threads threads = new Threads();
        threads.start();
        Threads t = new Threads();
        t.start();
//        threads.run();
        System.out.println(threads.getName());
        System.out.println(t.getName());
    }
}
