import java.util.*;
public class Intro{
	Scanner in = new Scanner(System.in);
	public String Description(String version){
		String startChoice;
		int moneyAmount = 0;
		System.out.println("Welcome to Java Trail");
		System.out.println("===============================");
		System.out.println("A Java- based Oregon Trail Game");
		System.out.println("Developed By Jack Schumacher in 2023");
		System.out.println("Version "+ version);
		startChoice = Story();
		moneyAmount = buySupplies();
		Journey.Travel(startChoice, moneyAmount);
		return "";
	}
	public String Story(){
		String startChoice;
		System.out.println("You are about to embark on a journey westward.");
		System.out.println("You can decide where you would like to begin your journey. Enter where you would like to start on the next line:");
		startChoice = in.next();
		System.out.println("You have decided to start at:"+ startChoice);
		System.out.println("You will end in Ventura, California");
		return startChoice;
		
		
		
	}
	public int buySupplies(){
		int moneyAmount = 1500;
		int flourAmount = 0;
		int riceAmount = 0;
		int waterAmount = 0;
		int hayAmount = 0;
		int totalFoodAmount = 0;
		System.out.println("You will now buy supplies for your journey");
		System.out.println("This is a list of pices for your goods for your refrence:");
		System.out.println("Flour: $15/pound");
		System.out.println("Water: $1/pound");
		System.out.println("Hay: $3/pound");

		
		System.out.println("How much Flour would you like to buy?");
		flourAmount = in.nextInt();
		while((moneyAmount - (flourAmount * 15)) < 0){
			System.out.println("This is invalid. please Try Again");
			System.out.println("How much Flour would you like to buy?");
			flourAmount = in.nextInt();
		}
		moneyAmount -= (flourAmount * 15);
		System.out.println("You have "+ moneyAmount+ " dollars remaining");
		
		System.out.println("How much Rice would you like to buy?");
		riceAmount = in.nextInt();
		if((moneyAmount - (riceAmount * 10)) < 0){
			System.out.println("This is invalid. please Try Again");
		}
		else{
			moneyAmount -= (riceAmount * 10);
		System.out.println("You have "+ moneyAmount+ " dollars remaining");
		}
		
		System.out.println("How much Water would you like to buy?");
		waterAmount = in.nextInt();
		if((moneyAmount - (waterAmount * 1)) < 0){
			System.out.println("This is invalid. please Try Again");
		}
		else{
		moneyAmount -= (waterAmount * 1);
		System.out.println("You have "+ moneyAmount+ " dollars remaining");
		}
		System.out.println("How much Hay would you like to buy?");
		hayAmount = in.nextInt();
		if((moneyAmount - (hayAmount * 15)) < 0){
			System.out.println("This is invalid. please Try Again");
		}
		else{
		moneyAmount -= hayAmount;
		moneyAmount -= (hayAmount * 5);
		System.out.println("You have "+ moneyAmount+ " dollars remaining");
		}
		totalFoodAmount = flourAmount + riceAmount;
		return moneyAmount;

	
		
	}
	
	
	

}