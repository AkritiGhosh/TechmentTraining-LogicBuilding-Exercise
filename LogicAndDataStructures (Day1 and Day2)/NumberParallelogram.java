/* 
for num=5
 1 2 3 4 5
    2 3 4 5 4
      3 4 5 4 3
        4 5 4 3 2
          5 4 3 2 1
*/
import java.util.Scanner;

public class NumberParallelogram{
	public static void main(String[] args) {
		
		int num, i, j, k, l;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		num = scanner.nextInt();
		
		for(i =0; i<num; i++){
			for(j = 0; j<=i; j++)
				System.out.print("  ");
			for(k = i+1; k<=num; k++ )
				System.out.print(k +" ");
			for(l = k-2; l>=num-i; l--)
				System.out.print(l +" ");
			System.out.println();
		}
	}
}