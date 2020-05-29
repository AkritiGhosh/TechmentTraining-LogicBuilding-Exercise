import java.util.Scanner;

public class BubbleSort{
	public static void main(String[] args) {
		
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		size = scanner.nextInt();
		
		int array[] = new int[size];
		System.out.print("Enter the values of the array:");
		for(int i=0; i<size; i++)
			array[i] = scanner.nextInt();

		for(int i=0; i<size; i++)
		{
			for (int j=0; j<size-i-1; j++) {
				if(array[j]>array[j+1]){
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		
		System.out.println("After sorting");			
		for(int i=0; i<size; i++)
			System.out.println(array[i]);
	}
}