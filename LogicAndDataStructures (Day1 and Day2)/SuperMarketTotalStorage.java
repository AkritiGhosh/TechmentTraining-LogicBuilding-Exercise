import java.util.Scanner;

public class SuperMarketTotalStorage{
	public static void main(String[] args) {
		
		int numOfProducts, sumQuantity=0;

		Scanner scanner = new Scanner(System.in);
		System.out.print("How many products are there in the store: ");
		numOfProducts = scanner.nextInt();
		int product[] = new int[numOfProducts];

		for (int i =0; i<numOfProducts; i++) {
			System.out.println("Enter the quantity of product " + (i+1));
			product[i] = scanner.nextInt();
			sumQuantity += product[i];
		}

		System.out.println("You have total " +sumQuantity+ " products");
	}
}