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