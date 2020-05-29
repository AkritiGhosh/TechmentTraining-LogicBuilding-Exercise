import java.util.Scanner;

public class LinearSearch{
	public static void main(String[] args) {
		
		int size, key;
		boolean numberPresent=false;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		size = scanner.nextInt();
		int array[] = new int[size];

		System.out.print("Enter the values of the array:");
		for(int i=0; i<size; i++)
			array[i] = scanner.nextInt();

		System.out.print("Enter the key to find in the array:");
		key = scanner.nextInt();

		 for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                numberPresent = true;
                break;    
            }    
        }    

        if(numberPresent)
        	System.out.print("Number found");
        else
    		System.out.print("Not found");



	}
}