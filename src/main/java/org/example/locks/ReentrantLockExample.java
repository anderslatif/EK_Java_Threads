package org.example.locks;

import java.util.concurrent.locks.ReentrantLock;
public class ReentrantLockExample implements Runnable {

    private ReentrantLock reentrantLock = new ReentrantLock();

    @Override
    public void run() {

        reentrantLock.lock();

        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
        reentrantLock.unlock();

    }
}
