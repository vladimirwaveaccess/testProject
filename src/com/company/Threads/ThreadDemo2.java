package com.company.Threads;

public class ThreadDemo2 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
//        new MyClass().start();
//        new MyClass().start();
//        new MyClass().start();
//        System.out.println();

        new Thread(new MyClass1()).start();
        System.out.println();

        new Thread(() -> {
            Thread thread = Thread.currentThread();
            for (int i = 0; i < 10; i++) {
                System.out.println(thread.getName() + " " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
