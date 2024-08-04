package actionitem3_2024;

public class Q6 {
	
	//Q6. Count Number of Digits in a Number (use looping statements) 

	public static void main(String[] args) {
		
		int num = 123456;
		int count = 0;
		
		while(num>0) {
		num = num/10;
		count++;
		}
		
		System.out.println(count);
		

	}

}
