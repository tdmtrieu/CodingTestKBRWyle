/*
 * Author: Tan Trieu
 * Last Modified: 2/28/17
 */

package collections.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaCollectionsDriver {

	public static void main(String[] args) {

		List<Integer> firstCollection = Arrays.asList(7, 10, 3, 4, 6, 9, 1, 8, 5, 2);
		List<Integer> secondCollection = Arrays.asList(13, 12, 7, 14, 9, 6, 10, 15, 8, 11);
		List<Integer> combinedCollection;

		printCollection(firstCollection);
		printCollection(secondCollection);

		System.out.println("The size of this collection is : " + firstCollection.size());
		System.out.println("The size of this collection is : " + secondCollection.size());

		combinedCollection = merge(firstCollection, secondCollection);
		
		printCollection(combinedCollection);
		
		//prints the reverse order of what is in the collection
		printCollectionReverse(combinedCollection);
		System.out.println("The size of this collection is : " + combinedCollection.size());

	}


	private static void printCollection(List<Integer> collection) {
		System.out.println("Printing collection : " + collection);
	}
	
	private static void printCollectionReverse(List<Integer> collection) {
		List<Integer> temp = new ArrayList<Integer>(collection);
		Collections.reverse(temp);
		printCollection(temp);
	}
	
	// removes all duplicates from both collections, sorts the new collection and returns it as a List<Integer>
	private static List<Integer> merge(List<Integer> first, List<Integer> second) {
		List<Integer> temp1 = new ArrayList<Integer>(first);
		List<Integer> temp2 = new ArrayList<Integer>(second);

		temp1.removeAll(temp2);
		temp1.addAll(temp2);
		Collections.sort(temp1);
		return temp1;
	}

}
