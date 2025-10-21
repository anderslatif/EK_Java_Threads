package org.example.basics;

import org.example.locks.PrintThreads;

import java.time.Duration;
import java.util.concurrent.Executors;

public class MainBasics {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();

//        System.out.println(runtime.totalMemory());
//        System.out.println(runtime.freeMemory());
//        System.out.println(runtime.maxMemory());

/*        try {
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                runtime.exec("notepad");            // Windows
            } else if (os.contains("mac")) {
                runtime.exec("open -a TextEdit");   // macOS
            } else {
                runtime.exec("gedit");              // Linux (or nano, vim)
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

//        ThreadExtendsThread extendsThread = new ThreadExtendsThread();
//        ThreadExtendsThread extendsThreadTwo = new ThreadExtendsThread();
//        extendsThread.start();
//        extendsThreadTwo.start();

//        ThreadImplementsRunnable implementsRunnable = new ThreadImplementsRunnable();
//        Thread thread = new Thread(implementsRunnable);
//        thread.start();


/*        PrintThreads thread0 = new PrintThreads("This sentence is so good. Look at it. It's so long and good.");
        PrintThreads thread1 = new PrintThreads("11111111111111111111111111111111111111111111111111111111111111");
        PrintThreads thread2 = new PrintThreads("22222222222222222222222222222222222222222222222222222222222222");
        PrintThreads thread3 = new PrintThreads("The quick brown fox jumps over the lazy dog");

        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();*/


/*        Thread traditionalThread = new Thread(() -> {
            System.out.println("This runs in a traditional thread" + Thread.currentThread());
        });
        traditionalThread.start();*/

        // This is self-starting
/*        Thread virtualThread = Thread.startVirtualThread(() -> {
            System.out.println("This runs in a virtual thread" + Thread.currentThread());
        });*/


/*        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 1_000_000; i++) {
                executor.submit(() -> {
                    try {
                        Thread.sleep(Duration.ofSeconds(1));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Task on: " + Thread.currentThread());
                });
            }
        }  // Auto-shutdown*/


    }
}