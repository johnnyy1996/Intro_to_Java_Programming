/*

*/
//import Scanner;
import java.util.Scanner;

public class Exercise_01{
	public static void main(String[] args){
		//create scanner
		Scanner input = new Scanner(System.in);

		//get length from the center
		System.out.print("Enter the length from the center to a vertex: ");
		double length = input.nextDouble();

		//compute length of side and area
		double side = 2 * length * Math.sin(Math.PI / 5);
		double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
		System.out.println("The area of the pentago is " + area);
	}
}
