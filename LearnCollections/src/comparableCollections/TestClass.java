package comparableCollections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestClass {

	public static void main(String[] args) {
		Set<Student> st=new HashSet<>();
		st.add( new Student(23, "FirstStud"));
		st.add(new Student(23, "FirstStud"));
		System.out.println(st.size());
		System.out.println(st.hashCode());
	}

}
