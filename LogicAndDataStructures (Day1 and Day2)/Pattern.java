public class Pattern{
	public static void main(String[] args) {
		int noOfLines=3;

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