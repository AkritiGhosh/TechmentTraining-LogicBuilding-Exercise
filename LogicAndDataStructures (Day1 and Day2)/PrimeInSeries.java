import java.util.Scanner;

public class PrimeInSeries{

	public static boolean isPrime(int n){
		if(n==1)
			return false;
		if(n==2)
			return true;
		for (int i = 2; i<n ;i++ ) {
			if (n%i==0) 
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
		int numLimit;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number:");
		numLimit = scanner.nextInt();
		for (int i =2; i <=numLimit ;i++ ) {
			if(isPrime(i))
				System.out.print(i + "\t ");
		}
	}
}