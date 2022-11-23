package com.skillstorm.countingCharacters;

import java.util.HashMap;

public class Counting {

	public static HashMap<Character, Integer> countCharacters(String word){
		HashMap<Character, Integer> characterCount = new HashMap<>();
		if(word != null) {
			for(int i = 0; i < word.length(); i++) {
				char currentCharacter = word.charAt(i);
				if (characterCount.get(currentCharacter) == null)
					characterCount.put(currentCharacter, 1);
				else
					characterCount.put(currentCharacter, characterCount.get(currentCharacter)+1);
			}
		}
		return characterCount;
	}
	
	public static HashMap<String, Integer> countWords(String[] words){
		HashMap<String, Integer> wordCount = new HashMap<>();
		if(words != null) {
			for(int i = 0; i < words.length; i++) {
				String currentWord = words[i];
				if (wordCount.get(currentWord) == null)
					wordCount.put(currentWord, 1);
				else
					wordCount.put(currentWord, wordCount.get(currentWord)+1);
			}
		}
		return wordCount;
	}
}
