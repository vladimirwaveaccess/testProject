package com.company.Threads;

public class Caller implements Runnable {
    public String msg;
    public Callme target;
    public Thread t;

    public Caller(Callme target, String msg) {
        this.msg = msg;
        this.target = target;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        target.call(msg);
    }
}
