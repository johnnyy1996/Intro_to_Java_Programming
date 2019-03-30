/*
(Geometry: great circle distance) The great circle distance is the distance between
two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be the geographical
latitude and longitude of two points. The great circle distance between the two
points can be computed using the following formula:

d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))

Write a program that prompts the user to enter the latitude and longitude of two
points on the earth in degrees and displays its great circle distance. The average
earth radius is 6,371.01 km. Note that you need to convert the degrees into radians
using the Math.toRadians method since the Java trigonometric methods use
radians. The latitude and longitude degrees in the formula are for north and west.

*/

//import Scanner
import java.util.Scanner;

public class Exercise_02{
	public static final double EARTH_RADIUS = 6371.01;
	public static void main(String[] args){
		//create Scanner		
		Scanner input = new Scanner(System.in);
		//get coordinates as a line of text
		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		String line = input.nextLine();
		//get index of the comma

		int commaIndex = line.indexOf(',');
		// separate line string into two coordniates
		// String latitude = line.substring(0, commaIndex);
		// String longitude = line.substring(commaIndex + 2);
		//convert string into doubles
		double x1 = Double.parseDouble(line.substring(0, commaIndex));
		double y1 = Double.parseDouble(line.substring(commaIndex + 2));

		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		//reuse line to get the new line
		line = input.nextLine();

		//reuse comma to get index of comma on the new line
		commaIndex = line.indexOf(',');
		//reuse latitude and longitude to get each coordinate of the new line
		// latitude = line.substring(0, commaIndex);
		// longitude = line.substring(commaIndex + 2);
		//convert new coordinates into doubles
		double x2 = Double.parseDouble(line.substring(0, commaIndex));
		double y2 = Double.parseDouble(line.substring(commaIndex + 2));
		
		//convert to radians
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);
		//get distance
		double distance = EARTH_RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

		//print results
		System.out.println("The distance between the two points is " + distance + " km");
	}
}
