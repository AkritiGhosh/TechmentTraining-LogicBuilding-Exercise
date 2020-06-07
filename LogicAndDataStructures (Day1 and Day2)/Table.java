import java.util.Scanner;

public class Table{
	public static void main(String[] args) {
		
		int num, mul;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number:");
		num = scanner.nextInt();
		System.out.println("Table of " + num);


		for (int i = 1; i<=10; i++) {
			mul = num*i;
			System.out.println(num+ " * "+ i + " = "+ mul);
		}

	}
}