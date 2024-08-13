package com.learnjava;

public class MyThread extends Thread{

	@Override
	public void run () {
		System.out.println("My Thread "+Thread.currentThread().getName());
	}
}
class Counter {
	private int count = 0;

	public synchronized void increment(){
		count++;
	}
	public int getCount(){
		return count;
	}
}
