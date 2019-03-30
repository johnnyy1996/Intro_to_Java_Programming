/*
(Check SSN)
Write a program that prompts the user to enter a 
Social Security number in the format DDD-DD-DDDD, where D is a digit.
Your program should check whether the input is valid.
*/

//import Scanner
import java.util.Scanner;

public class Exercise_21 {
	public static void main(String[] args) {
		//create new Scanner
		Scanner input = new Scanner(System.in);

		//prompt the user to enter a Social Security number
		System.out.print("Enter a SSN: ");
		//assign the the str ssn
		String ssn = input.nextLine();

		//check whether the input is valid
		boolean isValid = 
			(ssn.length() == 11) && 
			(Character.isDigit(ssn.charAt(0))) &&
			(Character.isDigit(ssn.charAt(1))) &&
			(Character.isDigit(ssn.charAt(2))) &&
			(ssn.charAt(3) == '-') &&
			(Character.isDigit(ssn.charAt(4))) &&
			(Character.isDigit(ssn.charAt(5))) &&
			(Character.isDigit(ssn.charAt(7))) &&
			(ssn.charAt(6) == '-') &&
			(Character.isDigit(ssn.charAt(8))) &&
			(Character.isDigit(ssn.charAt(9))) &&
			(Character.isDigit(ssn.charAt(10)));

		//display appropriate message
		System.out.println(ssn + " is " + ((isValid) ? "a valid " : "an invalid ")
			+ "social security number");
	}
}
