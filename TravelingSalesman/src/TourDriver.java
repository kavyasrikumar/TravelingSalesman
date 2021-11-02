import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Test driver for the Tour class that reads in sample input files, outputs basic metrics such as
 * length and size (number of points), and draws the resulting tour.
 */
public class TourDriver {
    public static void main(String[] args) {
        Tour test = new Tour();
        try {
            String filename = "./input/tsp10.txt"; // Try out different sample input files!
            BufferedReader bf = new BufferedReader(new FileReader(new File(filename)));
            String scale = bf.readLine();
            String[] points = scale.split(" ");
            StdDraw.setXscale(0, Double.parseDouble(points[0]));
            StdDraw.setYscale(0, Double.parseDouble(points[1]));
            String nextLine = bf.readLine();
            
            while (nextLine != null && !nextLine.equals("")) {
            	
                // Trim empty spaces
                nextLine = nextLine.trim();
                nextLine = nextLine.replaceAll("\\s+",  " ");

                double x;
                double y;
                
                // create an array with the characters in the current line of the text file
                String[] line = nextLine.split(" ");

                // assuming all lines have exactly two doubles for the coordinates
                x = Double.parseDouble(line[0]);
                y = Double.parseDouble(line[1]);

                // create a point and insert
                Point p = new Point (x, y);
                // insertNearest(p);
                // insertSmallest(p);

                // read to next line
                nextLine = bf.readLine();
            }
            
            bf.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(test);
        System.out.println("Tour length = " + test.length());
        System.out.println("Number of points = " + test.size());

        test.draw();
    }
}
