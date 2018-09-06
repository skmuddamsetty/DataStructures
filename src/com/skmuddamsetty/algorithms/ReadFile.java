package com.skmuddamsetty.algorithms;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	public static final String FILE_PATH = "file/ReverseEachWordInaGivenString.txt";

	public static void main(String[] args) {
		ReadFile readFile = new ReadFile();
		readFile.readFile();
	}

	public void readFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(FILE_PATH).getFile());
		try (Scanner scanner = new Scanner(file)) {

			while (scanner.hasNextLine()) {
				String currentLine = scanner.nextLine();
				if (currentLine != null && !currentLine.isEmpty()) {
					System.out.println(currentLine);
					System.out.println((int)currentLine.charAt(0));
				}
			}

			scanner.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
