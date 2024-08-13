package com.learnjava.functions;

import java.util.Arrays;
import java.util.List;

public class Program1 {
	public static void main (String[] args) {
		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		System.out.println("Even numbers are \n");
		System.out.println(getEvenNumbers(list));
		System.out.println("\n=======");
		System.out.println(getNumberStartingWithOne(list));
	}

	//1.Given a list of integers, find out all the even numbers that exist in the list using Stream functions?

	public static List<Integer> getEvenNumbers (List<Integer> list) {
		return list.stream().filter(x -> x % 2 == 0).toList();
	}
	// output [10, 8, 98, 32]

	// 2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?

	public static List<Integer> getNumberStartingWithOne (List<Integer> list) {
		return list.stream().map(String::valueOf).filter(x -> x.startsWith("1")).map(Integer::valueOf).toList();
	}

	//output [10, 15]

}
