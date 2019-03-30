/*
(Geography: estimate areas) Find the GPS locations for Atlanta, Georgia; Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina
from www.gps-data-team.com/map/ and compute the estimated area enclosed by these four cities. (Hint: Use the formula in Programming Exercise 4.2
to compute the distance between two cities. Divide the polygon into two triangles and use the formula in Programming Exercise 2.19 to compute the area of a triangle.)
*/

public class Exercise_03{
	//Declare the radius of the earth
	public static final double EARTH_RADIUS = 6371.01;

	//Function to compute the side of a triangle
	public static double distanceBetweenTwoPoints(double x1, double y1, double x2, double y2){
		return EARTH_RADIUS *
                Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) +
                Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2)));
	}

	//function to check if the sides make a triangle
	public static boolean isTriangle(double side1, double side2, double side3){
        	return  ((side1 + side2 > side3) &&
                	(side1 + side3 > side2) &&
                	(side3 + side2 > side1));

    	}

	//function to get the area of the triangle by passing its sides
	public static double getTriangleArea(double side1, double side2, double side3){
        	double s = (side1 + side2 + side3) / 2.0;
        	return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
	}

	public static void main(String[] args){
		//Coordinates for Atlanta, Georgia
		double atlantaLatitude = -84.3879824;
		double atlantaLongitude = 33.7489954;
		//Coordinates for Orlando, Florida
		double orlandoLatitude = -81.3792364999;
		double orlandoLongitude = 28.5383355;
		//Coordinates for Savannah, Georgia
		double savannahLatitude = -81.09983419999998;
		double savannahLongitude = 32.0835407;
		//Coordinates for Charlotte, North Carolina
		double charlotteLatitude = -80.84312669999997;
		double charlotteLongitude = 35.2270869;

		//Compute the sides for triangle one
		double triangle1Side1 = distanceBetweenTwoPoints(atlantaLongitude, atlantaLatitude, savannahLongitude, savannahLatitude);
		double triangle1Side2 = distanceBetweenTwoPoints(savannahLongitude, savannahLatitude, charlotteLongitude, charlotteLatitude);
		double triangle1Side3 = distanceBetweenTwoPoints(charlotteLongitude, charlotteLatitude, atlantaLongitude, atlantaLatitude);

		//Compute the sides for triangle two
		double triangle2Side1 = distanceBetweenTwoPoints(atlantaLongitude, atlantaLatitude, orlandoLongitude, orlandoLatitude);
		double triangle2Side2 = distanceBetweenTwoPoints(orlandoLongitude, orlandoLatitude, savannahLongitude, savannahLatitude);
		double triangle2Side3 = distanceBetweenTwoPoints(savannahLongitude, savannahLatitude, atlantaLongitude, atlantaLatitude);
		
		//Check for real triangles
		boolean isTriangle1 = isTriangle(triangle1Side1, triangle1Side2, triangle1Side3);
		boolean isTriangle2 = isTriangle(triangle2Side1, triangle2Side2, triangle2Side3);

		//If both are triangles, then add the areas to get the total
		if(isTriangle1 && isTriangle2){
			//Compute the areas of the two triangles
            		double area1 = getTriangleArea(triangle1Side1, triangle1Side2, triangle1Side3);
            		double area2 = getTriangleArea(triangle2Side1, triangle2Side2, triangle2Side3);
			//Print information
            		System.out.printf("Triangle 1 \nSide1: %f \nSide2: %f \nSide3: %f \nArea: %f\n\n", triangle1Side1, triangle1Side2, triangle1Side3, area1);
            		System.out.printf("Triangle 2 \nSide1: %f \nSide2: %f \nSide3: %f \nArea: %f\n\n", triangle2Side1, triangle2Side2, triangle2Side3, area2);
            		double totalArea = area1 + area2;
            		System.out.println("The area of the triangle is " + totalArea);
        	} 
			//Print message if the coordinates are incorrect
		else
            		System.out.println("Incorrect Coordinates!");
	}
}
