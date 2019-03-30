/*

*/

import java.util.Scanner;

public class Exercise_19{

	public static double distance(double x1, double y1, double x2, double y2){

		return Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2) , 0.5);
	}

	public static void main(String [] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter three points for a triangle: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();

		double side1 = distance(x1, y1, x2, x2);
		double side2 = distance(x2, y2, x3, y3);
		double side3 = distance(x3, y3, x1, y1);
		double s = (side1 + side2 + side3) / 2;
		double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)) , 0.5);

		System.out.println("The area of the triangle is " + area);
	}
}
