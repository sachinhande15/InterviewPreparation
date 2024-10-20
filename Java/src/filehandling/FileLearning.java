package filehandling;

import java.io.File;

public class FileLearning {
	public static void main (String[] args) throws InterruptedException {
		String fileName = FileHelper.writeFile("In school, work, and daily life, we may encounter people who seem to have it all together. They are productive, stress-free, high achievers. But chances are, they were not born that way. Managing, organizing, and distributing time are skills that we can learn. Doing so can help you control your time and promote overall satisfaction.\n" + "\n" + "Here are some tips and methods that can help you harness your time for better well-being.\n" + "What is time management?\n" + "Time management is the process of consciously planning and controlling time spent on specific tasks to increase how efficient you are. You may be familiar with setting deadlines, writing to-do lists, and giving yourself small rewards for accomplishing certain activities.");
		System.out.println("File name is "+fileName);

		Thread [] threads = new Thread[2];

		for (int i=0; i<threads.length; i++){
			threads[i]= new Thread(()->FileHelper.readFile(new File(fileName)));
		}
		for (Thread  thread : threads) {
			thread.start();
			thread.join();
		}

		System.out.println("Main thread is");
	}
}
