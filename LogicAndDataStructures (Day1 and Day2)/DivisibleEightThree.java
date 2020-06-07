/*
Exercise -16 ( Divisible by 8 and 3)
Write a program to accept a number and display it itis divisible by both 8 and 3
*/

import java.util.Scanner;

public class DivisibleEightThree{
	public static void main(String[] args) {
		
		int num;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		num = scanner.nextInt();
		if(num%8 ==0 && num%3 == 0)
			System.out.println("Divisible");
		else
			System.out.println("Indivisible");
	}
}
