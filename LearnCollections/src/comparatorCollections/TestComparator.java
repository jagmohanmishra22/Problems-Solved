package comparatorCollections;

import java.util.Arrays;
import java.util.Comparator;

public class TestComparator {

	
	public static void main(String[] args) {
		
		Employee[]emp=createEmployee();
		Arrays.sort(emp, idComparator);	
		Arrays.stream(emp).forEach(i->System.out.println(i));
		System.out.println();
		Arrays.sort(emp,nameComparator);
		Arrays.stream(emp).forEach(i->System.out.println(i));
	}

	private static Employee[] createEmployee() {
		
	Employee []e=new Employee[6];
	e[0]=new Employee(5, "Jhook");
	e[1]=new Employee(5, "Cook");
	e[2]=new Employee(2, "Ben");
	e[3]=new Employee(15, "Broad");
	e[4]=new Employee(7, "Kim");
	e[5]=new Employee(4, "Kim");
	return e;
	
	}
	public static Comparator<Employee> idComparator=new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			
			return o1.getId()-o2.getId();
		}

	};
	
	public static Comparator <Employee> nameComparator=new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			
			return o1.getName().compareTo(o2.getName());
		}
	};
	
	
	
}
