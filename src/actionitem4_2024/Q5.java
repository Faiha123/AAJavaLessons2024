package actionitem4_2024;

public class Q5 {
	
	//Q5. Check to see if a string is palindrome or not. 

	public static void main(String[] args) {
		
		String input = "adda";
		
		System.out.println(isPalindrome(input));
		

	}
	
	public static boolean isPalindrome(String str) {
		
		String reversed = "";
		
		for(int i = str.length() -1; i>=0; i--) {//Start from last character then going back to front
			
			reversed += str.charAt(i);
		}
		
		return str.equals(reversed);
	}

}
