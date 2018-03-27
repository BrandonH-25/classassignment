/*This program is an example of how to implement is Queue in Java
 * @author Brandon Howard
 * CSC234
 */
import java.util.Queue; //import Queue Class
import java.util.LinkedList; // import LinkList class

public class myqueueexamples { // class definition
	public static void main(String[] args) {
	Queue<String> family = new LinkedList<String>();
	family.add("Mom"); // Add mom to family queue
	family.add("dad"); // Add dad to family queue
	family.add("Brother"); // Add brother to family queue
	family.add("Sister"); // Add sister to family queue
	
	System.out.println(family); //Shows the content of the queue
	
	family.remove(); // remove an item from the queue
	}

}
