import java.util.Scanner;

public class BMICalc{
	public static void main(String[] args) {
		
		double bmi, weight, height;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the height in meters:");
		height = scanner.nextDouble();
		System.out.print("Enter the weight in kg:");
		weight = scanner.nextDouble();

		bmi = weight/(height*height);

		System.out.println("Your BMI is "+bmi+ " kg/m2");

		if(bmi<18)
			System.out.println("You're underweight");
		else if (bmi <25)
			System.out.println("You're normal");
		else if (bmi <30)
			System.out.println("You're overweight");
		else 
			System.out.println("You're obese");
		

	}
}