package project.test.intw.ibm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToNum {
	public static void main(String args[]) {
		RomanToNum dr=new RomanToNum();
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		dr.romanToInt(s);
	}
	 public int romanToInt(String s) {
	        Map< Character, Integer> m = new HashMap<>();
	        
	        m.put('I', 1);
	        m.put('V', 5);
	        m.put('X', 10);
	        m.put('L', 50);
	        m.put('C', 100);
	        m.put('D', 500);
	        m.put('M', 1000);
	        
	        int ans = 0;   
	        if (s.length() == 2) {
				if ((s.charAt(0) == 'V' && s.charAt(1) == 'V') || (s.charAt(0) == 'L' && s.charAt(1) == 'L')
						|| (s.charAt(0) == 'D' && s.charAt(1) == 'D')) {
					System.out.println("Invalid Roman Number");
					return 0;
				}

			}
	        if (s.length() >= 4) {
				for (int i = 0; i <= s.length() - 4; i++) {
					if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == s.charAt(i + 2)
							&& s.charAt(i) == s.charAt(i + 3)) {
						System.out.println("Invalid Roman number");
						return 0; // Exit early
					}
				}

			}
	        for (int i = 0; i < s.length(); i++) {
	            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
	                ans -= m.get(s.charAt(i));
	            } else {
	                ans += m.get(s.charAt(i));
	            }
	        }
	        
	        System.out.println(ans);
	        return ans;
	    }
	 

}
