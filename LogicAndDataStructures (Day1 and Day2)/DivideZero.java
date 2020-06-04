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

