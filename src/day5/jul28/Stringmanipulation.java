package day5.jul28;

public class Stringmanipulation {

	public static void main(String[] args) {
		// Strings are immutable - it can not be changed
		String s = "Welcome 123";//String is a predefined class in java, actually not a datatype //You declared a string literal here
		s = "Welcome to Java Selenium";//JVM created a seperate memory for this one in the Heap memory
		
		//When you create a String literal like this, it gets saved in 'Constant memory pull' of HEAP memory.
		//A designated place in the Heap memory. A reserved place for only String Literals.
		
		
		int num = 1000;
		num = 2000;//but in case of any other data types like here int, it is using the same memory
		
		
		
		//Another way of declaring String
		String s2 = new String("Welcome");//This type is basically creating object
		
		//Since String is a predefined class, it has methods and variables
		
		        
		     //important METHODS in String Class-->>>>>
		
		           //1)length() :
		
		//Counts all the characters in a String and returns number in int datatype
		int length = s2.length();// in case of length(), counting starts from 1.
		System.out.println("The length is: "+length);//7
		System.out.println(s.length());//11
		
		           //2)concat() :
		
		//join multiple strings
		String s1 = "Welcome";
		String s3 = " to java";
		String s4 = " programming.";
		System.out.println(s1+s3);//using the variables only
		System.out.println(s1.concat(s3).concat(s4));//method chaining. most of the time developers use this instead of the other one.
		
		           //3)trim() :
		
		//would trim any leading and trailing spaces from a String
		//Sometimes in your script while testing throws error bcz of spaces.
		//you use toString() but feel everything okay in the Script but there was a space
		//then you need this trim() method to remove them
		s = "     welcome to java   ";
		System.out.println(s.length());//25
		s.trim();
		System.out.println(s.length());//25. bcz it remains same, won't change the original value
		
		System.out.println(s.trim().length());//Now it should work. gives 15
		
		
		           //4)charAt() :
		
		//Returns a single character out of a String from specific index 
		//String is a collection of Array characters?
		s = "Java Selenium";
		System.out.println(s.charAt(5));// in case of charAt, you need to start from 0. bcz it is a part of array.
		
		
		           //5)contains() :
		
		//Returns boolean
		//it checks a String if it is part of the main String or not
		System.out.println(s.contains("jav"));//false. bcz contains() is case sensitive.
		System.out.println(s.contains("Sel"));//true
		System.out.println(s.contains("Sli"));//false. contains() can't compare in between letters. it has to be sequential
		System.out.println(s.contains("ium"));//true
		
		
		           //6)equals(), equalsIgnoreCase() :
		
		//Compares two Strings and returns true/false
		s1= "Welcome";
		s2= "welcome";
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equalsIgnoreCase(s2));//true
		System.out.println("Welcome".equals(s2));//you can use the Strings too. false
		
		
		           //7)replace() :
		
		//it replaces a single character or character sequence of a given String. 
		s = "welcome to java selenium automation";
		System.out.println(s.replace("w", "W"));
		System.out.println(s.replace("java", "python"));
		System.out.println(s.replace(" ", "_"));//welcome_to_java_selenium_automation
		
		
		           //8)substring() :
		
		//it is a overloaded method that extracts substring from the main String
		System.out.println(s.substring(11));//java selenium automation //also index starts from 0
		System.out.println(s.substring(11, 15));//java
		
		
		           //9)toUpperCase(), toLowerCase() :
		
		//converts cases
		System.out.println(s.toUpperCase());//WELCOME
		System.out.println(s.toLowerCase());//welcome
		
		
		           //10)split() :
		
		//splits or divides original String into multiple parts based on delimiter
		s = "abc@xyz";//for example you need to split an email address
		String a[] = s.split("@");
		System.out.println(a[1]);//xyz. bcz it got splitted in the previous line. abc became 0 index. xyz became index 1.
		s = "welcome to java selenium automation";
		String b[] = s.split(" ");//got splitted by space, everything else turned into index starting from 0.
		System.out.println(b[2]);//java
		//extract only abc from the following String
		s = "abc,123@m.com";
		String[] c = s.split(",");
		System.out.println(c[0]);//abc
		

	}

}
