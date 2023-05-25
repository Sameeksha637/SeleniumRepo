package week2.day1;

import java.util.Arrays;

public class RemoveDuplicatesInString {
	
	public static void main(String[] args) {
		// Declare all variables
		String  text = "We learn java basics as part of java sessions in java week1", result = "";
		String allWords[];
		
		
		// Split the given sentence to get each word as String array
		allWords = text.split(" ");
		// Use for loop to remove duplicate words
		for(int i=0; i<allWords.length; i++) {
			for(int j=i+1; j<allWords.length; j++) {
				if(allWords[i].equals(allWords[j])) {
					allWords[j] = "remove";
				}
			}
		}
		// Convert to String
		for(String word: allWords) {
			if(word != "remove") {
				result = result + word + " ";
			}
		}
		System.out.println("\nSentence after removing duplicate words: " + result);
}
}
