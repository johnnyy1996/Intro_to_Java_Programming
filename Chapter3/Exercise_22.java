/*

*/
import java.util.Scanner;

public class Exercise_22{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		boolean withinTheCircle = (Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5) <= 10);

System.out.println("Point (" + x + ", " + y +  ") is " + ((withinTheCircle) ? "in " : "not in ") + "the circle");
	}
}
