import java.util.Scanner;
import java.util.Random;

public class EqualRandom{
	public static void main(String[] args) {
		
		int num1, num2;

		Random random = new Random();
		num1 = random.nextInt(10);
		num2 = random.nextInt(10);

		System.out.println("The 1st random numbers is " + num1);
		System.out.println("The 2nd random numbers is " + num2);

		if (num2==num1) 
			System.out.println("The random numbers were the same");
		else
			System.out.println("The random numbers were different");
		
		
	}
}