package oopsTrickyInterview;

//Method is called from specific constructor--->generic
//Just like exceptions:If most specific is possible then that constructor is executed.


public class PassingNullWhileOverloading {

	String name;
	Object name1;
	
	public PassingNullWhileOverloading(String name) {
		this.name = name;
		System.out.println("String Constructor exectuted");
		
	}
	
	public PassingNullWhileOverloading( Object name1) {
		this.name1 = name1;
		System.out.println("Object Constructor exectuted");
	}
	



	public static void main(String[] args) {
		PassingNullWhileOverloading p=new PassingNullWhileOverloading(null);
		System.out.println("Done");

	}

}
