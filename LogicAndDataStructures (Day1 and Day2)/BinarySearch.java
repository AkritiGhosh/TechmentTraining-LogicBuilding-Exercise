import java.util.Scanner;

public class BinarySearch{
	public static void main(String[] args) {
		
		int size, key, first, last, mid;
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

		//Sorting
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

		first = 0;
		last = array.length-1;  
		mid = (first + last)/2;  

   		while( first <= last ){  
      		if ( array[mid] < key ){  
        		first = mid + 1;     
      		}
      		else if ( array[mid] == key ){  
        		System.out.println("Element is found at index: " + mid);  
        		break;  
      		}
      		else{  
         		last = mid - 1;  
      		}  
      		mid = (first + last)/2;  
   		}  
   		
   		if ( first > last ){  
      		System.out.println("Element is not found!");  
   		}  
	}
}