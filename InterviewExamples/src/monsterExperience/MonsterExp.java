package monsterExperience;

//To Do
//1-Object Class Methods:Equals,hashCode etc
//MultiThreading--Even Odd :Print Sorted using synchronised.
//Triggers && Views ::Need to Study
//Complete MultiThreading:Durga
//finalize(): Destructor && it's application
//Errors in Java



/**
 * Using equals method to compare Objects:
 * It returns  false, by DEFAULT
 * 
 * 
 * */


public class MonsterExp {

	Integer a;
	String b;
	
	
	public MonsterExp(int a, String b) {
		this.a=a;
		this.b=b;
	}
	
	public static void main(String[] args)
	{		
		MonsterExp m1=new MonsterExp(10,"Ram");
		MonsterExp m3=new MonsterExp(10,"Ram");
		
		Monster2 m2=new Monster2(10,"Ram");
		System.out.println("Same Content but Different Types--"+m1.equals(m2));
		
		System.out.println("Same Content & same types but different Objects--"+m1.equals(m3));
		
		
		
//		String s="1 5";
//		String []s1=s.split(" ");
//		int n=Integer.parseInt(s1[0].trim());
//		int n1=Integer.parseInt(s1[1]);
//		System.out.println(n+"   "+n1);
		
	}

}
