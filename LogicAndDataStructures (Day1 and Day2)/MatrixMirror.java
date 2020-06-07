import java.util.Scanner;

public class MatrixMirror{
	public static void main(String[] args) {
		
		int rowsDim, colsDim;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the dimensions of the matrices: - ");
		System.out.print("Rows:");
		rowsDim = scanner.nextInt();
		System.out.print("Columns:");
		colsDim = scanner.nextInt();

		int mat1[][]= new int[rowsDim][colsDim];
		int mirror[][]= new int[rowsDim][colsDim];

		System.out.println("Enter the values of the matrix1: - ");

		for(int i= 0; i<rowsDim; i++)
		{
			for(int j=0; j<colsDim; j++)
				mat1[i][j] = scanner.nextInt();

		}

		System.out.println("The actual image: - ");

		for(int i= 0; i<rowsDim; i++)
		{
			for(int j=0; j<colsDim; j++)
				System.out.print(mat1[i][j] + "\t");
			System.out.println();
		}

		System.out.println("The mirror image: - ");

		for(int i= 0; i<rowsDim; i++)
		{
			for(int j=colsDim-1; j>=0; j--)
				System.out.print(mat1[i][j] + "\t");
			System.out.println();
		}
	}
}