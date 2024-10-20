package com.learnjava.multithreding;

class Counter {

	private int count = 0;

	public synchronized void increment () {
		count++;
	}

	public int getCount () {
		return count;
	}
}

class CounterThread {

	private final Counter counter;

	CounterThread (Counter counter) {
		this.counter = counter;
	}


	public static void main (String[] args) throws InterruptedException {
		Counter c = new Counter();

		 Thread t= new Thread(() -> {
			 for (int i = 0; i <100 ; i++) {
				 c.increment();
			 }
		 });
		 Thread t1= new Thread(c::increment);
		 System.out.println("Thread 1 state is "+t.getState());
		 t.start();
		System.out.println("Thread 1 state is "+t.getState());
		 t1.start();
		 t.join();
		System.out.println("Thread 1 state is "+t.getState());
		 t1.join();
		System.out.println("Final Count is "+ c.getCount());

		System.out.println("This is a main method work ");
	}
}
