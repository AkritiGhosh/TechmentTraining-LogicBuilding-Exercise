/**
1
12
123
1234
12345
54321
4321
321
21
1

*/

public class PatternMix{
	public static void main(String[] args) {
		int noOfLines=5;

		// upward triangle
		for(int i =1; i <=noOfLines; i++)
		{
			for(int j= 1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

		//downward triangle
		for(int i =noOfLines; i >=1; i--)
		{
			for(int j= i; j>=1; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}