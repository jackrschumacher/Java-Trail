import java.util.*;

public class Journey{
	
	public static String Travel(String startChoice, int moneyAmount){
		Scanner in = new Scanner(System.in);
		System.out.println("You will now begin your journey from " + startChoice + " to Ventura, California");
		int distanceToTravel = (int)(Math.random()* 10000);
		int distanceRemaining = 0;
		int foodUsedPerDay = 0;
		int health = 100;
		
		System.out.println("You have " + distanceToTravel+ "miles to travel");
		System.out.println("You will travel a different distance each day. \nAlong your journey, you will encounter many obstacles to your journey, such as rivers, natural disasters, animals and more. \nAddionally, you will encounter situations that might improve your journey, such as towns or trading posts, or other travelers. \nGood Luck!");
		
		for(int distance = 0; distance <= distanceToTravel; distance = distance + (int)(Math.random()*10)){
			distanceRemaining = distanceToTravel - distance;
			
			System.out.println("You have "+ health + "remaining");
			System.out.println("You have traveled:"+ distance+ " So far");
			System.out.println("You have"+ distanceRemaining+ "miles left to travel");
			
			foodUsedPerDay = (int)(Math.random() * 3);
			int randomEvent = (int)(Math.random() * 10);
			

			System.out.println("You have eaten "+ foodUsedPerDay+ " pounds of food Today");

			
			if(randomEvent == 1){
				System.out.println("You have encountered a river. You must decide to try to cross the river in a raft or dirve across");
				System.out.println("Enter F for Ford and C for Cross");
				String cross = in.next();
				if(cross == "F"){
					System.out.println("You are able to ford the river with no issues");
				}
				else{
					int randomCross = (int)(Math.random() * 2);
					if(randomCross == 1){
						System.out.println("You were able to sucessfully cross the river");
					}
					else if(randomCross == 2){
						System.out.println("Unfortunatley, you were not able to cross the river sucessfully");
						System.out.println("Your food amount has decreased");
					}
					}
				}
			if(randomEvent == 2){
				System.out.println("You have encountered bandits");
				System.out.println("They steal some of your money");
				int randomMoney = (int)(Math.random() * 100);
				moneyAmount -= randomMoney;
				System.out.println("You lose $" + randomMoney);
				System.out.println("You have $"+ moneyAmount + "remaining");
			}
			if(randomEvent == 3){
				System.out.println("Unfortunatley, you lose one of you horses");
				System.out.println("You are able to find another horse from a passerby on the trail");
				int randomHorseMoney = (int)(Math.random() *100);
				moneyAmount -= randomHorseMoney;
				System.out.println("You have $" + moneyAmount + " remaining");
			}
			if(randomEvent == 4){
				System.out.println("While traveling the trail you encounter severley cold weather");
				System.out.println("Since you are not equiped to handle cold weather, you lose some health");
				int healthLost = (int)(Math.random() * 5);
				System.out.println("You Lose "+ healthLost + "health");
			}
			if(randomEvent == 5){
				System.out.println("You have the opprotunity to hunt and gain some food");
			}

			
			}
			
			
			
			
		
		return "";
	}
	
	
}