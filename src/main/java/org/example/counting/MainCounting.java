package org.example.counting;

public class MainCounting {
    public static void main(String[] args) throws Exception {

/*        ClassicCounter classicCounter = new ClassicCounter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                classicCounter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                classicCounter.decrement();
            }
        });

        t1.start();
        t2.start();


        System.out.println(classicCounter.getCounter());*/

        SynchronizedCounter synchronizedCounter = new SynchronizedCounter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronizedCounter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronizedCounter.decrement();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(synchronizedCounter.getCounter());

/*        AtomicCounter atomicCounter = new AtomicCounter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                atomicCounter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                atomicCounter.decrement();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(atomicCounter.getCounter());*/

    }
}
