// Ex 3 - Best Horse for King

import java.lang.*;
import java.util.Scanner;

public class BestHorse
{
	public static void main(String[] args) {

		int noOfHorses, maxWeight = 0, horseNumber=0;
		boolean isDistinct=true;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number of horses:");
		noOfHorses = scanner.nextInt();
		int horse[] = new int[noOfHorses];

		System.out.println("Enter weights of three horses:");

		for(int i = 0; i< noOfHorses; i++)
		{
			horse[i] = scanner.nextInt();
			if(maxWeight<horse[i])
			{
				maxWeight=horse[i];
				horseNumber= i;
			}
		}

		for(int i = 0; i<noOfHorses; i++)
		{
			if(horse[i]==maxWeight && horseNumber!= i)
				isDistinct = false;
		}

		if(isDistinct)
	        System.out.println("The " +horseNumber+ " horse is the best : " + maxWeight);
		else
			System.out.println("Entered weights are not destinct values");
		
	}
}