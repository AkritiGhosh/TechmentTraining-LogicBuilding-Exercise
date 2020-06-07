/*
Exercise -18 ( Arithmetic Exception)
Write a program that accepts 2 integers a and b as input and finds the quotient of a/b.
This program may generate an Arithmetic Exception. Use exception handling mechanisms to handle this exception. In the catch block, print the message as shown in the sample output.
Also illustrate the use of finally block. Print the message “Inside finally block”.
*/

import java.util.Scanner;

public class DivideZero{
	public static void main(String[] args) {
		
		int divident, divisor,quotient;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the divident :");
		divident = scanner.nextInt();
		System.out.println("Enter the divisor :");
		divisor = scanner.nextInt();

		try{
			quotient = divident/divisor;
			System.out.println("Answer:"+ quotient);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex +"\nCannot divide by zero");
		}
		finally{
			System.out.println("Inside finally block");
		}
	}
}

