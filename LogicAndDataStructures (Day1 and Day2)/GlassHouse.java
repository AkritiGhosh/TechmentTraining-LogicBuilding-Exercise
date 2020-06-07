// Ex 1 - The Glass House
//Write a generic program which accepts a two digit number and find the exit door number of the glasshouse.

import java.lang.*;
import java.util.Scanner;
System.out.println();
public class GlassHouse
{
	public static void main(String[] args) {

		int escape_num, units, tens;
		System.out.println("Enter a two digit number to escape:");

		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		if(num<10 || num>99)
			System.out.println("Error: Number Invalid");

		else
		{
			units = num%10;
			tens = num/10;
			escape_num = units + tens;

			System.out.println("The door to escape is ", escape_num);

		}



		
	}
}
