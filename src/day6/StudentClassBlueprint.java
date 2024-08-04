package day6;

public class StudentClassBlueprint {
	
	//This is a Class. it is somewhere in the ram. but it gets saved in the heap once you create an object of this.
	//Class is a collection of Attributes and Behaviors
	//Usually in a class you should not have a main method
	//Object is an instance of a Class. But unlike class, object has physical entity. and occupies memory in heap
	//You can create n number of object for a class.
	
	//Attributes-->>>
	int sid;
	String name;
	char grade;
	
	//Behavior--->>>
	public void printStudentData() {
		System.out.println(sid + " "+ name+ " "+grade);
	}

}
