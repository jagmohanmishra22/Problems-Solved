package hashingProblems;

import java.util.List;
import java.util.*;

class RepeatedElemente_Set{
	 public static void main(String[] args) 
	 {
		 
		 int[] a = {1,1,2,2,3,4,3,4,8,9,10};
		 System.out.println(showDuplicates(a));
		
	}

	 private static List<Integer> showDuplicates(int[] aa) {
	     List<Integer> list = new ArrayList<>();
	     Set<Integer> set = new HashSet<>();  
	     for( int a  : aa) {
	          if(!set.contains(a)) 
	          {
	           set.add(a);
	          }
	          else
	          {
	        	 list.add(a);
	          }
	         }
	     System.out.println(set.size());
	  return list;
	 }}