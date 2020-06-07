import java.util.*;

public class DiceRandom{
	public static void main(String[] args) {
		
		int num1, num2;

		Random random = new Random();
		num1 = random.nextInt(6) +1;
		num2 = random.nextInt(6) +1;

		System.out.println("The 1st random numbers is " + num1);
		System.out.println("The 2nd random numbers is " + num2);

		if ((num2 % 2)==0 && (num1%2)==0) {
			num1 +=num2;
			System.out.println("Points = " + num1);
		}
		else{
			int sub = Math.abs(num1 - num2);
			System.out.println("Points =" + sub );
		}
		
		
	}
}