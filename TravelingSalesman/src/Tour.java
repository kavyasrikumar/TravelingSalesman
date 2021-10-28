/**
 * <pre>
 * Name: Kavya Srikumar
 * Mrs. Kankelborg
 * Period 3
 * Project 1 Traveling Salesman
 * Last Revised on: 10/26/21
 * </pre>
 */
public class Tour {
    /** 
    * Internal Node class - you may add constructors
    */
    private class Node {
        private Point data;
        private Node next;
    }
    
    private Node (Point data, Node next) {
    	
    	data = data;
    	next = next;
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
    public double length()
    {
        return 0;
    }

    /**
     * Returns a string representation of this tour.
     */
    @Override
    public String toString()
    {
        return null;
    }

    /**
     * Draws this tour to standard drawing.
     */
    public void draw()
    {
    }

    /**
     * Inserts p into the tour using the nearest neighbor heuristic.
     */
    public void insertNearest(Point p)
    {
    }

    /**
     * Inserts p into the tour using the smallest increase heuristic.
     */
    public void insertSmallest(Point p)
    {
    }
}
