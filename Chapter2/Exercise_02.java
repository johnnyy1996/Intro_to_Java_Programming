/*
Write a program that reads in the radius and length
of a cylinder and computes the area and volume.
*/

import java.util.Scanner;

public class Exercise_02{

	public static final double PI = 3.14;

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius and length of a cylinder: ");
		
		double radius = input.nextDouble(); 
		double length = input.nextDouble();
		double area = radius * radius * PI;
		double volume = area * length;
		
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
	}
}
