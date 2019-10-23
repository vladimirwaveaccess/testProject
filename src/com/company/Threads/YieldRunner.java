package com.company.Threads;

public class YieldRunner {
    public static void main(String[] args) {
        new Thread(){
            public void run() {
                System.out.println("Start thread1");
                Thread.yield();
                System.out.println("End thread1");
            }
        }.start();

        new Thread(){
            public void run() {
                System.out.println("Start thread2");
                System.out.println("End thread2");
            }
        }.start();
    }
}
