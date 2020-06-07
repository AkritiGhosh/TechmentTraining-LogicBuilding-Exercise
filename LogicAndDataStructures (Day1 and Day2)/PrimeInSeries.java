/*
Exercise -10 ( First n prime numbers in a series)
Write a program to generate the first n prime numbers in the series ---2,3,5,7,9,11,..., 17
*/

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
		
		int numLimit, i = 2;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number:");
		numLimit = scanner.nextInt();
		while(numLimit>0) {
			if(isPrime(i))
			{
				numLimit--;
				System.out.print(i + "\t ");
				i++;
			}
		}
	}
}
