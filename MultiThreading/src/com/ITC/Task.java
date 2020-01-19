package com.ITC;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread r=new MyThread();
		Thread t=new Thread(r);
		
		t.start();
		//t.join();
		//t.sleep(1);
		
		System.out.println("1. "+Thread.currentThread().getName()+" will call wait()");
		
		synchronized(t)
		{
			t.wait();
			System.out.println("4. Sum Calculated & Control is with "+Thread.currentThread().getName()+"--> "+r.sum);
				
		}
		
	}


}
