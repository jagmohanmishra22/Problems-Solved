package com.ExplicitLock;



public class ThreeThreadsPrinting1234soOn implements Runnable {

	ExplicitLockPrinter print;
	Integer n;
	
	public ThreeThreadsPrinting1234soOn(ExplicitLockPrinter p, int n) {
		this.print=p;
		this.n=n;
	}

	

	@Override
	public void run() {
		
		int i=0;
		while(i<20) {
				try {
					print.printValues(i,n);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			i++;
		}
		
	}
	public static void main(String[] args) {
		ExplicitLockPrinter print=new ExplicitLockPrinter();
		Thread t1=new Thread(new ThreeThreadsPrinting1234soOn(print,1));
		Thread t2=new Thread(new ThreeThreadsPrinting1234soOn(print,2));
		Thread t3=new Thread(new ThreeThreadsPrinting1234soOn(print,0));
		t1.start();
		t2.start();
		t3.start();
	}
	
	
}
