package com.ExplicitLock;

public class ExplicitLockPrinter {

	//private static Object lock=new Object();
	
	int i,  j;

	public void printValues(Integer i,int n) throws InterruptedException {
		synchronized(this) 
		{
			wait();
			System.out.println(Thread.currentThread().getName()+":"+i);
			notifyAll();
		}
	}

}
