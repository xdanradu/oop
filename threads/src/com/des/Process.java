package com.des;

public class Process extends Thread {
    private String name;
    private int duration;

    public Process(String name, int duration){
        this.name = name;
        this.duration = duration;
    }

    public void run() {
        System.out.println("Fill tank "+this.name);
        try {
            Thread.sleep(this.duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Drain tank "+this.name);
    }
}
