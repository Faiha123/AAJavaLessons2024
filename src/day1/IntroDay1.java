package day1;

public class IntroDay1 {
	
	//Downloaded java17

	//What is Automation? Why we need Automation?
	//2 methodologies in software development---> Waterfall, Agile.
	//in agile--> scrum framework, kanban framework, extreme framework.
	//Sprint1 your team is delivering homepage. i.e: you got 3 stories. you create test cases for every one of them. Sp1 you won't have regression suite. bcz there's nothing to repeat.
	//Sp cycle is 1-4 week. but 90% 2 weeks.
	//Sprint2--> you and your team now work on the links/tabs of homepage so that you get into the next pages wherever you click.
	//But now you make sure nothing broken in the homepage that was built previously. so you need regression suite.
	//Anything falls under the regression suite, those are to be automated.
	//Sprint3--> you got more additional stories. sp2 works also added into regression.
	//So regression suite get increased and increased as sprints goes on.
	//when small project.. usually followed by waterfall methodology.
	//In agile.. you definitely need automation (more than 6months long)..(bank, e-commerce, insurance app etc)
	
	//What are the TYPES OF TOOLS to be used for automation--> 1.OPEN SOURCE 2.ENTERPRISE tool
	//Open source tool--> free to use.Its source code is also available in github. Selenium, Appium (mobile), Jmeter
	//Selenium--> is a library. with predefined classes and packages.
	//Enterprise tool--> pay. source code is not shown. just like coca cola. nobody knows the recipe. i.e: UFT.
	
	//TYPES OF APPLICATIONS--> 1.Mobile app 2.Web-based app 3.Client server app 4.Desktop app.
	//Web based app--> any app which is launched through a browser.
	//Mobile app--> 
	//Client server app--> version control system (git, github)
	//Desktop app--> whichever needs an installation in the desktop.
	//we are focusing on web based applications here.
	//For mobile app.. we use OPIUM.

	//Memories in java--> Stack(outside)(JVM uses it), Heap(inside)(JRE?)
	//Variables--> are the place holders to save data under the heap memory.
	//4 Access Modifiers/Specifiers--> Public, Protected, Private, Default.
	//Data types (in Wrapper class?)--> primitive (pre defined), non primitive (user defined)
	//Byte.MIN_VALUE(-128), Byte.MAX_VALUE (127), Byte.SIZE (gives you size in bits)
	//The wrapper class is different for int? wrapper class of integer is to type it whole. Integer.MIN_VALUE like this
	//Constant Memory Pull--> It is the place in heap memory for String Literal(
	
	//TypeCasting-->
	
	//Downloading Eclipse-->www.eclipse.org--> Download x86_64. Download Packages--> 
	//-->Eclipse Packages--> Eclipse IDE for Java Developers(this one for testers. The Enterprise one for the developers)-->
	//-->Eclipse 2024-06--> Windowsx86_64--> Download-->
	
	public static void main(String[] args) {
		
		int myInt2 = 32767;//if it exceeds this number it prints you only the maximum number for short
		short myShort = 10;
		myShort = (short)(myInt2);
		System.out.println(myShort);
		
		
		

	}

}
