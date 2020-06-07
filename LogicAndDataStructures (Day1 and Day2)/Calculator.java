/*
Exercise -6 ( Simple Calculator )
Write a program to accept two numbers and an operator to perform mathematical operation on the operands and display the result as output.
*/

import java.util.Scanner;

public class Calculator{
	public static void main(String[] args) {
		
		int num1, num2, result;
		char operator;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter values in the following sequence: - \n1st number :");
		num1 = scanner.nextInt();
		System.out.println("The operator:");
		operator = scanner.next().charAt(0);
		System.out.println("2nd number :");
		num2 = scanner.nextInt();

		switch(operator){
			case '+': result = num1+num2; break;
			case '-': result = num1-num2; break;
			case '*': result = num1*num2; break;
			case '/': result = num1/num2; break;
			case '%': result = num1%num2; break;
			default : result = 0; break;
		}

		System.out.println("Answer:\n"+num1+" "+operator+" "+num2+" = "+ result);

	}
}
