package com.des;

public class Main {

    public static void main(String[] args) throws InterruptedException {

    	System.out.println("App start");
		Thread.sleep(2000);

		Thread t1 = new Process("1", 2000);
		Thread t2 = new Process("2", 2000);

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("App finish");
		Thread.sleep(1000);

    }
}
