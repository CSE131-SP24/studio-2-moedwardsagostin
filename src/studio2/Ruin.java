package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		//System.out.println("What is your starting amount? ");
		//int startAmount = in.nextInt();
		
		System.out.println("What are your chances of winning? ");
		double winChance = in.nextDouble();
		
		
		System.out.println("How much do you want to win? ");
		int winLimit = in.nextInt();
		int startAmount = 10;
		int balance = startAmount;
		String status;
		int lossCount = 0;
		int winCount = 0;
		int simNum = 0;
		int totalSimulations;
		
		while (balance > 0 && balance < winLimit);
		{
			
		
		
		if ((int)Math.random() > winChance)
		{
		
			balance--;
			lossCount++;
		}
		else (int()Math.random() < winChance);
		{
			balance++;
			winCount++;
		}
		}
		System.out.println("This is how many times you've lost: " + lossCount );
		System.out.println("This is how many times you've win: " + winCount );
	}
	


}
