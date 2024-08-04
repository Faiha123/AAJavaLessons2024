package actionitem4_2024;

public class Q1 {
	
	//Q1. Find sum of elements in an int Array. 

	public static void main(String[] args) {
	
		int array[] = {1,2,3};
		int count = 0;
		
		//System.out.println(array.length);//Gives you the array length that starts from 1.
		
		for(int i =0; i<array.length; i++) {
			
			//System.out.println(i);//Gives you only the indexes
			
			//System.out.println(array[i]);//Gives you the elements inside the array
			
			count = count + array[i];//Gives you the sum of all elements
		}
		
		System.out.println("Sum of elements in the int Array is: "+count);
		
		
		//Mahfouz sir way:
		
		int myArray[] = {23, 6, 8, 34, 87, 53, 88};
		int sum = 0;
		for(int value: myArray) {
			sum += value;
		}
		
		System.out.println("The sum of all elements of myArray is: "+ sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
