package jags.Strings;

import java.util.HashSet;
import java.util.Set;

public class AnagramPermutationsOfTwoStrings {

		// Function to find all sub-strings of string X that are
		// permutations of string Y
		public static void findAllAnagrams(String X, String Y)
		{
			// m and n stores size of string Y and X respectively
			int m, n;

		
			if ((m = Y.length()) > (n = X.length())) {
				return;
			}

			Set<Character> window = new HashSet<>();

			Set<Character> s2 = new HashSet<>();
			
			for (int i = 0; i < m; i++) {
				s2.add(Y.charAt(i));
			}
			int count=0;
			for (int i = 0; i < n; i++)
			{
				
				if (i < m) {
					window.add(X.charAt(i));
				}
				else
				{
					if (window.containsAll(s2)) {
						System.out.println("Anagram " + X.substring(i - m, i) +
									" present at index " + (i - m));
						count++;
					}
					if (window.contains(X.charAt(i - m))) {
						window.remove(X.charAt(i - m));
					}
					window.add(X.charAt(i));
				}
			}

			if (window.containsAll(s2)) {
				System.out.println("Anagram " + X.substring(n - m, n) +
										" present at index " + (n - m));
			}
			System.out.println(count);
		}

		public static void main(String[] args)
		{
			String X = "XYYZXZYZXXYZ";
			String Y = "XYZ";

			findAllAnagrams(X, Y);
		}
	}


