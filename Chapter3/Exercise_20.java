/*

*/
import java.util.Scanner;

public class Exercise_20{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the temperature in Fahrenheit: ");
		double fahrenheit = input.nextDouble();

		while(fahrenheit < -58 || fahrenheit > 41){
			System.out.print("Enter a temperature between -58 and 41 degrees: ");
			fahrenheit = input.nextDouble();
		}

		System.out.print("Enter the wind speed miles per hour: ");
		double speed = input.nextDouble();

		while (speed < 2){
			System.out.print("Enter a wind speed of 2 or greate");
			speed = input.nextDouble();
		}

		double windChillIndex = 35.74 + 0.6215 * fahrenheit - 35.75 * Math.pow(speed, 0.16) + 0.4275 * fahrenheit * Math.pow(speed, 0.16);

		System.out.println("the wind chill index is " + windChillIndex);
	}
}
