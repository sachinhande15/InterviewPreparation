package com.learnjava.multithreding;

public class LearnThread extends Thread {

	@Override
	public void run () {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread is created using Thread Class ");
		}
		System.out.println("My name is "+Thread.currentThread().getName());
	}
}


