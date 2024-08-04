package actionitem3_2024;

public class Q7 {
	
	//Q7. Count Number of Even and Odd digits in a Number (use any technique). 
	

	public static void main(String[] args) {
		
		int num = 123456;
		int countEven = 0;
		int countOdd = 0;
		
		while(num>0) {
		num = num/10;
		if(num%2==0) {
			countEven++;
		} else {
			countOdd++;
		}
		
		}
		
		System.out.println("Even digits are: " +countEven);
		System.out.println("Odd digits are: " +countOdd);
		
		
		//Mahfouz sir way--->>>>
		int number = 251, oddCount=0, evencount=0;
		
		while(number>0) {
			int digit = number%10;
			
			if(digit%2==0) {
				evencount++;
			}else {
				oddCount++;
			}
			number /= 10;
		}
		System.out.println("Even count: "+evencount);
		System.out.println("Odd count: "+oddCount);
		
		
		
		

	}

}
