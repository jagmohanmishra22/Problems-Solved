package jags.Strings;

import java.io.IOException;

public class ExceptionsQuestionEdfora {

	public static void main(String[] args) {
		ExceptionsQuestionEdfora t=new ExceptionsQuestionEdfora();
		
		try {
			check();ccheck();
		}catch(Exception e) {
			System.out.println("catch block");
		}
	}

	private static void ccheck() throws Exception {
		try {
			throw new IOException();
			
		}
		catch(IOException e) {
			System.out.println("catch block--2");
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println("Catch block --3");
		}
		finally {
			System.out.println("finally");
		}
	}

	
	private static void check() throws Exception {
		try {
			throw new IOException();
			
		}
		finally {
			System.out.println("finally");
		}
	}
}
