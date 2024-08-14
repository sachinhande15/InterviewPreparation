package com.learnjava.multithreding;

public class TestThread {
	public static void main (String[] args) {
		System.out.println("My name is "+Thread.currentThread().getName());
		LearnThread t1 = new LearnThread();
		t1.start();

		Thread thread = new Thread(new LearnThread1());
		thread.start();
	}
}
