/*
 * Author: Tan Trieu
 * Last Modified: 2/28/17
 */

package collections.map;

public class MyHashMapDriver {
	
	public static void main(String[] args) {
		
		MyHashMap collection = new MyHashMap();
		
		collection.put("penny", 1);
		collection.put("nickel", 5);
		collection.put("dime", 10);
		collection.put("quarter", 25);
		collection.put("dollar", 100);
		
		collection.put("nickel", 35);
		
		collection.printMap();
	}	
}
/*
 * Comment the code and explain why the specific collection type was chosen.
 * 
 * I decided to use HashMap out of all the other collections because HashMap (or any Map) supports the concept
 * of key / value pairs nicely. I used HashMap instead of TreeMap because I felt this type of problem
 * did not require for the Map to be sorted since no specifications were mentioned about what should be stored
 * within the key / values and what purpose the Map will be used for. I did not use a LinkedHashMap
 * because it is only slightly faster than a HashMap when it comes to iterations and since the size of the Map
 * was only 5, I didn't think there was a big difference between the two. Out of the three types of Maps, I
 * decided to use a HashMap because that was the one I felt most comfortable using and has had the most experience with.
 */ 
