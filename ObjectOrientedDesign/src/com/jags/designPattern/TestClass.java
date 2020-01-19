package com.jags.designPattern;

public class TestClass {

	public static void main(String[] args) {
		Singleton ob=new Singleton();
		ob.firt=50;
		
		if(Singleton.getInstance()==ob) {
			System.out.println("Matched");
		}else
		{
			Singleton ob2=new Singleton();
		
			ob2.firt=60;
			System.out.println(ob2.firt);
		}
		
	}

}
