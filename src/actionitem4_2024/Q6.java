package actionitem4_2024;

public class Q6 {
	
	//Q6. Remove Junk or Special character from a String. 

	public static void main(String[] args) {
		
		//You remove junk spaces using one of String Method named -->>
		
		String doubtfulInput = "Th is is my string with Special Characters: _#$%&";
		String result = doubtfulInput.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(result);

	}

}
