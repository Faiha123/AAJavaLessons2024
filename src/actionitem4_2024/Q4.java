package actionitem4_2024;

import java.util.Arrays;

public class Q4 {
	
	//Q4. Find out largest and lowest numbers of an array. 

	public static void main(String[] args) {
		
	//Mahfouz sir way--->>>>	
		
		int arr[] = {3,8,8,9,2,67,34};
		
	//Using Iteration technique (Greedy approach)
		int mini = arr[0];
		int max = arr[0];
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i]< mini) {
				
				mini = arr[i];//it keeps holding the lowest value
				
			}else if(arr[i]> max) {
				max = arr[i];
			}
			
		}
		
		System.out.println("The lowest number is: "+ mini);
		System.out.println("The lowest number is: "+ max);
		
		
		
		
	//Using Predefined functions/library:
		
		int minimum = Arrays.stream(arr).min().getAsInt();//gets you the lowest
		System.out.println("The Minimum number is: "+minimum);
		
		int maximum = Arrays.stream(arr).max().getAsInt();//gets you the lowest
		System.out.println("The Maximum number is: "+maximum);
		
	}

}
