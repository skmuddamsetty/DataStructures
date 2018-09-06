package com.skmuddamsetty.algorithms;

import java.util.Arrays;

public class CommonUtil {
	public static void printArray(String message, int[] array) {
		// System.out.print(message);
		// for (int i = 0; i < array.length; i++) {
		// System.out.print(array[i] + " ");
		// }
		// System.out.println("");
		System.out.println(message + ": " + Arrays.toString(array));

	}

	public static int[] swap(int[] array, int outerIndex, int innerIndex) {
		int temp = array[outerIndex];
		array[outerIndex] = array[innerIndex];
		array[innerIndex] = temp;
		return array;
	}

	public static int[] getArray() {
		int[] array = { 4, 5, 6, 2, 1, 7, 10, 3, 8, 9 };
		return array;
	}
	
	public static void printTotalLoopsAndSwaps(int totalLoops, int totalSwaps){
		System.out.println("Total Swaps:" + totalSwaps + "\n" + "Total loops:" + totalLoops);
	}
}
