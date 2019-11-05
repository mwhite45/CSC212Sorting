package edu.smith.cs.csc212.sorting;

import java.util.ArrayList;
import java.util.List;
import me.jjfoley.adt.ListADT;

/**
 * Selection Sort is a simple sort that is O(n)?.
 * @author jfoley
 *
 */
public class SelectionSort {
	/**
	 * Bubble Sort is done! And it is easy to do in-place (without creating a new list!)
	 * @param input - the list to be sorted.
	 */
	
	
	public static void sort(ListADT<Integer> input, int index) { //check if input passed in correctly
		//int N = input.size();
		List<Integer> sortedList = new ArrayList<>(); //ask jj about whether ListADT or this is fine
		
		while (input.size() != 0) {
			//call getSmallest
			getSmallest(input);
			//add to sortedList
			sortedList.add(0, input.getIndex(index)); //change to addBack(input.getIndex(index))
			//remove from input 
			input.removeIndex(index);
		}
		System.out.println(sortedList);

		
	
					
	}
	public static int getSmallest(ListADT<Integer> input) {
		Integer min = Integer.MAX_VALUE; //assign min as 
		int index = -1; //initialize index as smallest number before index values in input list 
		for (int i = 0; i < input.size(); i++) {
			Integer currentElement = input.getIndex(i);
			if (input.getIndex(i) < input.getIndex(i+1)) {
				index = i;
				min = currentElement;
 			}
		}
		System.out.println(index);
		return index;
	
	}

}
