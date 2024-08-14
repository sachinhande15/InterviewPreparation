package com.learnjava.multithreding;

public class LearnThread1 implements Runnable{

	@Override
	public void run () {
		for (int i = 0; i <10 ; i++) {
			System.out.println("Thread is created using Runnable interface");
		}
		System.out.println("My name is "+Thread.currentThread().getName());
	}
}
