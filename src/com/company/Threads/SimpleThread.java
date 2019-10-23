package com.company.Threads;

public class SimpleThread extends Thread {
    @Override
    public void run() {
        try {
            if (isDaemon()) {
                System.out.println("Start thread-daemon");
                Thread.sleep(10000);
            } else {
                System.out.println("Start thread-simple");
            }
        } catch (InterruptedException e) {
            System.err.println(e);
        } finally {
            if (!isDaemon()) {
                System.out.println("End simple thread");
            } else {
                System.out.println("End daemon thread");
            }
        }
    }
}
