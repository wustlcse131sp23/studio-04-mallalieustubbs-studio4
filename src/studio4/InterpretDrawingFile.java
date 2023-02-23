package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean filled = in.nextBoolean();
		double X = in.nextDouble();
		double Y = in.nextDouble();
		double width = in.nextDouble();
		double height = in.nextDouble();
		
		Color newcolor = new Color(red, green, blue);
		StdDraw.setPenColor(newcolor);



		if (shape.equals("rectangle")) {
		if (filled == true) {


		StdDraw.filledRectangle(X, Y, width, height);
		
		}
		
		else {
			StdDraw.rectangle(X, Y, width, height);
		}
		}
		
		if ( shape.equals("ellipse") ) {
			if (filled == true) {

				
				StdDraw.filledEllipse(X, Y, width, height);
				
				}
				
				else {
					StdDraw.ellipse(X, Y, width, height);
				}
		}
		
	}
}
