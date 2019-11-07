package edu.smith.cs.csc212.sorting;

import me.jjfoley.adt.ListADT;
import me.jjfoley.adt.impl.JavaList;

public class MergeSort {
	
	public static ListADT<Integer> combine(ListADT<Integer> left, ListADT<Integer> right) {//left and right (both sorted)
		ListADT<Integer> combined = new JavaList<Integer>();
		
		while (left.size() != 0 && right.size() != 0) {
			
			if (left.getFront() <= right.getFront()) { 
				combined.addBack(left.removeFront());
			} else {
				combined.addBack(right.removeFront());
			}
		
		}
		combined.addAll(right);
		combined.addAll(left);
		
		return combined;
		
	}
	
	public static void recursiveSort(ListADT<Integer> input) { 
		//break down list into pieces 
		if (input.size() > 1) {
			
			//find middle to divide
			int middle = input.size()/2;
			ListADT<Integer> left = input.slice(0, middle);
			ListADT<Integer> right = input.slice(middle, input.size());
			//call mergeSort on 1st half
			
			recursiveSort(left);
			//call mergeSort on 2nd half
			recursiveSort(right);
			//merge two halves together
			ListADT<Integer> sortedList = combine(left, right);
			
			for (int i = 0; i < input.size(); i++) {
				input.setIndex(i, sortedList.getIndex(i));
			}
		}
		
					
	}
	
	public static void iterativeSort(ListADT<Integer> input) {
		
	}
	
	

}
