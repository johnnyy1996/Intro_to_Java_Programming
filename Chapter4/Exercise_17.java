/*
(Days of a month)
Write a program that prompts the user to enter a year
and the first three letters of a month name
(with the first letter in uppercase)
and displays the number of days in the month.
*/

//import Scanner
import java.util.Scanner;

public class Exercise_17 {
	public static void main(String[] args) {
		//create new Scanner
		Scanner input = new Scanner(System.in);

		//prompt the user to enter a year and
		//the first three letter of a month
		//assign values to the int year and the string month
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		System.out.print("Enter a month: ");
		String month = input.next();

		//test for leap year
		boolean isLeapYear = 
			((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

		//display the number of day in the month
		System.out.print(month + " " + year + " has ");
		
		if (month.equals("Jan") || month.equals("Mar") || 
			  month.equals("May") || month.equals("Jul") ||
			  month.equals("Aug") || month.equals("Oct") ||
			  month.equals("Dec"))
			System.out.println(31 + " days");
		else if (month.equals("Apr") || month.equals("Jun") || 
			month.equals("Sep") || month.equals("Nov"))
			System.out.println(30 + " days");
		//display appropriate number of days if it is a leap year
		else
			System.out.println(((isLeapYear) ? 29 : 28) + " days");	
	}
}
