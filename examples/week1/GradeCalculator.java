/*

	A program that calculates a final letter grade based on 
	scores for exams, homework, and projects.

	Exams are worth 100 points and 30% of the final grade.
	Homework is worth 100 points and is 10% of the final grade.
	Projects are worth 200 points and are 60% of the final grade.

	Final scores > 90% earn an A.
	Final scores > 80% earn an B.
	Final scores > 70% earn an C.
	Final scores <= 70% earn an F.


*/
import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {

		//declare constants to hold distribution
		final double EXAM_PERCENT = .3;
		final double HW_PERCENT = .1;
		final double PROJ_PERCENT = .6;

		//declare constants to hold max points
		final int MAX_EXAM = 100;
		final int MAX_HW = 100;
		final int MAX_PROJECT = 200;

		//declare constants to hold min values for letters
		final int MIN_A = 90;
		final int MIN_B = 80;
		final int MIN_C = 70;

		//set earned points - command line input
		Scanner input = new Scanner(System.in);

		int earnedExam;
		System.out.println("Enter the exam points: ");
		earnedExam = input.nextInt(); //use the cmd input

		int earnedHomework;
		System.out.println("Enter the homework points: ");
		earnedHomework = input.nextInt();

		int earnedProject;
		System.out.println("Enter the project points: ");
		earnedProject = input.nextInt();

		//int earnedExam = 90;
		//int earnedHomework = 90;
		//int earnedProject = 180;


		//calculate grade
		double exam = ((double)earnedExam)/MAX_EXAM; //cast - put new type in ()
		double homework = ((double)earnedHomework)/MAX_HW;
		double project = ((double)earnedProject)/MAX_PROJECT;

		double finalGrade = (exam * EXAM_PERCENT) + (homework * HW_PERCENT) + (project * PROJ_PERCENT);
		finalGrade = finalGrade * 100;

		//print result
		if(finalGrade > MIN_A) {
			System.out.printf("With a final grade of %3.2f you earn a grade of %s. \n", finalGrade, "A");
		} 
		else if(finalGrade > MIN_B) {
			System.out.printf("With a final grade of %3.2f you earn a grade of %s. \n", finalGrade, "B");
		} 
		else if(finalGrade > MIN_C) {
			System.out.printf("With a final grade of %3.2f you earn a grade of %s. \n", finalGrade, "C");
		} 
		else {
			System.out.printf("With a final grade of %3.2f you earn a grade of %s. \n", finalGrade, "F");
		}


		/* other way to print results:

		String letter = null;
		if(finalGrade > MIN_A) {
			letter = "A";
		} 
		else if(finalGrade > MIN_B) {
			letter = "B";
		} 
		else if(finalGrade > MIN_C) {
			letter = "C";
		} 
		else {
			letter = "F";
		}
		System.out.printf("With a final grade of %3.2f you earn a grade of %s \s" + finalGrade);

		*/ 

	}



}
