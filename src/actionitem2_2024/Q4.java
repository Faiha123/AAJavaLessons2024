package actionitem2_2024;

public class Q4 {

	// Q4. Write a program that returns the factorial (!) of a given 
			//number using for loop. For example: 3! equals 3*2*1 = 6, again 5! 
					//equals 5*4*3*2*1 = 120.
	
	                             //here in 'number' you are storing those numbers 5,4,3,2. 1 is not counted
	public static long doFactorial(int number) {
		
		long factorial = 1;	//it is wise to use long instead of int, bcz int will throw error if the number gets too big
		while(number>1) {
			factorial *= number; // factorial = factorial * number
			number --;
		}	
		return factorial;//returning the calculated value
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Factorial is: "+ doFactorial(5));//you can keep changing the number here

	}

}
