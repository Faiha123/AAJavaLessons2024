package day6;

public class MethodsAndConstructors {	
		
		                   //METHODS:
		
		//Method: Block of code or group of statements grouped together to perform certain actions.
		//Standard practice is method name should be a verb. Not noun.
	//Methods can be invoked through objects. we create methods to perform certain actions.
		//95% time you avoid static method.
		
		//Catagories of Methods (depending on arguments and return type)-->>>
		//No parameter No return
		//No parameter but returns value
		//Takes parameters but does not return value
		//Takes parameters also return values

	
	                 //No Params No Returns:
	
	public void methodOne() {
		System.out.println("Hey! we are learning method!");
	}
	
	                 //No params, Returns value:
	
	public String methodTwo() {
		//Usually you perform certain actions here.
		//Whatever the outcome of that action comes here
		//return ("hello world");//then you return the outcome
		//AFTER RETURN YOU CAN NOT WRITE ANY LINE IN THAT METHOD. SO THAT SHOULD BE THE LAST LINE
		
		String a = "Hello. ";
		String b = "How are you";
		return a+b;
		
	}
	
	                 //Takes Parameters, No Return      
	
	
	public void methodThree(String name) {//it can have n number of params, different names of course
		
		System.out.println(name + ", how are you?");
		//At the time of method call, it will ask the parameter in main.		
		
	}
	
	
	
	                //Takes Parameters, Returns values:
	
	public int add(int a, int b) {
		
		return (a+b);
		
	}
	
	
	                   
	

}
