import java.util.*;

public class GradeCalculate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("WELCOME TO STUDENT GRADE CALCULATOR");

		System.out.println("Enter the Number of Subjects: ");
		int sub=sc.nextInt();
		int tm=0;

		for(int i=0;i<sub;i++){
			System.out.println("Enter marks for subject" + (i+1) + ":");
			tm+=sc.nextInt();
		}
		float avgper= (float) tm/sub;

		char gd;
		if(avgper >= 90){
			gd='A';
		}
		else if(avgper >=80){
			gd='B';
		}
		else if(avgper >=70){
			gd='C';
		}
		else if(avgper >=60){
			gd='D';
		}
		else{
			gd='F';
		}
		
		System.out.println();
		System.out.println("Total Marks: "+tm);
		System.out.println("Average Percentage: "+avgper);
		System.out.println("Grade: "+gd);

	}
}
