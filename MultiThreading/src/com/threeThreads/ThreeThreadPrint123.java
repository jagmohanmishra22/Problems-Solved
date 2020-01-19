package com.threeThreads;

public class ThreeThreadPrint123 implements Runnable{

	int n;
	Printer p;
	
	public ThreeThreadPrint123(int n, Printer p) {
		super();
		this.n = n;
		this.p = p;
	}

	@Override
	public void run() {
		
		int max = 0;
		
		while (max < 10) {
			if(n%3==1)p.print1(n);
			else if(n%3==2)p.print2(n);
			else p.print3(n);
			max++;
		}
		
	}
	
	public static void main(String[] args) {
		
		Printer p=new Printer();
		Thread t1=new Thread(new ThreeThreadPrint123(1, p),"firstThread");
		Thread t2=new Thread(new ThreeThreadPrint123(2, p),"secondThread");
		Thread t3=new Thread(new ThreeThreadPrint123(3, p),"thirdThread");
		t1.start();
		t2.start();
		t3.start();
		
	}
	
	
	
	
}
