Ex 8 : Write a program to find whether a given number is an Armstrong number or not.

import java.util.Scanner;

public class ArmstrongNumber{
	public static void main(String[] args) {
		
		int num, numCheck, sum =0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = scanner.nextInt();
		numCheck = num;

		//Using while loop
		// while (num>0)
		// {
		// 	int rem = num%10;
		// 	sum += rem*rem*rem;
		// 	num/=10;	
		// }

		//Using for loop

		for (int i = num; i>0; i/=10)
		{
			int rem = i%10;
			sum += rem*rem*rem;
		}
		
		if (sum == numCheck)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");


	}
}
