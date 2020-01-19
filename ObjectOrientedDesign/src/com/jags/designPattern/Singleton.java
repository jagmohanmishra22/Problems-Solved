package com.jags.designPattern;

import java.util.ArrayList;
import java.util.List;

public class Singleton {

	int firt;
	List <Singleton> list=new ArrayList<Singleton>();
	public static Singleton _instance=null;
	public Singleton() {
		
	}

	public static Singleton getInstance()
	{
		if(_instance==null) {
			_instance=new Singleton();
			_instance.firt=50;
			
		}return _instance;
	}
	

}
