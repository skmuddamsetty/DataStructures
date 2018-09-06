/**
 * Given two strings S and A . Print "1" if both strings are anagrams otherwise print "0" .
 * Input: First line of input contains a single integer T which denotes the number of test cases. T test cases follows, first line of each test case contains a string S. Second and last line of each test case consists of string A.
 * Output: Corresponding to each test case, print the required output.
 * Constraints:
 * 1<=T<=100
 * 1<= length(S and A) <=1000
 * Example:
 * Input:
 * 2
 * cdbkdub
 * dsbkcsdn
 * geeks
 * skgee
 * Output:
 * 0
 * 1
 */

package com.skmuddamsetty.geeksforgeeks;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class JavaAnagramStrings {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		JavaAnagramStrings obj = new JavaAnagramStrings();
		obj.readFile("file/JavaAnagramStrings.txt");
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		double seconds = (double) totalTime / 1000000000.0;
		System.out.println("\nTotal time taken in seconds: " + seconds);
	}

	private void readFile(String fileName) {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());
		try (Scanner br = new Scanner(file)) {
			int testCases = Integer.parseInt(br.nextLine());
			String str1 = null;
			String str2 = null;
			int str1Sum = 0;
			int str2Sum = 0;
			while (testCases > 0) {
				str1 = br.nextLine();
				str2 = br.nextLine();
				str1Sum = 0;
				str2Sum = 0;
				if (str1.length() != str2.length()) {
					System.out.println("0");
				} else {
					for (int i = 0; i < str1.length(); i++) {
						str1Sum = (int) str1.charAt(i) + str1Sum;
					}
					for (int i = 0; i < str2.length(); i++) {
						str2Sum = (int) str2.charAt(i) + str2Sum;
					}
					if (str1Sum == str2Sum) {
						System.out.println("1");
					} else {
						System.out.println("0");
					}
				}
				testCases--;
			}

			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
