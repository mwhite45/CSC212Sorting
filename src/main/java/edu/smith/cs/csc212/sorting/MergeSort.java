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
	
	public static void recursiveMergeSort(ListADT<Integer> input) { 
		//break down list into pieces 
		if (input.size() > 1) {
			
			//find middle to divide
			int middle = input.size()/2;
			ListADT<Integer> left = input.slice(0, middle);
			ListADT<Integer> right = input.slice(middle, input.size());
			
			//call mergeSort on 1st half
			recursiveMergeSort(left);
			
			//call mergeSort on 2nd half
			recursiveMergeSort(right);
			
			//merge two halves together
			ListADT<Integer> sortedList = combine(left, right);
			
			for (int i = 0; i < input.size(); i++) {
				input.setIndex(i, sortedList.getIndex(i));
			}
		}
		
					
	}
	
	public static void iterativeMergeSort(ListADT<Integer> input) {
		ListADT<ListADT<Integer>> queue = new DoublyLinkedList<ListADT<Integer>>();
		//need to copy DLL into 
		if (input.size() > 1) {
			
			
			//iterate through unsorted list
			for (int i = 0; i < input.size(); i++) {
				//add each element to queue as own list
				ListADT<Integer> singleton = new JavaList<Integer>();
				singleton.addBack(input.getIndex(i));
				queue.addBack(singleton);	
			}
			
			
			while (queue.size() > 1) {
				//call combine on first two 
				ListADT<Integer> combinedList = combine(queue.removeFront(), queue.removeFront());
				queue.addBack(combinedList);
				
			}
			
			ListADT<Integer> sortedList = queue.getFront();
			
			for (int j = 0; j < input.size(); j++) {
				input.setIndex(j, sortedList.getIndex(j));
			}
			
		}
		
		
		
	}
	
	

}
