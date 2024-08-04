package actionitem4_2024;

public class Q2 {

	// Q2. Print even and odd numbers from an Array.

	public static void main(String[] args) {

		int array[] = { 1, 2, 3 };

		System.out.println("Even Numbers are: ");
		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 == 0) {
				System.out.println(array[i]);
			} 
		}
		
		System.out.println("Odd Numbers are: ");
		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 == 1) {
				System.out.println(array[i]);
			}
		}
		
		System.out.println("---------Using Enhanced For loop----------");
		
		for(int s: array) {
			String even = (s%2==0) ? "Even Number: "+s : "Odd Number: "+s;
			System.out.println(even); 
		}

	
	
	//Mahfouz sir way--->>>
		
		int arr[] = {2,7,3,78,23,44,66,35};
	
	System.out.println("Printing all the Odd numbers: ");
	for(int i =0; i<arr.length; i++ ) {
		
		if(arr[i]%2 != 0) {
			System.out.print(arr[i] + "  ");
		}	
	}
	
	System.out.println("Printing all the Even numbers: ");
	for(int i=0; i<arr.length; i++ ) {
		
		if(arr[i]%2 == 0) {
			System.out.print(arr[i] + "  ");
		}	
	
	
	}

}
	
}
