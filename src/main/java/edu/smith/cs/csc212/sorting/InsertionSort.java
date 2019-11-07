package edu.smith.cs.csc212.sorting;

import java.util.ArrayList;
import java.util.List;
import me.jjfoley.adt.ListADT;
import me.jjfoley.adt.impl.JavaList;

public class InsertionSort {
	//until unsorted is empty, take first element off it, find point it should go in sorted (point where all previous are smaller after are larger) and insert 

	public static void sort(ListADT<Integer> input) {
		
		ListADT<Integer> sortedList = new JavaList<Integer>();
		
		int N = input.size();
		
		
			for (int i=0; i<N; i++) {
				boolean added = false;
				for (int j=0; j<sortedList.size(); j++) {
					if (input.getIndex(i) < sortedList.getIndex(j)) {
						sortedList.addIndex(j, input.getIndex(i));
						added = true;
						break;
					}
					
				}
				if (!added) {
					sortedList.addBack(input.getIndex(i));
				}
			}
			
			for (int k = 0; k < N; k++) {
				input.setIndex(k, sortedList.getIndex(k));
			}
				
		
		
		
		
		
		
		
	}
}
