package hashingProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoElementsWithSumK {

	public static void main(String[] args) {
		
		int []a= {5,2,3,7,1,4,12};
		int k=11;
		Map<Integer,Integer> hmap=new HashMap<>();
		List<Integer> keys=new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			if(hmap.containsValue(k-a[i])) {
				keys.add(a[i]);
				keys.add(k-a[i]);
				System.out.println("Yes");
			}
			else
				hmap.put(i, a[i]);
		}
		System.out.println(keys);
		
	}

}
