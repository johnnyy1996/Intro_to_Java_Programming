/*
Write a program that reads a Celsius degree in a double value from
the console, then converts it to Fahrenheit and displays the result.
		fahrenheit = (9 / 5) * celsius + 32
*/

import java.util.Scanner;

public class Exercise_01{
    
	public static void main(String[] args){
		
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter the degrees in Celsius: ");
		
        double celsius = input.nextDouble();
		double farenheit = (9.0 / 5) * celsius + 32;
		
        System.out.println(celsius + " Celsius is " + farenheit + " Farenheit");
	}
}
