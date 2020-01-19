package jags.Strings;

import java.util.HashSet;
import java.util.Set;


/**
 * Checking whether the parathesis are balanced or not??
 * Set interface is used::It gives distinct parathesis symbols
 * TreeSet gives Sorted set and HashSet gives unsorted set.
 * TreeSet consume::Log(n) && HashSet Consume ::O(1) for insert and delete operations
 * */
public class CheckEqualParanthesis {

	static int simpleBraces=0;
	static int  curlyBraces=0;
	public static void main(String[] args) {
		
		String str="((({(}))))";
		Set<Character> s=new HashSet<Character>();
		
		for(int i=0;i<str.length();i++) {
			s.add(str.charAt(i));
		} 
		
		System.out.println(s);
		
		Character c = null;
		for(int i=0;i<str.length();i++) 
		{
			c=str.charAt(i);
			if(c.equals('(')) simpleBraces++;
			else if(c.equals(')')) simpleBraces--;
			
			else if (c.equals('{')) curlyBraces++;
			else curlyBraces--;
				
		}
		
		if(simpleBraces==0 && curlyBraces==0)
		System.out.println("Balanced");
		else System.out.println("Not balanced");
	
	}

	
}
