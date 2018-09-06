package com.skmuddamsetty.algorithms;

public class SelectionSort {
	static int[] array = CommonUtil.getArray();
	static int totalSwaps = 0;
	static int totalLoops = 0;

	public static void main(String[] args) {
		CommonUtil.printArray("Sorted Array is: ", performSelectionSortAndReturnSortedArray(array));
		CommonUtil.printTotalLoopsAndSwaps(totalLoops, totalSwaps);
	}

	public static int[] performSelectionSortAndReturnSortedArray(int[] array) {
		if (array != null && array.length > 0) {
			for (int i = 0; i < array.length; i++) {
				totalLoops++;
				for (int j = i + 1; j < array.length; j++) {
					totalLoops++;
					if (array[i] > array[j]) {
						CommonUtil.swap(array, i, j);
						totalSwaps++;
					}
				}
			}
		}
		return array;
	}

}
