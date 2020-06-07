import java.util.Scanner;
import java.lang.Math.*;

public class RightTriangle{
	public static void main(String[] args) {
		
		double side[] = new double[3];
		double sqSides =0;
		int hypo = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 3 sides of a triangle");
		for (int i = 0; i<3 ; i++ ) {
			side[i] = scanner.nextDouble();
			if(side[i]>hypo)
				hypo = i;
		}
		switch(hypo){
			case 0: {
				// sqHypo = Math.pow(side[0],2);
				sqSides = Math.hypot(side[1], side[2]);
			}
			case 1: {
				// sqHypo = Math.pow(side[1],2);
				sqSides = Math.hypot(side[0], side[2]);
			}
			case 2: {
				// sqHypo = Math.pow(side[2],2);
				sqSides = Math.hypot(side[1], side[0]);
			}
		}

		if(sqSides==side[hypo])
			System.out.println("It's a right angled triangle");
		else
			System.out.println("Not a right triangle");
	}
}