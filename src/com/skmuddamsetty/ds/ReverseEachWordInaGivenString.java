/**Given a String of length N reverse each word in it. Words are separated by dots.

Input:
The first line contains T denoting the number of testcases. Then follows description of testcases. Each case contains a string containing dots and characters.
 

Output:
For each test case, output a String in single line containing the reversed words of the given String.

Constraints:
1<=T<=10
1<=Length of String<=2000


Example:
Input:
2
i.like.this.program.very.much
pqr.mno

Output:
i.ekil.siht.margorp.yrev.hcum
rqp.onm

@author Santhosh Kumar Muddamsetty
*/
package com.skmuddamsetty.ds;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class ReverseEachWordInaGivenString {
	public static void main(String[] args) {
		ReverseEachWordInaGivenString obj = new ReverseEachWordInaGivenString();
		obj.readFile("file/ReverseEachWordInaGivenString.txt");
	}

	private void readFile(String fileName) {
		Stack<Character> myStack = new Stack<Character>();
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());

		try (Scanner scanner = new Scanner(file)) {

			while (scanner.hasNextLine()) {
				String currentLine = scanner.nextLine();
				if (currentLine != null && !currentLine.isEmpty()) {
					reverseString(myStack, scanner, currentLine);
				}
			}

			scanner.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param myStack
	 * @param scanner
	 * @param currentLine
	 * @throws NumberFormatException
	 */
	private void reverseString(Stack<Character> myStack, Scanner scanner, String currentLine)
			throws NumberFormatException {
		int numberOfTestCases = Integer.parseInt(currentLine);
		while (numberOfTestCases > 0) {
			currentLine = scanner.nextLine();
			if (currentLine != null && !currentLine.isEmpty()) {
				System.out.print("\n");
				for (int i = 0; i < currentLine.length(); i++) {
					if (currentLine.charAt(i) != '.') {
						myStack.push(currentLine.charAt(i));
					} else {
						while (!myStack.isEmpty()) {
							System.out.print(myStack.pop());
						}
						System.out.print(".");
					}
				}
				while (!myStack.isEmpty()) {
					System.out.print(myStack.pop());
				}
			}
			numberOfTestCases--;
		}
	}

}
