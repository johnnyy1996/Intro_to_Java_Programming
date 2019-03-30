/*

*/
import java.util.Scanner;

public class Exercise_19{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the lengths of the endges of a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();

		if(((side1 + side2 > side3) && (side1 + side3 > side2) && (side3 + side2 > side1))){
			double perimeter = side1 + side2 + side3;
			System.out.println("The triangle you entered has a perimeter of " + perimeter + ".");
		}
		else
			System.out.println("Invalid triangle");
	}
}
