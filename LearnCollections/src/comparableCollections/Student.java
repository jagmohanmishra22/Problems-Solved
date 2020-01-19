package comparableCollections;

public class Student implements Comparable<Student> {

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + rollNo;
//		return result;
//	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollNo != other.rollNo)
			return false;
		return true;
	}




	int rollNo;
	String name;
	
	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}



	
/**
 * //First-->"this" is the current Object or the fixed object in an iteration 
 * and the other one is the all array elements
 * 
 */
	@Override								 
	public int compareTo(Student o) {
		int result=o.getName().compareTo(this.getName());//Reverse Order
		return result;
	}




	
	
}
