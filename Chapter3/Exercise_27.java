/*

*/
import java.util.Scanner;

public class Exercise_27{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter a point's x- and y-coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		double xIntersection = (-x * (200 * 100)) / (-y * 200 - x * 100);
		double yIntersection = (-y * (200 * 100)) / (-y * 200 - x * 100);

		System.out.println("The point " + ((x > xIntersection || y > yIntersection) ? "is not " : "is " ) + "in the triangle");
	}
}
