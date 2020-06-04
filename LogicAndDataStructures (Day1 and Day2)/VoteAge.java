import java.util.Scanner;

public class VoteAge{
	public static void main(String[] args) {
		
		int age;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the age :");
		age = scanner.nextInt();
		try{
			if (age >= 18) 
				System.out.println("Welcome to Vote");
			else
				throw new InvalidAgeException("Underage");
		}
		catch(InvalidAgeException ex)
		{
			System.out.println(ex);
		}
	}
}

class InvalidAgeException extends Exception{
	public InvalidAgeException(String errorMsg){
		super(errorMsg);
	}
}