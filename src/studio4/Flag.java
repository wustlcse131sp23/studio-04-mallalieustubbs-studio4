package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.3);
		
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledRectangle(0.5, 0.5, 0.25, 0.3);
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(0.5, 0.5, 0.1, 0.3);
		
		StdDraw.setPenColor(0,140,0);
		StdDraw.filledCircle(0.5, 0.5, 0.025);
		
		double [] x = {0.475,0.5,0.525};
		double [] y = {0.5, 0.6, 0.5};
		StdDraw.filledPolygon(x, y);
		
		double [] x2 = {0.5,0.6,0.525};
		double [] y2 = {0.5, 0.55, 0.475};
		StdDraw.filledPolygon(x2, y2);
		
		double [] x3 = {0.5,0.4,0.475};
		double [] y3 = {0.5, 0.55, 0.475};
		StdDraw.filledPolygon(x3, y3);
		
		double [] x4 = {0.5,0.6,0.5};
		double [] y4 = {0.500, 0.475, 0.45};
		StdDraw.filledPolygon(x4, y4);
		
		double [] x5 = {0.5,0.4,0.5};
		double [] y5 = {0.500, 0.475, 0.45};
		StdDraw.filledPolygon(x5, y5);
		
		StdDraw.filledRectangle(0.5, 0.45, 0.01, 0.05);

		






		


		


		
	}
}