import java.util.Scanner; 

public class Marks{ 
	public static void main(String[] args) { 

		int noOfSubjects, totalMarks=0, minMarks=100,
maxMarks=0, passingMarks = 50, indexPassArray = 0,indexFailArray = 0, countPass = 0, countFail=0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no of subjects");
		noOfSubjects = scanner.nextInt();
		int marks[] = new int[noOfSubjects];
		int passed[] = new int[noOfSubjects];
		int failed[] = new int[noOfSubjects];

		for(int i=0; i<noOfSubjects; i++)
		{
			System.out.println("Enter the marks of subject " + i);

			marks[i]= scanner.nextInt();
			
			if(marks[i]>maxMarks)
				maxMarks=marks[i];
			if(marks[i]<minMarks)
				minMarks=marks[i];

			totalMarks += marks[i];

			if(marks[i]>=passingMarks)
				passed[indexPassArray++] = marks[i];
			else
				failed[indexFailArray++] = marks[i];
		}

		System.out.println("The total marks : " + totalMarks);
		System.out.println("The minimum marks : " + minMarks);
		System.out.println("The maximum marks : " + maxMarks);

		System.out.println("The marks of passed subjects :");
		for(int i =0; i<noOfSubjects; i++)
		{
			if(passed[i]==0)
				break;
			System.out.println(passed[i]);
			countPass++;
		}
		System.out.println("The no of passed subjects :" + countPass);

			
		System.out.println("The marks of failed subjects :");
		for(int i =0; i<noOfSubjects; i++)
		{
			if(failed[i]==0)
				break;
			System.out.println(failed[i]);
			countFail++;
		}
		System.out.println("The no of failed subjects :" + countFail);

			




	}
	
}