package project.test.intw;

public class MergeStringAltr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeStringAltr m = new MergeStringAltr();
		System.out.println(m.mergeAlternately("abc", "p"));

	}

	public String mergeAlternately(String word1, String word2) {
		String finalString = "";
		int size = 0;
		if (word1.length() > word2.length()) {
			size = word1.length();
		} else if (word1.length() < word2.length()) {
			size = word2.length();
		} else {
			size = word1.length();
		}
		for (int i = 0; i < size; i++) {
			// finalString+=word1.charAt(i)+word;
			if (!(word1.length() == 0) && !(word2.length() == 0)) {
				if (i < word1.length()) {
					finalString += String.valueOf(word1.charAt(i));
					if (i < word2.length()) {
						finalString += String.valueOf(word2.charAt(i));
					} else {

					}
				} else {
					if (i < word2.length()) {
						finalString += String.valueOf(word2.charAt(i));
					}
				}
			}

		}
		// apbqrs
		return finalString;

	}

}

//You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
//
//Return the merged string.
//
// 
//
//Example 1:
//
//Input: word1 = "abc", word2 = "pqr"
//Output: "apbqcr"
//Explanation: The merged string will be merged as so:
//word1:  a   b   c
//word2:    p   q   r
//merged: a p b q c r
