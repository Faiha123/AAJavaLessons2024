package actionitem3_2024;

import java.util.Scanner;

public class Q5 {
	
	//Q5. Find out a number is palindrome or not (use conditional 
	//statements + looping). If a given number is 121 after reversing it 
	//remains as 121 then we shall call this number as palindrome. 

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int number = num;
//		int reverse = 0;
//		
//		while(num>0) {
//			reverse = reverse*10 + num%10;
//			num = num /10;
//		}
//		
//		if(number == reverse) {
//		System.out.println("Palindrome");
//		}
//		else {
//		System.out.println("Not Palindrome");
//		}
		
		
	//Mahfouz sir way--->>>>>
		
		int originalNum = 8317206, rev = 0;
		int numBer = originalNum;
		
		System.out.println("The original number is: "+ originalNum);
		
		while(numBer != 0) {
			
			int remainder = numBer % 10;
			rev = rev*10 + remainder;			
			numBer = numBer / 10;
		}
		
		System.out.println("The reverse number is: "+ rev);
		
		if(originalNum == rev) {
			System.out.println("Palindrome");
			}
			else {
			System.out.println("Not Palindrome");
			}
		
		
		
		

	}

}
