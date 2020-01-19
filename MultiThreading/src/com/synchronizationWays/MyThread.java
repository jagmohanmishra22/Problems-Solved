package com.synchronizationWays;

public class MyThread implements Runnable {

	Integer x=5;
	
	@Override
	public void run() {
		
		synchronized(x) {
			
			for(int i=0;i<=5;i++)
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				System.out.println(i);
				
			}
			
		}
		
		
	}

}
