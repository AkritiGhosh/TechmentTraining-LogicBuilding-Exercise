import java.util.Scanner;

public class OutOfBoundIndex{
	public static void main(String[] args) {
		
		int size, itemIndex;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the array:");
		size = scanner.nextInt();
		int array[] = new int[size];

		System.out.print("Enter the values of the array:");
		for(int i=0; i<size; i++)
			array[i] = scanner.nextInt();
		
		System.out.print("Enter the item id:");
		itemIndex = scanner.nextInt();

		try{
			System.out.println("The no of item " +itemIndex+ " is " + array[itemIndex]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Can't display value, " + e);
		}

	}
}