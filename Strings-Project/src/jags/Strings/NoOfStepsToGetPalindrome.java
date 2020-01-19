package jags.Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//One String given :one in incorrect order-
//return  number of steps  if they are palindrome else return -1.
public class NoOfStepsToGetPalindrome {

	public static int main(String[] args) throws IOException {
		
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s="baaaaaa";	
		
		int count=0,n=s.length();int i=0;
		
		if(isPalindrome(s)) {
			//System.out.printf("%d Palindrome  steps",count);
		}
		else {
			
			while(i<=n-1) {
				s=s.substring(n-1)+s.substring(0,n-1);
				count++;i++;
				if(isPalindrome(s)) {
					//System.out.printf("%d Palindrome  steps",count);
					break;
				}
				
			}
			
		}
		return count;
		
	}

	 static boolean isPalindrome(String s) {
		
		char[] ch = new char[s.length()];
		try {
			for (int i = s.length() - 1, j = 0; i >= 0 && j <=s.length() - 1; i--, j++) {
				ch[j] = s.charAt(i);
			}
		} catch (Exception e) {
			return false;
		}
		String rev=new String(ch);
		if(s.equals(rev)) {
			return true;
		}
		
		return false;
		
	}
	
}
