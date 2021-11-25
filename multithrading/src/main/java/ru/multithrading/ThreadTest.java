package ru.multithrading;

import java.util.concurrent.TimeUnit;

public class ThreadTest extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("thread start...");
        try {
            System.out.println("sleep");
            Thread.sleep(TimeUnit.SECONDS.toMillis(5));
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("thread END...");
    }
}
