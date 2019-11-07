package edu.smith.cs.csc212.sorting;

import me.jjfoley.adt.ListADT;
import me.jjfoley.adt.impl.JavaList;

public class MergeSort {
	
	public static void combine(ListADT<Integer> left, ListADT<Integer> right) {//left and right (both sorted)
		ListADT<Integer> combined = new JavaList<Integer>();
		
		while (left.size() != 0 && right.size() != 0) {
			
//			if (left.getFront() < right.getFront()) { //should it be <=?
				combined.addBack(left.removeFront());
			}
		
		}
		combined.addAll(right);
	}
	
	public static void recursiveSort(ListADT<Integer> input) { //check if input passed in correctly
		
					
	}
	
	public static void iterativeSort(ListADT<Integer> input) {
		
	}
	
	

}
