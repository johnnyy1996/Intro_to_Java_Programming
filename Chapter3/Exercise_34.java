/*

*/
import java.util.Scanner;

public class Exercise_34{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three points for p0, p1, and p2,: ");
		double xP0 = input.nextDouble();
		double yP0 = input.nextDouble();
		double xP1 = input.nextDouble();
		double yP1 = input.nextDouble();
		double xP2 = input.nextDouble();
		double yP2 = input.nextDouble();

		double determinant = (xP1 - xP0) * (yP2 - yP0) - (xP2 - xP0) * (yP1 - yP0);

		if(determinant > 0)
			System.out.println("(" + xP2 + ", " + yP2 + ") is on the left side of the line from " + "(" + xP0 + ", " + yP0 + ") to (" + xP1 + ", " + xP1 + ")");
		else if(determinant == 0)
                        System.out.println("(" + xP2 + ", " + yP2 + ") is on the line from " + "(" + xP0 + ", " + yP0 + ") to (" + xP1     + ", " + xP1 + ")");
		else
			System.out.println("(" + xP2 + ", " + yP2 + ") is on the right side of the line from " + "(" + xP0 + ", " + yP0 + ") to (" + xP1 + ", " + xP1 + ")");
	}
}

