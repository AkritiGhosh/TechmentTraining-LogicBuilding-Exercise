import java.util.Scanner;

public class LeapYear{
	public static void main(String[] args) {
		
		int year;
		boolean isLeapYear = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the year:");
		year = scanner.nextInt();
		if (year%4 == 0)
			System.out.println("It is a leap year");
		else
			System.out.println("Not a leap year");


	}
}