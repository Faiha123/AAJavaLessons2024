package day6;

public class ConstructorDemo {
	
	 //CONSTRUCTORS:
	
		//Constructor may or may not have parameters. no params are default
		//No return type
		//Same as class name
	//We need constructor to initialize class variables. to assign values.
		
		//Here you are declaring attributes in the class level.
		String name;
		String street;
		int houseNumber;
		String zipCode;
		
		//this way you use methods to assign the variables
		public String declareAddress() {
			return (name+ "\n" +houseNumber+ ", "+street+ "\n" + zipCode);
		}
		
		
		//this way you use constructor to assign value
		public ConstructorDemo(String name, String street,int houseNumber,String zipCode ) {
			
			this.name = name;
			this.street = street;
			this.houseNumber = houseNumber;
			this.zipCode = zipCode;
			//this keyword refers to anything declared in the class level
			//you are using it here bcz you are showing jvm that the local variables and the class variables are same.
			
		}

}
