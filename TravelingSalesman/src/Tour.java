/**
 * <pre>
 * Name: Kavya Srikumar
 * Mrs. Kankelborg
 * Period 3
 * Project 1 Traveling Salesman
 * Last Revised on: 10/28/21
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
    }
    
    // Required fields
    private Node home;
    private int size;
    
    // Creates an empty tour
    public Tour() {
    	home = null;
    	size = 0;
    }

    // Returns the number of points in this tour.
    public int size(){
    	return size;
    }

    // Returns the length of this tour.
    public double length() {
    	
        Node temp = home;
        double length = 0;
       
        // if there is a home data point, calculate the distance between home and the point after
        // then shift to the next set of points, and repeat
        if (temp != null) {
            while (temp.next != null) {
                length += temp.data.distanceTo(temp.next.data);
                temp = temp.next;
            }
            // add the distance from the last to first
            length += temp.data.distanceTo(home.data);
        }

        return length;
    }

    // Returns a string representation of this tour.
    @Override
    public String toString() {
    
	    Node temp = home;
	    String result = "";
	    
	    // traverses the linked list and adds a string representation of each Nodes' data to the result string
	    while  (temp != null) {
	        result += temp.data.toString() + "\n";
	        temp = temp.next;
	    }
	    
	    return result;
    }

    // Draws this tour to standard drawing.
    public void draw() {
    	
        StdDraw.enableDoubleBuffering();

        // get the first node
        Node temp = home;
        
        // if there is a Node, draw its data as a point
        // then move to next if there is one, and repeat
        if (temp != null) {
            temp.data.draw();

            while (temp.next != null) {
                Point p1 = temp.next.data;
                p1.draw();
                temp.data.drawTo(p1);

                temp = temp.next;
            }

            // connect it back to home.
            temp.data.drawTo(home.data);
        }

        StdDraw.show();
    }

    // Inserts p into the tour using the nearest neighbor heuristic.
    public void insertNearest(Point p) {
    	
    	Node temp = home;
    	double smallestDistance = Double.MAX_VALUE;
    	Node smallest = null;
    	
    	if ( home == null) {
    		
    		home = new Node (p, null);
    		
    	} else {
    		
	    	while (temp != null) {
	    		
	    		double d = p.distanceTo(temp.data);
	    		if ( d < smallestDistance ) {
	    			
	    			smallestDistance = d;
	    			smallest = temp;
	    		}
	    		
	    		temp = temp.next;
	    	}
	    	
	    	Node newNode = new Node(p, smallest.next);
	    	smallest.next = newNode;
    	}
    	size++;
    }

    // Inserts p into the tour using the smallest increase heuristic.
    public void insertSmallest(Point p) {
    	
    	if ( home == null) {
    		
    		home = new Node (p, null);
    		
    	} else {
    		
    		// insert p next to each point and compute the total distance
    		// place p next to the point where it adds the smallest distance
    		
    		Node temp = home;
    		double minDist = Double.MAX_VALUE;
    		Node minNode = null;
    		
    		double currentDist = length();
    		
    		while (temp != null) {
    			
    			Node nextNode = temp.next;
    			if (nextNode == null) {
    				nextNode = home;
    			}
    			
    			double distChange = temp.data.distanceTo(p) + p.distanceTo(nextNode.data) 
    									- temp.data.distanceTo(nextNode.data);
    			double d = currentDist + distChange;
    			
    			if ( d < minDist) {
    				minDist = d;
    				minNode = temp;
    			}
    			
    			temp = temp.next;
    		}
    		
    		Node newNode = new Node (p, minNode.next);
    		minNode.next = newNode;
    	}
    	size++;
    }
}
