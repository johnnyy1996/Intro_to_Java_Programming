/*

*/

public class Exercise_06 {
	public static final double RADIUS = 40;
	public static void main(String[] args) {
		// generate a random angle in radians between 0 and 2*PI
		double angle1 = (Math.random() * (2 * Math.PI));
		double angle2 = (Math.random() * (2 * Math.PI));
		double angle3 = (Math.random() * (2 * Math.PI));

		// get x and y of each point
		double x1 = RADIUS * Math.cos(angle1);
		double y1 = RADIUS * Math.sin(angle1);
		double x2 = RADIUS * Math.cos(angle2);
		double y2 = RADIUS * Math.sin(angle2);
		double x3 = RADIUS * Math.cos(angle3);
		double y3 = RADIUS * Math.sin(angle3);

		// compute the sides
		double sideOne = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		double sideTwo = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		double sideThree = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

		// compute the angles
		double angleOne = Math.toDegrees(Math.acos((sideOne * sideOne - sideTwo * sideTwo - sideThree * sideThree)
			/ (-2 * sideTwo * sideThree)));
		double angleTwo = Math.toDegrees(Math.acos((sideTwo * sideTwo - sideOne * sideOne - sideThree * sideThree)
			/ (-2 * sideOne * sideThree)));
		double angleThree = Math.toDegrees(Math.acos((sideThree * sideThree - sideTwo * sideTwo - sideOne * sideOne)
			/ (-2 * sideOne * sideTwo)));

		// Display results
		System.out.println("The three angles are " +
			Math.round(angleOne * 100) / 100.0 + " " +
			Math.round(angleTwo * 100) / 100.0 + " " +
			Math.round(angleThree * 100) / 100.0);	
	}
}
