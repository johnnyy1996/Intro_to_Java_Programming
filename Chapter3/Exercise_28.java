/*

*/
import java.util.Scanner;

public class Exercise_28{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
		double r1XCoordinate = input.nextDouble();
		double r1YCoordinate = input.nextDouble();
		double r1Width = input.nextDouble();
		double r1Height = input.nextDouble();

		System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
		double r2XCoordinate = input.nextDouble();
		double r2YCoordinate = input.nextDouble();
		double r2Width = input.nextDouble();
		double r2Height = input.nextDouble();

		if((Math.pow(Math.pow(r2YCoordinate - r1YCoordinate, 2), .05) + r2Height / 2 <= r1Height / 2) && 
			(Math.pow(Math.pow(r2XCoordinate - r1XCoordinate, 2), .05) + r2Width / 2 <= r1Width / 2) &&
			(r1Height / 2 + r2Height / 2 <= r1Height) &&
			(r1Width / 2 + r2Width / 2 <= r1Width))
			System.out.println("r2 is inside r1");
		else if ((r1XCoordinate + r1Width / 2 > r2XCoordinate - r2Width) ||
					(r1YCoordinate + r1Height / 2 > r2YCoordinate - r2Height))
			System.out.println("r2 overlaps r1");
		else
			System.out.println("r2 does not overlap r1");
	}
}
