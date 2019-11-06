package edu.smith.cs.csc212.sorting;

import java.util.ArrayList;
import java.util.List;
import me.jjfoley.adt.ListADT;
import me.jjfoley.adt.impl.JavaList;

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
	
	
	public static void sort(ListADT<Integer> input) { //check if input passed in correctly
		//int N = input.size();
		//ListADT<Integer> sortedList = new JavaList<Integer>(); //ask jj about whether ListADT or this is fine
		System.out.println("izz " + input);
			for (int i = 0; i < input.size()-1; i++) {
				int min = input.getIndex(i);
				int minIndex = i;
				for (int j = i +1; j < input.size(); j++) {
					if (input.getIndex(j) < min) {
						min = input.getIndex(j);
						minIndex = j;
					}
					
				}
				
				input.swap(i, minIndex);
			}
			System.out.println("ii" + input);
		
	
					
	}
	

}
