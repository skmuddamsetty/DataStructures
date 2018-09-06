package com.skmuddamsetty.algorithms;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class FileReading {
	public static void main (String[] args) throws IOException {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			int testCases = Integer.parseInt(br.readLine());
			while(testCases>0) {
				System.out.println(br.readLine());
			    testCases--;
			}
		}
	}
}