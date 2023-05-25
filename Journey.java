import java.util.*;

public class Journey{
	
	public static String Travel(String startChoice, int moneyAmount){
		Scanner in = new Scanner(System.in);
		System.out.println("You will now begin your journey from " + startChoice + " to Ventura, California");
		int distanceToTravel = (int)(Math.random()* 10000);
		int distanceRemaining = 0;
		
		System.out.println("You have " + distanceToTravel+ "miles to travel");
		System.out.println("You will travel a different distance each day. \nAlong your journey, you will encounter many obstacles to your journey, such as rivers, natural disasters, animals and more. \nAddionally, you will encounter situations that might improve your journey, such as towns or trading posts, or other travelers. \nGood Luck!");
		
		for(int distance = 0; distance <= distanceToTravel; distance = distance + (int)(Math.random()*10)){
			distanceRemaining = distanceToTravel - distance;
			System.out.println("You have traveled:"+ distance+ " So far");
			System.out.println("You have"+ distanceRemaining+ "miles left to travel");
			int randomEvent = (int)(Math.random() * 10);
			if(randomEvent == 1){
				System.out.println("You have encountered a river. You must decide to try to cross the river in a raft or dirve across");
				System.out.println("Enter F for Ford and C for Cross");
				String cross = in.next();
				if(cross == "F"){
					
				}
			
			}
			
			
			
			
		}
		return "";
	}
	
	
}