package project.test.intw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prefix {

	public static void main(String[] args) {
		String[] strs = { "a", "aca", "accb", "b" };
		Prefix p = new Prefix();
		p.longestCommonPrefix(strs);
		System.out.println(p.longestCommonPrefix(strs));

	}

	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";

		String result = Arrays.stream(strs).reduce((a, b) -> {
			int i = 0;
			while (i < a.length() && i < b.length() && a.charAt(i) == b.charAt(i)) {
				i++;
			}
			return a.substring(0, i);
		}).orElse("");

		return result; // Return result at the end
	}

}
