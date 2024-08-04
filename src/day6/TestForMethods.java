package day6;

public class TestForMethods {

	public static void main(String[] args) {
		
		MethodsAndConstructors meth = new MethodsAndConstructors();
		
		//No Params No Returns:
		meth.methodOne();
		
		//No Params, Returns value:
		String result = meth.methodTwo();//Since it is returning a result in String you need to save it under a String variable.
		System.out.println(result);//Then print the variable
		
		//Takes Parameters, No Return  
		meth.methodThree("Sarmin");
		
		//Takes Parameters, Returns values:
		int sum = meth.add(100, 300);
		System.out.println(sum);
		

	}

}
