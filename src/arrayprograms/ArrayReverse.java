package arrayprograms;

public class ArrayReverse {

	public static void main (String[] args) {
		int [] numbers = new int[]{12, 56, 90, 89};
		numbers = reverseArray(numbers);
		for (int n : numbers){
			System.out.print(n+" ");
		}
	}


	// Reverse an given array

	public static int [] reverseArray(int array[]){
		if ( array.length ==0 && array ==null )
			throw new IllegalArgumentException("Array must not be null");
		int start =0;
		int end = array.length-1;
		while (start < end){
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
		return array;
	}
}
