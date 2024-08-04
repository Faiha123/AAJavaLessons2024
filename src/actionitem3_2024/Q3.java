package actionitem3_2024;

public class Q3 {
	
	//Q3. Print day number of week based on day name (Use Switch case). 

	public static void main(String[] args) {
		
		findDay("Sunday");
	
		//Mahfouz sir way-->>>>>
		
	String day = "Monday".toLowerCase();
	
	switch(day) {
	
	case "monday" :{
		System.out.println("Day one");
		break;
	}
	
	case "tuesday":{
		System.out.println("Day two");
		break;
	}
	
	case "wednesday":{
		System.out.println("Day three");
		break;
	}
	case "thursday":{
		System.out.println("Day four");
		break;
	}
	case "friday":{
		System.out.println("Day five");
		break;
	}	
	case "saturday":{
		System.out.println("Day six");
		break;
	}
	case "sunday":{
		System.out.println("Day seven");
		break;
	}
	
	default: {
		System.out.println("invalid day name!");
		//return;   -> often used here to terminate the program here
	}
	
	     }
	
	
		
	}
		
		public static void findDay (String dayName) {
			
			switch(dayName) {
			
			case "Monday" :{
				System.out.println("Day 1");
				break;
			}
			
			case "Tuesday":{
				System.out.println("Day 2");
				break;
			}
			
			case "Wednesday":{
				System.out.println("Day 3");
				break;
			}
			case "Thursday":{
				System.out.println("Day 4");
				break;
			}
			case "Friday":{
				System.out.println("Day 5");
				break;
			}
			case "Saturday":{
				System.out.println("Day 6");
				break;
			}
			case "Sunday":{
				System.out.println("Day 7");
				break;
			}
			
			default: {
				System.out.println("Not a day");
			}
			
			}

	}

}
