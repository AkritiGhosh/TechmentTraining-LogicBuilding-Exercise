/*
Exercise -9 ( First n terms in a series)
Write a program to generate the first n terms in the series ---1, 8, 27, 64, 125
*/
import java.util.Scanner;

public class CubeSeries{
	public static void main(String[] args) {
		
		int limit;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number:");
		limit = scanner.nextInt();

		System.out.print ("The series: ");
		for(int i = 1; i<=limit; i++)
			System.out.print((i*i*i) +"\t");

	}
}
