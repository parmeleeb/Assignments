package com.skillstorm.wordCount;

import java.util.Collection;
import java.util.HashMap;

public class FileWordCountTest {

	public static void main(String[] args) {
		HashMap<String, Integer> wordCount = 
		FileWordCount.countWordsInTextFile("C:\\Users\\parme\\OneDrive\\Desktop\\Brian's Folder\\Skillstorm Classes\\Workspace\\Wk06\\Day03\\TextFiles\\CandP.txt");
		System.out.println(wordCount);
		System.out.println("Number of times \"crime\" appears: " + wordCount.get("crime"));
		System.out.println("Number of times \"punishment\" appears: " + wordCount.get("punishment"));
		long total = 0;
		Collection<Integer> values = wordCount.values();
		for(int value : values) {
			total += value;
		}
		System.out.println("Total number of words: " + total);
	}

}
