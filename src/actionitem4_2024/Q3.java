package actionitem4_2024;
import java.util.Arrays;

public class Q3 {
	
	//Q3. Sort elements of an array. 

	public static void main(String[] args) {
				
		
	         //Mahfouz Sir Ways--->>>>
		
	//Using for each loop & Predefined class
		int myArray[] = {89, 76, 2, 34, 5, 7, 56};
		
		//Using predefined class
		Arrays.sort(myArray); //this sort method all the elements of the given array
		
		System.out.println("Elements of Array in Ascending order: ");
		for(int value :myArray) {
			System.out.print(value + "  ");
		}
		
	//Bubble sort Method call:
		System.out.println();
		sortMyarray(myArray);
			

	}
	
	
	//Bubble Sort technique--->>>>
	//Create a new method outside main
	public static void sortMyarray(int[] givenArray) {
		
	int length = givenArray.length;	
		
	for(int i = 0; i<length; i++) {
		
		for(int j=0; j<length-i-1; j++) {
			
			if(givenArray[j]> givenArray[j+1]) {
				//Swapping the elements here-->>>
				int temp = givenArray[j];
				givenArray[j] = givenArray[j+1];
				givenArray[j+1] = temp;
			}
		}
		
	}
	System.out.println("Sorted Array: ");
	
	for(int value: givenArray) {
		System.out.print(value + "\t"); //\t gives 4 spaces gap
	}
	
	
	}
		
	
	

}
