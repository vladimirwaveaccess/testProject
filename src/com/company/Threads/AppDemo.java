package com.company.Threads;

public class AppDemo {
    public static void main(String[] args) throws InterruptedException {
        final Object ref = new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (ref) {
                    System.out.println("run wait...");
                    try {
                        ref.wait();
                        System.out.println("run - thanks!");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        System.out.println("sleep...");
        Thread.sleep(2000);
        System.out.println("Main - sleep");
        System.out.println("Main - notify");
        synchronized (ref) {
            ref.notify();
        }
    }
}
