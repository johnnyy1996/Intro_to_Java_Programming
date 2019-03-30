/*
The U.S. Census Bureau projects population based on the following assumptions:
	- One birth every 7 seconds
	- One death every 13 seconds
	- One new immigrant every 45 seconds
Write a program to display the population for each of the next five years.
Assume the current population is 312,032,486 and one year has 365 days.
*/

public class Exercise_11{
    
        public static final double YEARS_TO_SECONDS = 60 * 60 * 24 * 365;
		public static final double BIRTHS_PER_YEAR = YEARS_TO_SECONDS / 7.0;
		public static final double DEATHS_PER_YEAR = YEARS_TO_SECONDS / 13.0;
		public static final double NEW_IMMIGRANTS_PER_YEAR = YEARS_TO_SECONDS / 45.0;
    
	public static void main(String[] args){
		double currentPopulation = 312_032_486;
		
		for(int i = 1; i <= 5; i++){
			currentPopulation += (BIRTHS_PER_YEAR) - (DEATHS_PER_YEAR) + (NEW_IMMIGRANTS_PER_YEAR);
			System.out.println("Year " + i + " population: " + (int)currentPopulation);
		}
	}
}
