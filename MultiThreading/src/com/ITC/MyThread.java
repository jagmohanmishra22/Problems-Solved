package com.ITC;

public class MyThread implements Runnable {
	public int sum = 0;

	
	
	public void run() {
		
		synchronized (this) {
			
			System.out.println("2. "+Thread.currentThread().getName()+" will execute and calculate sum");
			for(int i=1;i<=100;i++)
			{
				sum+=i;
			}
			System.out.println("3. "+"sum calculated by "+Thread.currentThread().getName() +"notify() will be called");
			this.notify();
		}
		
		
	}
}
