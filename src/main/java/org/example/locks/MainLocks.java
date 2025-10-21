package org.example.locks;

import java.util.concurrent.Semaphore;

public class MainLocks {
    public static void main(String[] args) {
/*        PrintThreads thread0 = new PrintThreads("This sentence is so good. Look at it. It's so long and good.");
        PrintThreads thread1 = new PrintThreads("11111111111111111111111111111111111111111111111111111111111111");
        PrintThreads thread2 = new PrintThreads("22222222222222222222222222222222222222222222222222222222222222");
        PrintThreads thread3 = new PrintThreads("The quick brown fox jumps over the lazy dog");

        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();*/


        ReentrantLockExample reentrantLockExample = new ReentrantLockExample();

        Thread reentrantLockThreadOne = new Thread(reentrantLockExample);
        Thread reentrantLockThreadTwo = new Thread(reentrantLockExample);

        reentrantLockThreadOne.start();
        reentrantLockThreadTwo.start();


/*        Semaphore semaphore = new Semaphore(1);

        SemaphoreExample semaphoreExample = new SemaphoreExample(semaphore);

        Thread semaphoreThreadOne = new Thread(semaphoreExample);
        Thread semaphoreThreadTwo = new Thread(semaphoreExample);

        semaphoreThreadOne.start();
        semaphoreThreadTwo.start();*/

        // thread 1: I want to use the resource
        // semaphore = 1 ... -> 0
        // semaphore released 0 -> 1

        // thread 2 I want to use the resource
        // semaphore = 0 ... -> wait until it is higher than 0
        // use the semaphore

    }
}
