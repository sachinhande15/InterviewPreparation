package exceptionhandling;

import java.sql.Array;

public class Practice {
	public static void main (String[] args) {

		int[] a= {12,26,90};

		try{
			for (int i = 0; i <=a.length ; i++) {
				System.out.println(a[i]);
			}
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}

	}
}
