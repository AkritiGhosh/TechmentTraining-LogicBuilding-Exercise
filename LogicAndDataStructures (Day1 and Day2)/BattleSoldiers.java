import java.util.Scanner;

public class BattleSoldiers{
	public static void main(String[] args) {
		
		int firstSoldierNumber, lastSoldierNumber;
		Scanner scanner = new Scanner(System.in);
		System.out.print("The 1st soldier number:");
		firstSoldierNumber = scanner.nextInt();
		System.out.print("The 1st soldier number:");
		lastSoldierNumber =  scanner.nextInt();

		System.out.println("Soldiers come forward: - ");

		for (int i = firstSoldierNumber; i<=lastSoldierNumber ; i++)
			System.out.println(i);
	}
}