/**
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910

*/

public class Pattern{
	public static void main(String[] args) {
		int noOfLines=10;

		// upward triangle
		for(int i =1; i <=noOfLines; i++)
		{
			for(int j= 1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}
}