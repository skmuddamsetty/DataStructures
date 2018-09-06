package com.skmuddamsetty.ds;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

/**The first line of the input contains a single integer T, 
 * denoting the number of test cases. Then T test cases follow. 
 * Each test case contains one lines of input denoting the value of n. */

class PrintPattern {
	public static void main(String[] args) {
		PrintPattern obj = new PrintPattern();
		obj.readFile("file/PrintThisPattern.txt");
	  }

	  private void readFile(String fileName) {
		Stack<Character> myStack = new Stack<Character>();
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());

		try (Scanner scanner = new Scanner(file)) {

			while (scanner.hasNextLine()) {
				String currentLine = scanner.nextLine();
				if(currentLine!=null && !currentLine.isEmpty()){
					int numberOfTestCases = Integer.parseInt(currentLine);
					while(numberOfTestCases>0){
						currentLine = scanner.nextLine();
						if(currentLine!=null && !currentLine.isEmpty()){
							int inputNumber = Integer.parseInt(currentLine);
							int totalLength = (2 * inputNumber) - 1;
							int tempLength = 0;
							int start = 0;
							int end = totalLength - 1;
							for(int i=0;i<totalLength;i++){
								tempLength = totalLength;
								if(i>0 && inputNumber>0){
									inputNumber = inputNumber - 1;
								}
								if(inputNumber>0){
									System.out.println(inputNumber);
								}
								if(inputNumber<1){
									inputNumber = inputNumber + 1;
									System.out.println("Test"+inputNumber);
								}
							}
						}
						numberOfTestCases--;
					}
				}
			}

			scanner.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	  }
	
}