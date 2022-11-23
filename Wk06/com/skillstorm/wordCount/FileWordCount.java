package com.skillstorm.wordCount;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class FileWordCount {
	public static HashMap<String, Integer> countWordsInTextFile(String path){
		HashMap<String, Integer> wordCount = new HashMap<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			validateFile(path, "txt");
			String line = br.readLine();
			while(line != null) {
				wordCount = addWordsToMap(line, wordCount);
				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			e.getMessage();
			e.getStackTrace();
		} catch (IOException e) {
			e.getMessage();
			e.getStackTrace();
		}
		return wordCount;
	}

	private static void validateFile(String path, String fileType) 
														throws IOException {
		String[] pathSplit = path.split("\\.");
		if(!pathSplit[pathSplit.length-1].equals(fileType)) {
			throw new IOException("must be a file of type " + fileType);
		}
	}
	
	private static HashMap<String, Integer> addWordsToMap(String line, 
										HashMap<String, Integer> wordCount) {
		line = line.replaceAll("[^\\w\\s]", "").toLowerCase();
		String[] words = line.split("\\s+");
		for(String word : words) {
			if(word.isEmpty()) continue;
			if(wordCount.putIfAbsent(word, 1) != null) {//returns null on success
				wordCount.put(word, wordCount.get(word)+1);		//increment by 1
			}
		}
		return wordCount;
	}
}
