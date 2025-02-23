package project.test.intw;

import java.rmi.server.Skeleton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LongestCommonPrefix extends Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = { "flower", "flow", "flight" };
		String[] st = { "dog", "racecar", "car" };
		String[] stt = { "a" };
		String[] sss= {"ab", "a"};
		String[] f1= {"a","aca","accb","b"};
		LongestCommonPrefix lmp = new LongestCommonPrefix();
		System.out.println(lmp.longestCommonPrefix(f1));
		System.out.println(lmp.longestCommonPrefix(strs));
		System.out.println(lmp.longestCommonPrefix(st));
		System.out.println(lmp.longestCommonPrefix(stt));
		System.out.println(lmp.longestCommonPrefix(sss));
	}

	public String longestCommonPrefix(String[] strs) {

		String s1 = "";
		String s2 = "";
		String s3 = "";
		String res = "";
		try {
			if (strs.length == 1) {
				res = strs[0];
			} else if (strs.length == 2) {
				s1 = strs[0];
				s2 = strs[1];
				int longestSize = 0;
				if (s1.length() > s2.length()) {
					longestSize = s2.length();
				} else {
					longestSize = s1.length();
				}

				for (int j = 0; j < longestSize; j++) {
					if (s1.charAt(j) == s2.charAt(j)) {
						// result[j]=s1.charAt(j);
						res += s1.charAt(j);
					} else {
						res += "";
						break;
					}
					 //break;
				}
			} else {
				for (int i = 0; i < strs.length; i++) {

					s1 = strs[i];
					s2 = strs[i + 1];
					s3 = strs[i + 2];
					int longestSize = 0;
					if (s1.length() > s2.length()) {
						longestSize = s2.length();
					} else if (s2.length() < s3.length()) {
						longestSize = s2.length();
					} else if(s1.length()==s3.length()&&s1.length()==s2.length()) {
						longestSize=s1.length();
					}
					char[] result = new char[longestSize];

					for (int j = 0; j < longestSize; j++) {
						if (s1.charAt(j) == s2.charAt(j) && s1.charAt(j) == s3.charAt(j)) {
							// result[j]=s1.charAt(j);
							res += s1.charAt(j);
						} else {
							res += "";
						}
						// break;
					}

					break;
				}
			}
		} catch (Exception e) {
			System.out.println("Something went wrong");
		}
		// st.iterator().next().contains(strs[i]);

		return res;

	}

}
