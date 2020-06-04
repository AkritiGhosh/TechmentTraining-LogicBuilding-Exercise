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