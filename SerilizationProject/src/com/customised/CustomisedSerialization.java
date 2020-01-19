package com.customised;
import java.io.*;

public class CustomisedSerialization
{
	public static void main(String[] args) throws Exception 
	{
		LoginSerialization ls=new LoginSerialization();  //Object of the LoginSerialization class to access the Uname and pwd instance variables
		System.out.println(ls.uname+"------>"+ls.pwd);
		
		FileOutputStream fos= new FileOutputStream("cust.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(ls);
		
		FileInputStream fis= new FileInputStream("cust.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		LoginSerialization ls2=(LoginSerialization)ois.readObject();
		System.out.println(ls2.uname+"----->"+ls2.pwd);
		
	}
	
	
	
	
}
