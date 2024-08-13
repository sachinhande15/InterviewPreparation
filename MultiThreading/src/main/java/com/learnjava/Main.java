package com.learnjava;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main (String[] args) throws InterruptedException {

		Counter counter = new Counter();
		 Thread t1 = new Thread(()->{
			 for (int i=0; i<1000;i++){
				 counter.increment();
			 }
			 System.out.println("t1 Thread name is "+Thread.currentThread().getName());
		 });

		Thread t2 = new Thread(()->{
			for (int i=0; i<10;i++){
				counter.increment();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
			System.out.println("t2 Thread name is "+Thread.currentThread().getName());
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();

		System.out.println("Final count is "+counter.getCount());
	}
}