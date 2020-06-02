import java.util.Scanner;

public class AssessmentFourSecond{

	public static void main(String[] args) {
		
		int size, sum;
		
		System.out.print("Enter size of array:");
		Scanner scanner = new Scanner(System.in);
		size = scanner.nextInt();
		int array[]= new int[size];

		for(int j=0; j<size; j++)
			array[j] = scanner.nextInt();

		System.out.println("Enter the sum :");
		sum = scanner.nextInt();

		System.out.println("Pair :");

		for (int i = 0; i<size ;i++ ) {
			for (int j = i; j<size ; j++ ) {
				if(array[i]+array[j] == sum)
				{
					System.out.println("("+array[i]+", "+array[j]+")");
					break;
				}
			}
		}

	}
}