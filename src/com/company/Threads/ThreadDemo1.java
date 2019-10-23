package com.company.Threads;

public class ThreadDemo1 {
    public static void main(String[] args) {
        System.out.println("getName() - " + Thread.currentThread().getName());
        System.out.println("getId() - " + Thread.currentThread().getId());
        System.out.println("getPriority() - " + Thread.currentThread().getPriority());
        System.out.println("getState - " + Thread.currentThread().getState());
        System.out.println("getThreadGroup() - " + Thread.currentThread().getThreadGroup());
        System.out.println();

        new Thread(() -> {
            System.out.println("getName() - " + Thread.currentThread().getName());
            System.out.println("getId() - " + Thread.currentThread().getId());
            System.out.println("getPriority() - " + Thread.currentThread().getPriority());
            System.out.println("getState - " + Thread.currentThread().getState());
            System.out.println("getThreadGroup() - " + Thread.currentThread().getThreadGroup());
        }).start();
    }
}
