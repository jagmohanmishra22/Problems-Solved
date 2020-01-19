package com.customised;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class LoginSerialization implements Serializable{
	String uname="Jagmohan";
	transient String pwd="Mishra";
	

	 private void writeObject(ObjectOutputStream os) throws Exception
	 {
		 os.defaultWriteObject();// write username to the file in Binary
		 String epwd=123+pwd;
		 os.writeObject(epwd);		//Work on Pwd
	 }
	 
	 private void readObject(ObjectInputStream is) throws Exception
	 {
		 is.defaultReadObject();			//read the uname
		 String epwd=(String) is.readObject();
		 pwd=epwd.substring(3);
	 }
	 
	 
}
