/*

*/
import java.util.Scanner;

public class Exercise_32{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter three points for p0, p1, and p2: ");
		double xP0 = input.nextDouble();
		double yP0 = input.nextDouble();
		double xP1 = input.nextDouble();
		double yP1 = input.nextDouble();
		double xP2 = input.nextDouble();
		double yP2 = input.nextDouble();

		boolean pointIsOnTheLine =  
			!(((xP1 - xP0) * (yP2 - yP0) - (xP2 - xP0) * (yP1 - yP0)) > 0 ||
			((xP1 - xP0) * (yP2 - yP0) - (xP2 - xP0) * (yP1 - yP0)) < 0 ||
			(xP2 < xP0) || (yP2 < yP0) || (xP2 > xP1) || (yP2 > yP1));

		System.out.print("(" + xP2 + ", " + yP2 + ") is ");
		if (!pointIsOnTheLine)
			System.out.print("not ");
		System.out.println("on the line segment from (" + xP0 + ", " + yP0 + ") to (" + xP1 + ", " + yP1 + ")");
	}
}
