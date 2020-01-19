package jags.Strings;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class TestIteractor {
public static void main(String[] args) {
	
	
	Queue<String> q=new LinkedList<>();
	q.add("A");
	q.add("B");
	q.add("C");
	q.add("M");
	Iterator it=q.iterator();
	while(it.hasNext())
	{
		String s=(String) it.next();
		if(s.equals("C"))
			System.out.println(it.next());
	}
	
}
	
	
	
}
