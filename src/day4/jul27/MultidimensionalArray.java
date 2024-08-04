package day4.jul27;
import java.util.Scanner;

public class MultidimensionalArray {
	
	//it is 2d. Array inside array
	// you have 0,1,2,3. meaning single dimensional array
	// then in 0.. you have 0,1,2...
	// in 1 you have 0,1,2...
	// in 2 you have 0,1,2...
	// in 3 you have 0,1,2...
	
	//There are also 3d 4d arrays but we are discussing only up to 2d array
	//if you think rows and columns it would make sense only up to 2d array
	//so you should remember it like arrays in array. not with rows & columns
	
	public static void main(String[] args) {
		
		//Declaration of 2d array-->>>
		
		int a[][] = new int [3][2]; //Outer array 3--> 0,1,2
		                            //inner array 2--> 0,1
		//that means in 0--> 0,1 ; in 1--> 0,1 ; in 2--> 0,1
		
		//Assigning values to the cells--->>>>
		a[0][0] = 100;
		a[0][1] = 200;
		
		a[1][0] = 600;
		a[1][1] = 700;
		
		a[2][0] = 800;
		a[2][1] = 900; //So there are total 6 values
		
		//How to print a value
		System.out.println(a[1][1]);//700
		
		//Simple way of declaring and initializing/assigning 2D array-->>>>
		int b[][]= {{1,2},{3,4},{5,6}}; //outer- 0,1,2; inner- 0,1.
		//you wanna print 6 from here. How do you do it??--->>>>
		System.out.println(b[2][1]);
		
		//JAGGED ARRAY--->>>
		//does not maintain uniformity. meaning-->>>>
		int c[][]= {{1,2,10},{3,4,23},{5,6,24,67,45}}; //the 3rd one more longer
		
		//How do you print all the 2d 'a' values??
		for(int i = 0; i< a.length; i++) {
			
			for(int j = 0; j<a[i].length; j++) {
				System.out.println(a[i][j]);
			}
			
		}
		
		//Now How do you print all the 2d 'c' values?? Jagged Array>>>>
		//The same process
		//bcz you are utilizing the .length method
		for(int i=0; i<c.length; i++) {
			
			for(int j=0; j<c[i].length; j++) {
				
				System.out.println(c[i][j]);
			}
			
		}
		
		//How to print all the 2d array using For Each loop----->>>>>>>
		
		for(int arr[]:c) {
			
			for(int x :arr) {
				System.out.print(x +" "); //+" " you are using to print the arrays organized as they are
			}
			System.out.println();
		}
		
		
		//How can you search and find an element from an array??-->>>>>>>
		
		int ar[] = {10, 40, 20, 30, 60, 50, 90, 80};//Declare the array first
		
		boolean status = false;//then declare a boolean variable
		
		int search_num = 90;//then declare the element you want to find
		
		for(int i=0; i<ar.length; i++) { //write a loop
			
			if(search_num == ar[i]) { //Give a if condition
				System.out.println("Element found!");
				status = true; //if it is found
				break; //get out of the loop
			}			
		}
		
		if(status == false) {
			System.out.println("Sorry! Element not found.");
		}
		
		//             SCANNER CLASS>>>>>>>>>
		
		//Another way to find an element is to use Scanner class from java.util package
		//imports Scanner class. Then create an object of the Scanner class		
		
//		Scanner sc = new Scanner(System.in);//in the argument pass 'System.in'. you can put the value in the console what you are trying to find
//		System.out.println("Please type a number to search for.");
//		int searchNum = sc.nextInt();//use the reference variable and nextInt method and save under a variable
//         for(int i=0; i<ar.length; i++) { //write a loop
//			
//			if(searchNum == ar[i]) { //Give a if condition
//				System.out.println("Element found!");
//				status = true; //if it is found
//				break; //get out of the loop
//			}			
//		}
		
         
       //nOW IF YOU WANT TO find if there is a particular element more than once.
         
         int x[]= {10,30,45,30,30,40,50,20,10};
         
         int numLookingFor = 30;
         int count = 0;
         
         for(int value : x) {
        	 if(value== numLookingFor) {
        		 count++;
        	 }
         }
        
         System.out.println(numLookingFor+ " is present "+ count + " times.");
         
      
       //Declare an int array. Find out how many even and odd numbers are available in that array.
         
         int fa[] = {1,2,3,4,5,6,7,8,9,10};
         
         int even = 0;
         int odd = 0;
         
         for(int var :fa) {
        	 if(var%2 == 0) {
        		even++; 
        	 } else {
        		 odd++;
        	 }
         }
         System.out.println("Number of even numbers: "+ even);
         System.out.println("Number of odd numbers: "+ odd);
		
	}

}
