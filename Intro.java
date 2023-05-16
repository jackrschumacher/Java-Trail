import java.util.*;
public class Intro{
	Scanner in = new Scanner(System.in);
	public String Description(String version){
		String startChoice;
		System.out.println("Welcome to Java Trail");
		System.out.println("===============================");
		System.out.println("A Java- based Oregon Trail Game");
		System.out.println("Developed By Jack Schumacher in 2023");
		System.out.println("Version "+ version);
		startChoice = Story();
		buySupplies();
		return "";
	}
	public String Story(){
		String startChoice;
		String name;
		System.out.println("You are about to embark on a journey westward.");
		System.out.println("You can decide where you would like to begin your journey. Enter where you would like to start on the next line:");
		startChoice = in.nextLine();
		System.out.println("You have decided to start at:"+ startChoice);
		System.out.println("You will end in Ventura, California");
		return startChoice;
		
		
		
	}
	public String buySupplies(){
		System.out.println("");
		return "";
	}
	
	
	

}