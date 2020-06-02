import java.util.Scanner;

public class AssessmentFourFirst{

	public static void main(String[] args) {
		
		int size, evenSum=0, oddSum=0;
		
		System.out.print("Enter size of array:");
		Scanner scanner = new Scanner(System.in);
		size = scanner.nextInt();
		int array[]= new int[size];

		for(int j=0; j<size; j++){
			array[j] = scanner.nextInt();
			if(array[j]%2 == 0)
				evenSum += array[j];
			else
				oddSum += array[j];
		}

		System.out.println("even = " + evenSum);
		System.out.println("odd = " + oddSum);
	}
}