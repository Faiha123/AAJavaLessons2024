package actionitem2_2024;

public class Q6 {
	
	//Q6. Write a method that accepts Celsius temperature as argument. The 
	//method should return Fahrenheit temperature after converting Celsius 
			//into Fahrenheit. [Formula F=(C x 9/5) + 32] 
	
	
	public static double convertToFahrenheit(int celcius) {
		double fahrenheit;
		fahrenheit = ((celcius * 9)/5) + 32;
		return fahrenheit;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Fahrenheit value is: " +convertToFahrenheit(34));

	}

}
