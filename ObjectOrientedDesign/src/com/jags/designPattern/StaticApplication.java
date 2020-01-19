package com.jags.designPattern;

public class StaticApplication {

	static int a=10;
	public static void main(String args[])
	{
		find(a);
		a=30;
		System.out.println(a);
	}
	static int find(int a)
	{
		a=30;
		//System.out.println(a);
		return a;
	
	}
}
