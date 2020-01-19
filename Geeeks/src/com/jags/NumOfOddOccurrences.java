package com.jags;

import java.util.HashMap;
import java.util.Map;

/*Program to find odd number of occurrences of an ele in a given
 * array of size n
 * Flag method is used, where the indices in flag array are mapped to values in given array.
 * */
public class NumOfOddOccurrences {

	private static void findOddOccur(int[] a) {
		
		int arr[]=a;
		int size=a.length;
		Integer[] flag=new Integer[size];
		for(int i=0;i<size;i++) {		//Assign flag=0
			 flag[i]=0;
		 }
		
		for(int i=0;i<size;i++)
		{
			if(flag[arr[i]]==0){
				flag[arr[i]]=1;					//Odd--first occurrence
			}
							//even--second occurrence
		}
		
		for(int k=0;k<size;k++) {
			if(flag[arr[k]]==1)
				System.out.println(k);
		}
	}

	
	
	
	/**Need to submit it to Geeks for Geeks
	 * Make use of Hashmap method:::if("even".equals(hmap.putIfAbsent(arr[i], "even")))
	 * 
	 * @param a
	 */
	private static void findOddOccurUsingHashMap(int[] a) {
		int size=a.length;
		int [] arr=a;
		Map<Integer,String> hmap=new HashMap<>();
	
		for(int i=0;i<size;i++)
		{
			if(!hmap.containsKey(arr[i] ) )
			{
				hmap.put(arr[i], "odd");
				
			}
									
			else
			{
				if("even".equals(hmap.putIfAbsent(arr[i], "even")))
				hmap.put(arr[i], "odd");
				else hmap.put(arr[i], "even");
				
			}		
		}	
		String value="odd";
		for(Map.Entry<Integer, String> entry:hmap.entrySet() )
		{
			if(value.equals(entry.getValue()))
				System.out.println(entry.getKey());
		}
		
	}

	
	public static void main(String[] args) {
	
		int a[]= {2,6,6,6,5,2,1,4,4,5,3};
		//findOddOccur(a);
		
		findOddOccurUsingHashMap(a);///one test case failing
		//One More XOR approach is pending
		
	}

}
