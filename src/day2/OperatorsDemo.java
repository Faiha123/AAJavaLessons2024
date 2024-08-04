package day2;

public class OperatorsDemo {

	// Operators: is a symbol which performs an operation. An operator works with Operands
	// i.e: int c= a + b. here a and b are the variables which are the Operands.
	
	//Types of Operators:
	//1) Arithmeetic Operator: 5types. (+ - * / %)
	//2) Relational/Comparison Operators: 6types. (> < >= <= != ==)
	//3) Logical Operators: 3types. (&& || !) (Logical And, Logical Or, Logical not)
	//4) Increment & Decrement Operators: 2types. (++ --)
	//5) Assignment Operator: 1 mainly (=). But 6 when associate with all arithmetic operators.
	//6) Conditional/Ternary Operator: 2types. (? :)   
	
	public static void main(String[] args) {
		
		int a = 20, b = 10;
		
		        //ARITHMETIC Operators:   
		        //( + - * / %)		
	 
	 System.out.println("Sum of a and b is "+ a+b);//30 expected. but gave you 2010
	 //bcz rather than calculating, it comcatenates. 
	 //Correct way to calculate-->
	 System.out.println("Sum of a and b is "+ (a+b));//keep them inside brackets
	 System.out.println("Diff of a and b is "+ (a-b));//10
	 System.out.println("Mul of a and b is "+ (a*b));//200
	 System.out.println("Div of a and b is "+ (a/b));//2
	 System.out.println("Mod of a and b is "+ (a%b));//0; Gives you the remain
	 
	 
	         //COMPARISON / RELATIONAL Operators:
	         //(> < >= <= != ==)     ---> Always Returns you a boolean value
	 
	 System.out.println(a>b);//true
	 System.out.println(a<b);//false
	 System.out.println(a>=b);//true
	 System.out.println(a<=b);//false
	 System.out.println(a!=b);//true
	 System.out.println(a==b);//false
	 
	 
	          //3) LOGICAL Operators:
	    // (&& || !)     ---> Also Returns you Boolean value. Difference is it works between 2 boolean values.
	 
	 boolean x = true, y = false;
	 System.out.println(x);//True
	 System.out.println(y);//False
	 System.out.println(x && y);//False. But why? bcz it is looking for both of them to be true
	 System.out.println(x || y);//True. bcz one of them is true. since it is 'or'
	 System.out.println(!x);//False
	 System.out.println(!y);//True
	 
	 
	          //INCREMENT & DECREMENT Operators:
	          // (++ --)   -->
	 
	 //INCREMENT: ++
	 int f = 10;
	 //f = f + 1;--> prints 11
	 f++;//also will print 11
	 System.out.println(f);//would print 11
	 
	 //POST INCREMENT--> (Assign, then increase)
	 int e = 10;
	 int result = e++;
	 System.out.println(result);//should print 11, but prints 10.
	 //you experience this when you assign this into a new variable. in this case you used variable'result'
	 System.out.println(e);
	 
	 //PRE INCREMENT--> (increase first, then assign)
	 int s = 20;
	 int res = ++s;
	 System.out.println(res);//21
	 
	 
	 //DECREMENT: --
	 //int z = 100;
	 //z = z - 1;
	 //z--;
	 //System.out.println(z);
	 
	 //POST Decrement-->
	 int z = 100;
	 int r = z--;
	 System.out.println(r);//100
	 System.out.println(z);//99
	 
	//PRE Decrement-->
	 int v = 100;
	 int re = --v;
	 System.out.println(re);//99
	 
	       
	 
	              //ASSIGNMENT Operators:
	              // = += -= *= /= %=
	 
	 //Example1:
	 //Increase t by 5
	 int t = 10;
	 //t = t + 5;  //increasing by more than 1.
	 t+=5;
	 System.out.println(t);//15
	 
	 //Example2:
	 //Decrease g by 5
	 int g = 10;
	 //g = g - 5;
	 g -= 5;
	 System.out.println(g);//5
	 
	//Example3:
	 //multiply h by 5
	 int h = 10;
	 h *= 5;
	 System.out.println(h);
	 
	//Example4:
	//divide r by 4
		 int l = 16;
		 l /= 4;
		 System.out.println(l);
	 
	//Example4:
	//Mod j by 4
		int j = 10;
		j %= 4;
		System.out.println(j);// 2 remains
		
		
		
		       //TERNARY/CONDITIONAL Operator-->
		       //(? :)
		       //you have to type in between them
		       //left handside before ? has to be provided a logic. can't provide only variable.
		
		//Create a function using Ternary operator
		
		int age = 25;
		//(age >= 18) ? "Eligible to vote" : "Not Eligible to vote";
		String candidate = (age >= 18) ? "Eligible to vote" : "Not Eligible to vote";
		System.out.println(candidate); 
		
		int k = 25, d = 10;
		//Do something so that the values swap.
		d += 15;
		System.out.println(d);
		k -= 15;
		System.out.println(k);
		
		System.out.println("initial value of k is: "+ k);
		System.out.println("initial value of d is: "+ d);
		k = k + d;
		d = k - d;
		k = k - d;
		System.out.println("Final value of k is: "+ k + "and d is: "+ d);
		//This technique is called step ....
		
		
		       //UNARY Operators:
		      //Any operators that works on single operands
		// ++ -- = += -= *= /= %= !
		
		
		        //BINARY Operators
		        //Works on 2 Operands. All Arythmetic and Relational operators
		//+ - * / % > < >= <= != == && ||

	}

}
