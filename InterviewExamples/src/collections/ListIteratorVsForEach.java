package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ListIteratorVsForEach {

	public static void main(String[] args) {
		 {
		        Collection<String> objCollection = new ArrayList<>();
		        objCollection.add("one");
		        objCollection.add("Two");
		        objCollection.add("Three");
		        objCollection.add("Four");
		        objCollection.add("Five");
		        
		        for (String value : objCollection) {
		            System.out.println("VALUE IN FOR EACH :  " + value);
		            objCollection.remove(value);
		        }
		        System.out.println("SIZE OF COLLECTION AFTER FOR EACH LOOP " + objCollection.size());
		        
		        Iterator<String> objIterator = objCollection.iterator();
		        while (objIterator.hasNext()) {
		            System.out.println("VALUE IN ITERATOR " + objIterator.next());
		             //objIterator).add("a");
		        }
		        System.out.println("SIZE OF COLLECTION AFTER ITERATION " + objCollection.size());
		    }
		}


	}


