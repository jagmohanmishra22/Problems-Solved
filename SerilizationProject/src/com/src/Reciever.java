package com.src;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Reciever
{
	
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2=(Dog)ois.readObject();
		System.out.println(d2.i+"-------"+d2.j+"-------");
		System.out.println("Deserialization Done");

	}
	
}
