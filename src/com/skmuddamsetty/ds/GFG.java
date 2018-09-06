package com.skmuddamsetty.ds;
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    // Input the number of test cases you want to run
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // One by one run for all input test cases
        while (t > 0)
        {
            Stack<Character> myStack = new Stack<Character>();
            // Input the size of the array
            int input = sc.nextInt();
            String str = String.valueOf(input);
            // Input the array
            for (int i = 0; i < str.length(); i++){
                if(myStack.isEmpty() || (!myStack.isEmpty()
                    && myStack.peek()!=str.charAt(i))){
                    myStack.push(str.charAt(i));
                }
            }
            System.out.println(Arrays.toString(myStack.toArray()));
            t--;
        }
	}
}