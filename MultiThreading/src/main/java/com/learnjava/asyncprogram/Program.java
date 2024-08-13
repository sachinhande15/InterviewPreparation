package com.learnjava.asyncprogram;

public class Program {

	public static void multiThreading () {
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Thread Name is " + Thread.currentThread().getName());
				System.out.println("My name is sachin ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
		});
		t1.start();
	}
}
