package com.tvc.runner;
import com.tvc.backend.Backend;


public class Runner {
    public Runner() {
        Thread t1 = new Thread(new Backend("Thread-1"));
        Thread t2 = new Thread(new Backend("Thread-2"));
        Thread t3 = new Thread(new Backend("Thread-3"));

        t1.run();
        t2.run();
        t3.run();
    }
}