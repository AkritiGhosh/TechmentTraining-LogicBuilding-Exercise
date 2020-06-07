import java.util.Scanner;

public class ArgumentSort{
	public static void main(String[] args) {
		
		
		int size = args.length;
		int array[] = new int[size];
		for(int i=0; i<size; i++)
			array[i] = Integer.valueOf(args[i]);

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