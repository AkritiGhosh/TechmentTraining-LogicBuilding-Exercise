import java.util.Scanner;

public class CorrectPIN{
	public static void main(String[] args) {
		
		int pin;
		Scanner scanner = new Scanner(System.in);

		do{
			System.out.println("Enter the pin:");
			pin = scanner.nextInt();
			if(pin != 12345)
				System.out.println("Wrong Pin");
		}
		while( pin != 12345);

		System.out.println("Correct PIN : " + pin);

	}
}