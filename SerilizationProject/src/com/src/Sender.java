package com.src;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Sender {

/**
 * @param args
 * @throws Exception
 */
public static void main(String[] args) throws Exception {
	
Dog d1=new Dog();

FileOutputStream fos= new FileOutputStream("abc.ser");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(d1);

System.out.println("Serialization Done");


}

}
	
	

