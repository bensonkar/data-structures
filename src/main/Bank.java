package main;

import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    static double balance;
    String customer;
    static final ReentrantLock lock;

    static {
        balance = 1000;
        lock = new ReentrantLock(true);
    }

    public Bank(String customer) {
        this.customer = customer;
    }

    public synchronized void deposit(double amount) {
        synchronized (this) {
            try {
                Thread.sleep(1000);
                balance = balance + amount;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Your balance after deposit is:  " + balance);
    }

    public void withdraw(double amount) {
        lock.lock();
        try {
            Thread.sleep(1000);
            balance = balance - amount;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
        System.out.println("Your balance after withdraw is: " + balance);
    }

    public static void main(String[] args) {
        Bank bank = new Bank("BEN");
        bank.deposit(200);
        bank.deposit(500);
        bank.deposit(1000);
        bank.deposit(300);
        bank.deposit(700);
        bank.deposit(800);
        bank.deposit(4000);
        bank.withdraw(200);
        bank.withdraw(100);
        bank.withdraw(500);
        bank.withdraw(300);
        bank.withdraw(600);
    }
}
