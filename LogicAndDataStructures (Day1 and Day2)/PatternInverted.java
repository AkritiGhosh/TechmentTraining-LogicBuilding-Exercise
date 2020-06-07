/**

7654321
654321
54321
4321
321
21
1

*/

public class PatternInverted {
	public static void main(String[] args) {
		int noOfLines=7;


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