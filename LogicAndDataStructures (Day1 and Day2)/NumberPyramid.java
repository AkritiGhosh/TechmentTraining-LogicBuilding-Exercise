/*
for num = 10
                    10
                  9 10 9
                8 9 10 9 8
              7 8 9 10 9 8 7
            6 7 8 9 10 9 8 7 6
          5 6 7 8 9 10 9 8 7 6 5
        4 5 6 7 8 9 10 9 8 7 6 5 4
      3 4 5 6 7 8 9 10 9 8 7 6 5 4 3
    2 3 4 5 6 7 8 9 10 9 8 7 6 5 4 3 2
  1 2 3 4 5 6 7 8 9 10 9 8 7 6 5 4 3 2 1

*/

import java.util.Scanner;

public class NumberPyramid{
	public static void main(String[] args) {
		
		int num, i, j, k, l;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		num = scanner.nextInt();
		
		for(i =0; i<num; i++){
			for(j = num-i-1; j>=0; j--)
				System.out.print("  ");
			for(k = num-i; k<=num; k++ )
				System.out.print(k +" ");
			for(l = k-2; l>=num-i; l--)
				System.out.print(l +" ");
			System.out.println();
		}
	}
}