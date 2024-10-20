package exceptionhandling;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
	public static void main (String[] args) {

		System.out.println(Arrays.toString(getInputFromConsole()));

	}

	private static void testNullPointerException (String[] names) {
		try {
			for (String name : names) {
				System.out.println(name);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void testArrayOutOfBoundException (int[] array) {
		try {
			for (int i = 0; i <= array.length; i++) {
				System.out.println(array[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

	public static String[] getInputFromConsole () {
		System.out.println("Enter length of array");
		Scanner scanner = new Scanner(System.in);
		int arrayLength = scanner.nextInt();
		String[] words = new String[arrayLength];
		for (int i = 0; i < arrayLength; i++) {
			System.out.println("Enter a values");
			words[i] = scanner.next();
		}
		System.out.println("\n Array is ");
		return words;
	}
}
