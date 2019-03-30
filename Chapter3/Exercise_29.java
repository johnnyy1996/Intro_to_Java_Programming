/*

*/

import java.util.Scanner;

public class Exercise_29{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
		double circle1XCoordinate = input.nextDouble();
		double circle1YCoordinate = input.nextDouble();
		double circle1Radius = input.nextDouble();
		
		System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
		double circle2XCoordinate = input.nextDouble();
		double circle2YCoordinate = input.nextDouble();
		double circle2Radius = input.nextDouble();

		if (Math.pow(Math.pow(circle2XCoordinate - circle1XCoordinate, 2) + Math.pow(circle2YCoordinate - circle1YCoordinate, 2), 0.5) 
			<= Math.abs(circle1Radius - circle2Radius))
			System.out.println("circle2 is inside circle1");
		else if (Math.pow(Math.pow(circle2XCoordinate - circle1XCoordinate, 2) + Math.pow(circle2YCoordinate - circle1YCoordinate, 2), 0.5)
					<= circle1Radius + circle2Radius)
			System.out.println("circle2 overlaps circle1");
		else
			System.out.println("circle2 does not overlap circle1");
	}
}
