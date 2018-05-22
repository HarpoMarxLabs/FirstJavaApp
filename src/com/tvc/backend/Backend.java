package com.tvc.backend;
import java.util.Random;

public class Backend implements Runnable {
    private String name;
    private int time;
    private Random rand = new Random();

    public Backend(String name) {
        this.name = name;
        this.time = rand.nextInt(999);
    }

    public void run() {
        try {
            System.out.printf("%s is sleeping for %d \n", this.name, this.time);
            Thread.sleep(this.time);
            System.out.printf("%s is done.\n", this.name);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
