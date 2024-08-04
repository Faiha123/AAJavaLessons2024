package day5.jul28;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// declare and initialize
		int a[] = {10, 45, 23, 76, 35, 90, 35};
		int size = a.length;
		//now how do you reverse them?
		//You need looping, and also declare a temporary array
		
		for(int i=0; i<size/2; i++) {
			
			int temp = a[i];
			a[i] = a[size-i-1];
			a[size-i-1] = temp;
		}
		System.out.println("Reversed array: ");
		System.out.println(Arrays.toString(a));

	}

}
