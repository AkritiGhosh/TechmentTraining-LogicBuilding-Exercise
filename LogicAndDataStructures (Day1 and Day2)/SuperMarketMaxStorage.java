/*
Exercise -13 ( The Super Market-Stock Challenge)
Create an array and store the product quantities and find the maximum
value and print it
*/

import java.util.Scanner;

public class SuperMarketMaxStorage{
	public static void main(String[] args) {
		
		int numOfProducts, maxQuantity=0;

		Scanner scanner = new Scanner(System.in);
		System.out.print("How many products are there in the store: ");
		numOfProducts = scanner.nextInt();
		int product[] = new int[numOfProducts];

		for (int i =0; i<numOfProducts; i++) {
			System.out.println("Enter the quantity of product " + (i+1));
			product[i] = scanner.nextInt();
			if (product[i]>maxQuantity)
				maxQuantity=product[i];
		}

		System.out.println("You have max " +maxQuantity+ " products");
	}
}
