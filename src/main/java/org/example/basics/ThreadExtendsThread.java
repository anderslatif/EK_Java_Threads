package org.example.basics;

public class ThreadExtendsThread extends Thread {

    public ThreadExtendsThread(String name) {
        super(name);
    }

    public void run() {
        for (;;) {
            // print the time
            System.out.println("------------------");
            System.out.println("| " + java.time.LocalTime.now() + " |");
            System.out.println("------------------");
            System.out.println();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}