/* 
Exercise -19 ( Reverse Pyramid)
for num=10
 
  1 2 3 4 5 6 7 8 9 10 9 8 7 6 5 4 3 2 1
    2 3 4 5 6 7 8 9 10 9 8 7 6 5 4 3 2
      3 4 5 6 7 8 9 10 9 8 7 6 5 4 3
        4 5 6 7 8 9 10 9 8 7 6 5 4
          5 6 7 8 9 10 9 8 7 6 5
            6 7 8 9 10 9 8 7 6
              7 8 9 10 9 8 7
                8 9 10 9 8
                  9 10 9
                    10
*/
import java.util.Scanner;

public class ReverseNumberPyramid{
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
			for(l = k-2; l>=i+1; l--)
				System.out.print(l +" ");
			System.out.println();
		}
	}
}
