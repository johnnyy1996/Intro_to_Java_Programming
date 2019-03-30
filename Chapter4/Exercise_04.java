/*
(Geometry: area of a hexagon) 
Write a program that prompts the user to enter
the side of a hexagon and displays its area. 
*/

//import scanner
import java.util.Scanner;

public class Exercise_04{
	public static void main(String[] args){
		//create scanner
		Scanner input = new Scanner(System.in);

		//prompt user for the length of the side
		System.out.print("Enter the side: ");
		double side = input.nextDouble();

		//compute area
		double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));

		//print formatted results
		System.out.printf("The area of the hexagon is %.2f", area);
	}
}
