/*
Exercise -5 ( My Birth Month )
Write a program to accept the month of birth as number and displays appropriate message to print the month name. Use Switch statement . If input is not a valid month number should show error message as Invalid Month
*/

import java.util.Scanner;

public class BirthMonth{
	public static void main(String[] args) {
		
		int monthInNumber;
		String monthName= " ";
		boolean errorValue = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your birth month:");
		monthInNumber = scanner.nextInt();
		switch(monthInNumber)
		{
			case 1: monthName = "January"; break;
			case 2: monthName = "February"; break;
			case 3: monthName = "March"; break;
			case 4: monthName = "April"; break;
			case 5: monthName = "May"; break;
			case 6: monthName = "June"; break;
			case 7: monthName = "July"; break;
			case 8: monthName = "August"; break;
			case 9: monthName = "September"; break;
			case 10: monthName = "October"; break;
			case 11: monthName = "November"; break;
			case 12: monthName = "December"; break;
			default:
				errorValue = true;
		}
		if (errorValue)
			System.out.println("Invalid Month");
		else
			System.out.println("Your birthday is in "+ monthName);


	}
}
