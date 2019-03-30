/*

*/
import java.util.Scanner;

public class Exercise_05{
	public static String getDayName(int day){
		String today = "";

		switch(day){
			case 0:
				today = "Sunday";
				break;
			case 1:
				today =  "Monday";
				break;
			case 2:
				today = "Tuesday";
				break;
			case 3:
				today = "Wednesday";
				break;
			case 4:
				today = "Thursday";
				break;
			case 5:
				today = "Friday";
				break;
			case 6:
				today = "Saturday";
				break;
		}

		return today;
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter today's day: ");
		int day = input.nextInt();
		String dayName = getDayName(day);

		System.out.print("Enter the number of days elapsed since today: ");
		int numberOfDaysElapsed = input.nextInt();

		int futureDay = (day + numberOfDaysElapsed) % 7;
		String futureDayName = getDayName(futureDay);

		System.out.println("Today is " + dayName + " and the future day is " + futureDayName);
	}
}
