import java.util.*;
public class Journey{
	Scanner in = new Scanner(System.in);
	public static String Travel(String startChoice, int moneyAmount){
		System.out.println("You will now begin your journey from " + startChoice + " to Ventura, California");
		int distanceToTravel = (int)(Math.random()* 10000);
		int distanceRemaining = 0;
		
		System.out.println("You have " + distanceToTravel+ "miles to travel");
		System.out.println("You will travel a different distance each day. \nAlong your journey, you will encounter many obstacles to your journey, such as rivers, natural disasters, animals and more. \nAddionally, you will encounter situations that might improve your journey, such as towns or trading posts, or other travelers. \nGood Luck!");
		
		for(int distance = 0; distance <= distanceToTravel; distance = distance + (int)(Math.random()*100)){
			distanceRemaining = distanceToTravel - distance;
			System.out.println("You have traveled:"+ distance+ "So far");
			System.out.println("You have"+ distanceRemaining+ "miles left to travel");
			int randomEvent = (int)(Math.random() * 10);
			if(randomEvent == 1){
				
				System.out.println("Testing");
			}
			
			
			
			
		}
		return "";
	}
	
	
}