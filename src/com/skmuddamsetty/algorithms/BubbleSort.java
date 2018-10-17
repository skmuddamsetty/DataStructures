package com.skmuddamsetty.algorithms;

/**
 * @author skmuddamsetty
 *
 */
public class BubbleSort {
	private static int[] array = CommonUtil.getArray();
	private static int totalSwaps = 0;
	private static int totalLoops = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		 CommonUtil.printArray("Sorted Array is: ",
//		 performBubbleSortUsingRecursionAndReturnSortedArray(array,
//		 array.length));
		CommonUtil.printArray("Sorted Array is: ", performBubbleSortAndReturnSortedArray(array));
		CommonUtil.printTotalLoopsAndSwaps(totalLoops, totalSwaps);
	}

	/**
	 * @param array
	 * @return array
	 */
	public static int[] performBubbleSortAndReturnSortedArray(int[] array) {
		if (array != null && array.length > 0) {
			for (int i = 0; i < array.length; i++) {
				totalLoops++;
				boolean swapped = false;
				for (int j = 0; j < array.length - i - 1; j++) {
					totalLoops++;
					if (array[j] > array[j + 1]) {
						CommonUtil.swap(array, j, j + 1);
						totalSwaps++;
						swapped = true;
					}
				}
				if (!swapped) {
					System.out.println("List is sorted at loop:" + i);
					break;
				}
			}
		}
		return array;
	}

	public static int[] performBubbleSortUsingRecursionAndReturnSortedArray(int[] array, int length) {
		if (length == 1) {
			return array;
		}
		if (array != null && array.length > 0) {
			for (int i = 0; i < length - 1; i++) {
				totalLoops++;
				if (array[i] > array[i + 1]) {
					CommonUtil.swap(array, i, i + 1);
					totalSwaps++;
				}
			}
			performBubbleSortUsingRecursionAndReturnSortedArray(array, length - 1);
		}
		return array;
	}
}
