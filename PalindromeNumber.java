package project.test.intw;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x=s.nextInt();
		PalindromeNumber p = new PalindromeNumber();
		p.IsPalindrome(x);
		
	}
	public boolean  IsPalindrome(int x) {
		int temp;
		int reverse =0 ;
		int org=x;
		if(x!=0) {
		temp=0;
		while(x>0) {
			temp = x%10;
			x=x/10;
			reverse=reverse*10+temp;
		 }
		//reverse=temp;
		}
		if(org==reverse) {
			System.out.println("It is a palindrome");
			return true;
		} else {
			System.out.println("It is not a palindrome");
			return false;
		}
		//return reverse;
		
	}

}
