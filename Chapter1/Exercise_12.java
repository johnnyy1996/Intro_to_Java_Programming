/*
Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds.
Write a program that displays the average speed in kilometers per hour.
		(Note that 1 mile is 1.6 kilometers)
*/

public class Exercise_12{
	public static void main(String[] args){
		double milesInKilometers = 24.0 * 1.6;
		double secInHours = 35.0 / (60.0 * 60.0);
		double totalMinutesInHours = (40.0 / 60.0) + secInHours;
		double totalHours = 1.0 + totalMinutesInHours;

		System.out.println((milesInKilometers / totalHours) + " Miles / Hour");
	}
}
