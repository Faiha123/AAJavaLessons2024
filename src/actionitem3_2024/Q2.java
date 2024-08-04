package actionitem3_2024;

import java.util.Scanner;

public class Q2 {
	
	//Q2. Find out smallest of 3 numbers (use if..else). 

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		int smallestNum;
//		
//		if(num1<num2 && num1<num3) {
//			smallestNum = num1;
//		}
//		else if(num2<num1 && num2<num3) {
//			smallestNum = num2;
//		}
//		else{
//			smallestNum = num3;
//		}		
//		
//		System.out.println("Smallest number among 3 is: "+ smallestNum);
		
		
	//Mahfouz sir way---->>>>>
		
		int a = 89, b = 67, c = 37, smallest;
		
		int temp = (a<b) ? a : b;//compare a & b and extract the smallest
		//compare temp with c and store the result in smallest variable
		smallest = (c < temp) ? c : temp;
		
		System.out.println("The smallest number is: "+smallest);
		
		
		
		//Another way--->>>>>
		// smallest = c < (a<b? a : b) ? c : (a<b ? a : b) ;
		//System.out.println("The smallest number is: "+smallest);
		
		
		

	}

}
