package comparableCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestComparable {

	public static void main(String[] args) {
		
		
		handleStudent();
		handleIntegers();
		
	}

	

	private static void handleIntegers() {
		
		int []a= {1,-1,5,88,4,2,51,-7,61,15,5};
		Arrays.sort(a);
		basicSorting(a);
		sortUsingTreeSet(a);
		
	}



	private static void sortUsingTreeSet(int[] a) {
		Set descSet=new TreeSet(Collections.reverseOrder());//Descending Order
		Set ascSet=new TreeSet();							//Ascending Order
		
		Arrays.stream(a).forEach(i->ascSet.add(i));
		Arrays.stream(a).forEach(i->descSet.add(i));
		
		
		System.out.println("TreeSet Implementation: Descending Order");
		System.out.println(descSet);
		
		System.out.println("TreeSet Implementation: Ascending Order");
		System.out.println(ascSet);
		
		 
	}



	private static void basicSorting(int[] a) {
		System.out.println("Printing Numbers");
		Arrays.stream(a).forEach(i->System.out.println(i));
		
	}



	private static  void handleStudent() {
		List<Student> studList=createStudentObjects();
		Collections.sort(studList);
		System.out.println("Printing Student");
		System.out.println(studList);
	}

	

	private static List<Student> createStudentObjects() {

		List <Student> list=new ArrayList<>();
		Student s1=new Student(4,"Z");
		Student s2=new Student(1,"X");
		Student s3=new Student(7,"D");
		Student s4=new Student(0,"A");
		list.add(s1);list.add(s2);list.add(s3);list.add(s4);
		return list;
		
	}

	
	
}
