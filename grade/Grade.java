//AUTHOR  : Prajwal Y P
//DATE    : 29-09-2022
//PROGRAM : To calculate grade of a student along with his details in OOPs Paradigm
import java.util.Scanner;
public class Grade {
	public static void main(String args[])
	{
//		TAKE INPUT
		Scanner sc = new Scanner(System.in);
		String firstName 	= sc.next();
		String lastName 	= sc.next();
		String identity 	= sc.next();
		int totalSubjects	= sc.nextInt();
		int sum=0;
		String grade=null;
		
//			ADDING MARKS
		for(int i=0;i<totalSubjects;i++)
			sum += sc.nextInt();
		
//		CALCULATE GRADE
		sum = sum/totalSubjects;
		if(sum>=90)
			grade="OutStanding";
		else if(sum>=80)
			grade="Excellent";
		else if(sum>=70)
			grade="Awesome";
		else if(sum>=55)
			grade="Pass";
		else if(sum>=40)
			grade="DangerlyPass";
		else
			grade="TryAgain";
		
		System.out.println("Name\t: "+lastName+", "+firstName);
		System.out.println("ID\t: "+identity);
		System.out.println("Grade\t: "+grade);
		sc.close();
	}
}
