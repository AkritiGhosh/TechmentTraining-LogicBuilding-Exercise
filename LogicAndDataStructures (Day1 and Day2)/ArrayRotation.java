import java.util.Scanner;

public class ArrayRotation{
	public static void main(String[] args) {
		
		int size, rotationSize, rotation;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of array:");
		size = scanner.nextInt();

		System.out.println("Enter the values for the array:");
		int array[] = new int[size];
		for(int i=0; i<size; i++)
			array[i] = scanner.nextInt();

		System.out.println("Enter the rotation key:");
		rotationSize = scanner.nextInt();
		
		// size = 5;
		// int array[] = {1,2,3,4,5};
		// rotationSize = 2;

		rotation = rotationSize;
		int tempArray[] = new int[rotationSize];

		for(int i=0; i<rotationSize; i++)
			tempArray[i] = array[i];
		for(int i=0; i<(size-rotationSize); i++ )
			array[i] = array[rotation++];
		int j = 0;
		for(int i=rotationSize+1; i<size; i++)
		{
			array[i] = tempArray[j];
			j++;
		}
		for(int i=0; i<size; i++)
			System.out.print(array[i] +"  ");		

	}
}