import java.util.*;
public class Journey{
	Scanner in = new Scanner(System.in);
	public static String Travel(String startChoice, int moneyAmount){
		System.out.println("You will now begin your journey from " + startChoice + " to Ventura, California");
		int distanceToTravel = (int)(Math.random()* 10000);
		System.out.println("You have " + distanceToTravel+ "miles to travel");
		System.out.println("You will travel a different distance each day. \nAlong your journey, you will encounter many obstacles to your journey, such as rivers, natural disasters, animals and more. \nAddionally, you will encounter situations that might improve your journey, such as towns or trading posts, or other travelers. \nGood Luck!");
		return "";
	}
}