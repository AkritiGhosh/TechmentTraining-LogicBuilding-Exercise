/* 
Enter the number: 5
1 2 3 4 5 5 4 3 2 1
1 2 3 4 4 3 2 1
1 2 3 3 2 1
1 2 2 1
1 1

*/
import java.util.Scanner;

public class Pattern2{
	public static void main(String[] args) {
		
		int num, i, j, k, l;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		num = scanner.nextInt();
		
		for(i =0; i<num; i++){
			for(k = 1; k<=num-i; k++ )
				System.out.print(k +" ");
			for(l = k-1; l>=1; l--)
				System.out.print(l +" ");
			System.out.println();
		}
	}
}