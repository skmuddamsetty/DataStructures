package com.skmuddamsetty.algorithms;

public class InsertionSort {
	static int[] array = CommonUtil.getArray();
	static int totalSwaps = 0;
	static int totalLoops = 0;

	public static void main(String[] args) {
//		CommonUtil.printArray("Sorted Array is: ", performInsertionSortAndReturnSortedArray(array));
		 CommonUtil.printArray("Sorted Array is: ",
		 performInsertionSortUsingRecursionAndReturnSortedArray(array, 1));
		CommonUtil.printTotalLoopsAndSwaps(totalLoops, totalSwaps);
	}

	public static int[] performInsertionSortAndReturnSortedArray(int[] array) {
		int lastIndex = array.length - 1;
		if (array != null && array.length > 0) {
			for (int i = 0; i < lastIndex; i++) {
				totalLoops++;
				for (int j = i + 1; j > 0; j--) {
					totalLoops++;
					if (array[j] < array[j - 1]) {
						CommonUtil.swap(array, j, j - 1);
						totalSwaps++;
					} else {
						break;
					}
				}
			}
		}
		return array;
	}

	public static int[] performInsertionSortUsingRecursionAndReturnSortedArray(int[] array, int outerIndex) {
		if (outerIndex == array.length) {
			return array;
		}
		if (array != null && array.length > 0) {
			for (int i = outerIndex; i > 0; i--) {
				totalLoops++;
				if (array[i] < array[i - 1]) {
					CommonUtil.swap(array, i, i - 1);
					totalSwaps++;
				} else {
					break;
				}
			}
			performInsertionSortUsingRecursionAndReturnSortedArray(array, outerIndex + 1);
		}
		return array;
	}
}
