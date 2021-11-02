import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TourTest {	
	
	private static Point[] points = {
		new Point (110.0, 225.0),
		new Point (161.0, 280.0),
		new Point (325.0, 554.0),
		new Point (490.0, 285.0),
		new Point (157.0, 443.0),
		new Point (283.0, 379.0),
		new Point (397.0, 566.0),
		new Point (306.0, 360.0),
		new Point (343.0, 110.0),
		new Point (552.0, 199.0)
	};
	
	// tests insertNearest using tsp10.txt
    @Test
    public void tsp10NearestTest1() {

    	String expectedAnswer = "(110.0, 225.0)\n";
    	double distance = 0.0;
    	int numPoints = 1;
    	
    	Tour t = new Tour();
    	
    	for (int i = 0; i < numPoints; i++) {
    		t.insertNearest (points[i]);
    	}
	
		assertEquals("Failed for the example tsp10NearestTest1", expectedAnswer, t.toString());
		assertEquals(distance, t.length(), 0.0);
    }

    @Test
    public void tsp10NearestTest2() {

    	String expectedAnswer = "(110.0, 225.0)\n"
								+ "(161.0, 280.0)\n";
    	double distance = 150.0133327407934;
    	int numPoints = 2;
    	
    	Tour t = new Tour ();
    	
    	for (int i = 0; i < numPoints; i++) {
    		t.insertNearest (points[i]);
    	}
	
		assertEquals("Failed for the example tsp10NearestTest1", expectedAnswer, t.toString());
		assertEquals(distance, t.length(), 0.0);
    }

    @Test
    public void tsp10NearestTest3() {

    	String expectedAnswer = "(110.0, 225.0)\n"
								+ "(161.0, 280.0)\n"
								+ "(325.0, 554.0)\n";
    	double distance = 787.358844018307;
    	int numPoints = 3;
    	
    	Tour t = new Tour ();
    	
    	for (int i = 0; i < numPoints; i++) {
    		t.insertNearest (points[i]);
    	}
	
		assertEquals("Failed for the example tsp10NearestTest1", expectedAnswer, t.toString());
		assertEquals(distance, t.length(), 0.0);
    }

    @Test
    public void tsp10NearestTest5() {

    	String expectedAnswer = "(110.0, 225.0)\n"
								+ "(161.0, 280.0)\n"
								+ "(157.0, 443.0)\n"
								+ "(325.0, 554.0)\n"
								+ "(490.0, 285.0)\n";
    	double distance = 1139.6938059391582;
    	int numPoints = 5;
    	
    	Tour t = new Tour ();
    	
    	for (int i = 0; i < numPoints; i++) {
    		t.insertNearest (points[i]);
    	}
	
		assertEquals("Failed for the example tsp10NearestTest1", expectedAnswer, t.toString());
		assertEquals(distance, t.length(), 0.0);
    }

    @Test
    public void tsp10NearestTest10() {

    	String expectedAnswer = "(110.0, 225.0)\n"
				    			+ "(161.0, 280.0)\n"
				    			+ "(157.0, 443.0)\n"
				    			+ "(283.0, 379.0)\n"
				    			+ "(306.0, 360.0)\n"
				    			+ "(325.0, 554.0)\n"
				    			+ "(397.0, 566.0)\n"
				    			+ "(490.0, 285.0)\n"
				    			+ "(552.0, 199.0)\n"
				    			+ "(343.0, 110.0)\n";
    	double distance = 1566.1363051360363;
    	int numPoints = 10;
    	
    	Tour t = new Tour ();
    	
    	for (int i = 0; i < numPoints; i++) {
    		t.insertNearest (points[i]);
    	}
	
		assertEquals("Failed for the example tsp10NearestTest1", expectedAnswer, t.toString());
		assertEquals(distance, t.length(), 0.0);
    }
    
    // Repeats similar tests for insertSmallest
    @Test
    public void tsp10SmallestTest1() {

    	String expectedAnswer = "(110.0, 225.0)\n";
    	double distance = 0.0;
    	int numPoints = 1;
    	
    	Tour t = new Tour();
    	
    	for (int i = 0; i < numPoints; i++) {
    		t.insertSmallest (points[i]);
    	}
	
		assertEquals("Failed for the example tsp10NearestTest1", expectedAnswer, t.toString());
		assertEquals(distance, t.length(), 0.0);
    }

    @Test
    public void tsp10SmallestTest2() {

    	String expectedAnswer = "(110.0, 225.0)\n"
    							+ "(161.0, 280.0)\n";
    	double distance = 150.0133327407934;
    	int numPoints = 2;
    	
    	Tour t = new Tour();
    	
    	for (int i = 0; i < numPoints; i++) {
    		t.insertSmallest (points[i]);
    	}
	
		assertEquals("Failed for the example tsp10NearestTest1", expectedAnswer, t.toString());
		assertEquals(distance, t.length(), 0.0);
    }
    
    @Test
    public void tsp10SmallestTest3() {

    	String expectedAnswer = "(110.0, 225.0)\n"
				    			+ "(325.0, 554.0)\n"
				    			+ "(161.0, 280.0)\n";
    	double distance = 787.358844018307;
    	int numPoints = 3;
    	
    	Tour t = new Tour();
    	
    	for (int i = 0; i < numPoints; i++) {
    		t.insertSmallest (points[i]);
    	}
	
		assertEquals("Failed for the example tsp10NearestTest1", expectedAnswer, t.toString());
		assertEquals(distance, t.length(), 0.0);
    }
    
    @Test
    public void tsp10SmallestTest5() {

    	String expectedAnswer = "(110.0, 225.0)\n"
				    			+ "(490.0, 285.0)\n"
				    			+ "(325.0, 554.0)\n"
				    			+ "(157.0, 443.0)\n"
				    			+ "(161.0, 280.0)\n";
    	double distance = 1139.6938059391582;
    	int numPoints = 5;
    	
    	Tour t = new Tour();
    	
    	for (int i = 0; i < numPoints; i++) {
    		t.insertSmallest (points[i]);
    	}
	
		assertEquals("Failed for the example tsp10NearestTest1", expectedAnswer, t.toString());
		assertEquals(distance, t.length(), 0.0);
    }
    
    @Test
    public void tsp10SmallestTest10() {

    	String expectedAnswer = "(110.0, 225.0)\n"
				    			+ "(283.0, 379.0)\n"
				    			+ "(306.0, 360.0)\n"
				    			+ "(343.0, 110.0)\n"
				    			+ "(552.0, 199.0)\n"
				    			+ "(490.0, 285.0)\n"
				    			+ "(397.0, 566.0)\n"
				    			+ "(325.0, 554.0)\n"
				    			+ "(157.0, 443.0)\n"
				    			+ "(161.0, 280.0)\n";
    	double distance = 1655.7461857661865;
    	int numPoints = 10;
    	
    	Tour t = new Tour();
    	
    	for (int i = 0; i < numPoints; i++) {
    		t.insertSmallest (points[i]);
    	}
	
		assertEquals("Failed for the example tsp10NearestTest1", expectedAnswer, t.toString());
		assertEquals(distance, t.length(), 0.0);
    }
}
