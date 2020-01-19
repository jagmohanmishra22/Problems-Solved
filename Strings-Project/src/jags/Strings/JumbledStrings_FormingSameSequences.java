package jags.Strings;
/**
 * Given two strings of equal length, you have to tell whether they both strings are identical.

Two strings S1 and S2 are said to be identical, if any of the permutation of string S1 is equal to the string S2. See Sample explanation for more details.

Input :

First line, contains an intger 'T' denoting no. of test cases.
Each test consists of a single line, containing two space separated strings S1 and S2 of equal length.
Output:

For each test case, if any of the permutation of string S1 is equal to the string S2 print YES else print NO.
Constraints:

1<= T <=100
1<= |S1| = |S2| <= 10^5
String is made up of lower case letters only.
Note : Use Hashing Concept Only . Try to do it in O(string length) .
 * 
 * 
 * 
 */




import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class JumbledStrings_FormingSameSequences {
    public static void main(String args[] ) throws Exception {
       
      
        Scanner s = new Scanner(System.in);

        int tc = s.nextInt(); 
        char c;
        int ascii=0;
        int ascii_2=0;
        s.nextLine();
        for(int i=0;i<tc;i++)
        {
        	Integer s1 = 0,s2=0;
        	String str=s.nextLine();
        	Boolean flag=false;
            String [] line=str.split("\\s");
            Set<Character> set1=new HashSet<>();
            Set<Character> set2=new HashSet<>();
            
           
            for(int j=0;j<line[0].length();j++)
            {
               c=line[0].charAt(j);
               set1.add(c);
               ascii=c;
               s1=s1+ascii;
                
            }
            for(int j=0;j<line[1].length();j++)
            {
                 c=line[1].charAt(j);
                 set2.add(c);
                 ascii_2=c;
                 s2=s2+ascii_2;
                 
                
            }
             if(line[0].length()==line[1].length() && s1.equals(s2))
             {
                  if(set1.containsAll(set2) && set2.containsAll(set1))
                    flag=true;
                    else 
                    	flag=false;
             }
             if(flag)
             System.out.println("YES");
             else System.out.println("NO");
             
        	}
        	s.close(); 
    }
}
