/*

*/

import java.util.Scanner;

public class Exercise_11{

	public static final double ONE_YEAR_IN_SECONDS = 60 * 60 * 24 * 365;
	public static final double BIRTHS_PER_YEAR = ONE_YEAR_IN_SECONDS / 7.0;
	public static final double DEATHS_PER_YEAR = ONE_YEAR_IN_SECONDS / 13.0;
	public static final double NEW_IMMIGRANTS_PER_YEAR = ONE_YEAR_IN_SECONDS / 45.0;


	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of years: ");
		int years = input.nextInt();

		double totalSeconds = ONE_YEAR_IN_SECONDS * years;

		double currentPopulation = 312_032_486;
		
		for(int i = 1; i <= 5; i++)
			currentPopulation += (BIRTHS_PER_YEAR) - (DEATHS_PER_YEAR) + (NEW_IMMIGRANTS_PER_YEAR);
		
		System.out.println("The population in " + years + " years is " + (int)currentPopulation);

	}
}
