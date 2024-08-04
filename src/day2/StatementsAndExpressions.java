package day2;

public class StatementsAndExpressions {

	                     //EXPRESSIONS:
	
	    // Anything that concludes into single value. typically right side of an assignment operator is generally an Expression in java. (not in case of array though)
		// Expression is a java construct in java that evaluates a single value
		// Expression is a construct that evaluates to a single value. So end of the day gives you a single value
		// Expression can be as simple as a literal or a variable or as complex as a combination of multiple operators and method calls.

	//Example of Expression: (Literal or Variable)
	//int x = 5; here 5 is an expression
	//int y = x; here x is an expression
	
	//Examples from Arithmetic Operations:
	//int sum = x + y; here x+y is expression
	//sum = (12+25) + (20/5); here (12+25) + (20/5) expression. this is COMPLEX
	
	//Example of Method call
	//int length = "Hello".length(); here "Hello".length() is an expression
	
	//Boolean Expression
	//boolean adult = age >= 18; here age >= 18 is expression
	
	
	
	                   //Statements:
	
	     //A statement is a complete unit of expression that performs some actions
	     //they are made up of some expressions
	     //Statements are usually terminated by a ; or }
	     //Statements are composed of expressions
	
	//Types of Statements:
	//1) Declaration Statement
	//2) Assignment Statement
	//3) Expression Statement
	//4) Control Flow Statements - (Conditional, Loop, Switch, Return, Try-Catch)
	
	
	//1)DECLARATION Statements: int x;
	
	//2)ASSIGNMENT Statement: x = 24;
	
	//3)EXPRESSION Statement: x = y + 23; //bcz needs evaluation. A calculation is taking place to assign value to x
	
	//4)CONTROL FLOW Statements:
	
	  //i)CONDITIONAL Statement:
	                            //if(x>0){ System.out.println("Positive")}
	
	  //ii)LOOP Statement:
	                       //(for int i=0; i<=5; i++){System.out.println(i)}
	
	  //iii)SWITCH Statement:
	                  //int day=3;
	                  //switch(day){
	                  //case1:System.out.println("Monday");
	                  //return;
	                  //case1:System.out.println("Tuesday");
	                  //return;
	                  //}
	//JUMP statements
	
	  //iv)RETURN Statement:
	                 //public int doSum(int a, int b){
	                 //   return a + b;}
	
	  //TRY-CATCH Statement:
	
	                //try{ int result = 10/0;}
	                //catch(ArithmeticException e)
	                //{System.out.println("Arithmetic exception");}
	
	public static void main(String[] args) {
		
		//4)CONTROL STATEMENTS------------>>>>>>>>>>>>>>               
		
		                //<-------------i)CONDITIONAL Statement----------->
		 
		
		/*(IF CONDITIONS)
		 * if
		 * if else (if else ladder/nested if)
		 * 
		 */
		
		//IF:
		/*
		 * if(boolean condition){
		 *  block of code or statement
		 *  }
		 */
		
		//Example1:
		if(true) {
			System.out.println("We speak the truth");
		}
		
		if(false) {
			System.out.println("We speak the lie");//won't print it anymore
		}
		System.out.println("End of the program");//only prints this
		
		
		//Example2:
		//if-else Demo:
		int person_age = 25;
		if (person_age >= 18) {
			System.out.println("Eligible to vote");
		} else {
			System.out.println("Not Eligible to vote");
		}
		System.out.println("End of if condition");
		
		
		//Example 3: 
		//if-else ladder Demo:
		//write a program when result is >=90 should be grade A. <90 to <=70 grade B. >=60 <70 grade C. rest F.
		
		int result = 95;
		
		if(result<=100 && result>=90) {
			System.out.println("Grade A");
		} else if(result<90 && result>=70) {
			System.out.println("Grade B");
		} else if(result<70 && result>=60) {
			System.out.println("Grade c");
		} else {
			System.out.println("Grade F");
		}
		
		
		            //<-------------ii)SWITCH Statement:------------>
		
		/*switch(variable) {
		
		case 1:{
		//code
			break;
		}
		case 2: {
			//code
			break;
		}
		default:{
			//code
		}
		
		}*/
		
		
	int num = 3;
	
	switch(num) {
	
	case 1 : {
		System.out.println("Monday");
		break;
	}
	
	case 2 : {
		System.out.println("Tuesday");
		break;
	}
	
	case 3 : {
		System.out.println("Wednesday");
		break;
	}
	
	case 4 : {
		System.out.println("Thursday");
		break;
	}
	
	case 5 : {
		System.out.println("Friday");
		break;
	}
	
	default : {
		System.out.println("This is Weekend");
		
	}
	
	               }
	
	System.out.println("End of Switch-Case");
	
	//Do-now: Write a switch statement to determine which browser to be launched?(Chrome, Firefox, Edge)
	
	int browserName = 2;
	
	switch(browserName) {
	
	case 1 : {
		System.out.println("Chrome");
		break;
	}
	
	case 2 : {
		System.out.println("Firefox");
		break;
	}
	
	case 3 : {
		System.out.println("Edge");
		break;
	}
	
	default : {
		System.out.println("Out of Web browsers");
	}
	
	}
	
	System.out.println("Out of Switch case for launching browsers");
	
	determineBrowser("chrome");
	
	
	      //<----------------ii)LOOP Statements:----------->
	
	//For loop
	//while loop
	//do while loop
	
	            //FOR LOOP------->>>>>>
	
	//dO-nOW: pRINT numbers from 1 to 5.
	for(int i=1; i<=5; i++) {
		System.out.println(i);
	}
	//print your name 5 times
	for(int i=1; i<=5; i++) {
		System.out.println("Faiha");
	}
	//print 10 to 1
	for(int i=10; i>=1; i--) {
		System.out.println(i);
	}
	
	//if you know the # of iteration in advance you use for loop
	
	
	            //WHILE LOOP------->>>>>>
	
	//print 1-5 using while loop
	
	int numb = 1;
	
	while(numb<=5) {
		System.out.println(numb);
		numb++;
	}
	//if you are uncertain about the # of iterations.....
	//and the loop termination is based on a condition
	//the while loop is a good choice. It is the most preferred one.
	
	
	            //DO WHILE LOOP----->>>>>>>
	
	int n = 1;
	
	do {
		System.out.println(n);
		System.out.println("john");
		n++;
	} while (n<=5);
	
	//do-while loop executes at least once.
	
	
	
	           //JUMP STATEMENTS------>>>>>>
	
	//BREAK:>>>>>>>>>>
	
	for(int i=1; i<=10; i++) {
		System.out.println(i);//excludes printing 6-10
		if(i==5) {
			break;//jumping statement
		}
	}
	
	//CONTINUE:>>>>>>>>>>
	
	//you want #3 to be skipped
	for(int i=1; i<=5; i++) {
		
		if(i==3) {
			continue;//skip the current sequence
		}
		System.out.println(i);//skips 3
	}
	
	//RETURN:>>>>>>>>>>>>>
	
	
	
	}
	
	public static void determineBrowser(String browserName) {
		
		switch(browserName) {
		
		case "chrome" :{
			System.out.println("Launching Chrome browser");
			break;
		}
		
		case "firefox":{
			System.out.println("Launching Firefox browser");
			break;
		}
		
		case "Edge":{
			System.out.println("Launching Edge browser");
			break;
		}
		
		default: {
			System.out.println("This browser is not supported");
		}
		
		}
		
	}
		
		
		
	}


