/*
 * Author: Tan Trieu
 * Last Modified: 2/28/17
 */

package collections.map;

import java.util.HashMap;

public class MyHashMap extends HashMap<String, Integer> {
	
	protected HashMap<String, Integer> map;
	
	public MyHashMap() {
		map = new HashMap<String, Integer>();
	}
	
	public Integer put(String key, Integer value) {
		if(containsKey(key)) {
			System.out.println(key + " is already a key with the value " + get(key) + ". You cannot have duplicate keys in the Map.");
			return value;
		} else {
			return super.put(key, value);
		}
	}
	
	public void printMap() {
		for(String key : this.keySet()) {
			System.out.println("KEY IS " + key + " WITH THE VALUE " + get(key));
		}
		System.out.println("\nThe size of this collection is " + size());
	}
	
}