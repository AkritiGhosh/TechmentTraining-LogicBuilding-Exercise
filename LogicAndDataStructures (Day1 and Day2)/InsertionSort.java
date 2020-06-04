import java.util.Scanner;

public class InsertionSort{
	public static void main(String[] args) {
		
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		size = scanner.nextInt();
		
		int array[] = new int[size];
		System.out.print("Enter the values of the array:");
		for(int i=0; i<size; i++)
			array[i] = scanner.nextInt();

		for (int i = 1; i < n; ++i) { 
            int key = array[i]; 
            int j = i - 1; 

            while (j >= 0 && array[j] > key) { 
                array[j + 1] = array[j]; 
                j = j - 1; 
            } 
            array[j + 1] = key; 
        } 

		System.out.println("After sorting");			
		for(int i=0; i<size; i++)
			System.out.println(array[i]);
	}
}