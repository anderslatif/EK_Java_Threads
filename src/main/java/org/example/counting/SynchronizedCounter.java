package org.example.counting;

import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedCounter extends Thread {
    private static Object lock = new Object();
    private int counter = 0;

    public int getCounter() {
        return counter;
    }

/*  // todo solution 1

    public synchronized void decrement() {
        this.counter--;
    }

    public synchronized void increment() {
        this.counter++;
    }*/

    // todo solution 2

    public void decrement() {
        synchronized (lock) {
            this.counter--;
        }
    }

    public void increment() {
        synchronized (lock) {
            this.counter++;
        }
    }
}