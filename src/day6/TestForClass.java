package day6;

public class TestForClass {
	
	//Any where you have to create an object you have to have a main method there
	
	public static void main(String[] args) {
		
		//Testing Student Class-->>>>>>
		StudentClassBlueprint st = new StudentClassBlueprint();//For every class there is constructor. if you dont create one jvm creates default one.
		                        //Here 'new Student()' is for creating object.  in left handside youre saving it under reference variable.
		
		st.sid = 1001;
		st.name = "David";
		st.grade = 'A';
		st.printStudentData();
		
		
		//Static methods can be directly called in the main method. if not then you need to create an object.
		
		//Testing Employee Class-->>>>>>
		EmployeeClassBlueprint em = new EmployeeClassBlueprint();
		em.id = 7007;
		em.name = "Smith";
		em.department = "Finance";
		em.salary = 130000;
		em.display();
		
		//new EmployeeClassBlueprint().name = "Sravani"; //Now assign value and call methods directly
		             //Without using reference variable. Directly using the object of the class
		         //But it gives you default values. 0 in case of int and others null.
		///Because it can't read the initialized values. bcz everytime you'd create new object.
		
		
		
		
	}

}
