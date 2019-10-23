package com.company.Threads;

public class CallerSynchronize implements Runnable {
    public String msg;
    public Callme target;
    public Thread t;

    public CallerSynchronize(Callme target, String msg) {
        this.msg = msg;
        this.target = target;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }
}
