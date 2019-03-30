/*

*/
import java.util.Scanner;

public class Exercise_23{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		boolean withinTheRectangle = Math.pow(Math.pow(x, 2), 0.5) <= 10 / 2 || Math.pow(Math.pow(y, 2), 0.5) <= 5.0 / 2;

		System.out.println("Point (" + x + ", " + y + ") is " + ((withinTheRectangle) ? "in " : "not in ") + "the rectangle");
	}
}
