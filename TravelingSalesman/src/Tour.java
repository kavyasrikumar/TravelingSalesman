/**
 * <pre>
 * Name: Kavya Srikumar
 * Mrs. Kankelborg
 * Period 3
 * Project 1 Traveling Salesman
 * Last Revised on: 10/27/21
 * </pre>
 */
public class Tour {
    /** 
    * Internal Node class - you may add constructors
    */
    private class Node {
        private Point data;
        private Node next;

        public Node (Point d, Node n) {
            data = d;
            next = n;
        }

        public double distanceTo(Point p) {
            return data.distanceTo(p);
        }

        public Point getPoint() {
            return data;
        }

        public Node getNextNode() {
            return next;
        }

        public void insertNext(Point p) {
            Node n = new Node (p, next);
            next = n;
        }
    }
    
    /**
    * Required fields
    */
    private Node home;
    private int size;
    
    /**
     * Creates an empty tour.
     */
    public Tour() {
    	
    	home = null;
    	size = 0;
    }

    /**
     * Returns the number of points in this tour.
     */
    public int size(){
        
    	return size;
    }

    /**
     * Returns the length of this tour.
     */
    public double length() {
    	
        Node temp = home;
        double length = 0;
       
        if (temp != null) {
            while (temp.getNextNode() != null) {
                length += temp.getPoint().distanceTo(temp.getNextNode().getPoint());
                temp = temp.next;
            }
            // add the distance from the last to first
            length += temp.getPoint().distanceTo(home.getPoint());
        }

        return length;
    }

    /**
     * Returns a string representation of this tour.
     */
    @Override
    public String toString() {
    
	    Node temp = home;
	    String s = "";
	    
	    while  (temp != null) {
	        s += temp.getPoint().toString() + "\n";
	        temp = temp.getNextNode();
	    }
	    
	    return s;
    }

    /**
     * Draws this tour to standard drawing.
     */
    public void draw() {
    	
        StdDraw.enableDoubleBuffering();

        // Find the nearest node
        Node temp = home;
       
        if (temp != null) {
            temp.getPoint().draw();

            while (temp.getNextNode() != null) {
                Point p1 = temp.getNextNode().getPoint();
                p1.draw();
                temp.getPoint ().drawTo(p1);

                temp = temp.getNextNode();
            }

            // Complete it back to home.
            temp.getPoint().drawTo(home.getPoint());
        }

        StdDraw.show();
    	
    }

    /**
     * Inserts p into the tour using the nearest neighbor heuristic.
     */
    public void insertNearest(Point p) {
    }

    /**
     * Inserts p into the tour using the smallest increase heuristic.
     */
    public void insertSmallest(Point p) {
    }
}
