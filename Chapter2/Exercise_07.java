/*
Write a program that prompts the user to enter the minutes
(e.g., 1 billion), and displays the number of years and days
for the minutes. For simplicity, assume a year has 365 days.
*/

import java.util.Scanner;

public class Exercise_07{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of minutes: ");

		int minutes = input.nextInt();

		int years = minutes / (60 * 24 * 365);
		int daysLeft = (minutes / (60 * 24)) % 365;

		System.out.println(minutes + " minutes is approximately " + years + " years and " + daysLeft + " days");
	}
}
