/*

*/

//import Scanner
import java.util.Scanner;

public class Exercise_05 {
	public static void main(String[] args) {
		//create Scanner
		Scanner input = new Scanner(System.in);

		// prompt the user to enter the number of sides and their length
		System.out.print("Enter the number of sides: ");
		int numberOfSides = input.nextInt();
		System.out.print("Enter the side: ");
		double side = input.nextDouble();

		// compute the area
		double area = (numberOfSides * Math.pow(side, 2) / 
			(4 * Math.tan(Math.PI / numberOfSides)));

		// Display result
		System.out.println("The area of the polygon is " + area);
	}
}
