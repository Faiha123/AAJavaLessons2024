package actionitem3_2024;

import java.util.Scanner;

public class Q4 {
	
	//Q4. Reverse a number (use % / = operators). 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int reverse=0;
		
		while(num>0) {
			reverse=reverse*10 + num%10; //%10 gives you the last digit
			num = num /10; //reduces by a digit
		}
		
		System.out.println(reverse);


		
		
		
		

	}

}
