package jags.Strings;

import java.util.Scanner;

public class PalindromeInOnePass {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String s1=s.nextLine();
		checkPalindrome(s1);
		s.close();
	}

	private static void checkPalindrome(String s1) {
		
		char[] ch=new char[s1.length()];

		try {
			for (int i=s1.length(), j=0;i >= 0 && j < s1.length();i--,j++) {
				ch[j]=s1.charAt(i-1);
				//i--;j++;
			}
		} catch (Exception e) {
			System.out.println("exceptions occurred");
		}

		String s2=new String(ch);
		
		if(s2.equalsIgnoreCase(s1)) {
			System.out.println("Palindrome string");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
