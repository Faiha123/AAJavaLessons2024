package day4.jul27;
import java.util.Arrays;

public class Array {

	//Array: is collection of elements of same data type (homogenous data).
	//we can store multiple values into a single variable.
	//for example there are 100 roll numbers. you can save them under same variable.
	//2 types--> single dimensional & Multidimensional.
	
	
	public static void main(String[] args) {
		
		//single dimensional array declaration
		int rollNumbers[] = new int[100]; //those 100 roll numbers
		int[] myArray = new int [5]; //Another way to declare //0 to 4
		
		
		myArray[0] = 10;
		myArray[1] = 20;
		myArray[2] = 30;
		myArray[3] = 40;
		myArray[4] = 50;
		
		System.out.println(myArray[4]);//way of extract value from the arrays
		
		//Finding out length of an Array-->
		int length = myArray.length;
		System.out.println("The length of the Array is: "+ length);
		
		//easier way to declaring and assigning/initializing value to an array
		int a[] = {1,2,3,4,5};
		//System.out.println(a[5]); //here java will throw exception. bcz the index is upto 4.
		//array length exception.
		//they might give this to you in interview
		System.out.println(a.length);//length is 5. but index is upto 4.
		
		//Arrays class comes from java.util package. it has a method toString()
		System.out.println(Arrays.toString(a));//what is happening here is all int data types converted into string 
		                           //and gave as a list of them inside [ ]
		
		//How do you extract all the values of an Array??
		//Use loops
		
		for(int i=0; i<5; i++) {
			System.out.println(myArray[i]);
		}	
		
		//Enhanced For loop/ For-Each loop
		//the new variable gets on the left hand side
		//the right hand side is the previously declared array variable
		for(int s: a) {
			System.out.println(s); //all of the array values gets printed
		}
		
		//printing values from last to first
//		for(int i=5; i>=0; i--) {
//			System.out.println(myArray[i]);
//		}       THROWS EXCEPTION HERE TOOOO
		//TO MAKE SURE NO EXCEPTION HAPPENS, PUT "i = myArray.length-1"
		
		for(int i= myArray.length-1; i>=0; i--) {
			System.out.println(myArray[i]);
		}

		

	}

}
