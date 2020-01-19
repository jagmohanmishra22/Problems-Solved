package com.threeThreads;

public class Printer  {

	boolean one=true;
	boolean two=false;
	boolean three =false;
	

	public synchronized void print1(int n) {
		while (!one)
			try {
				wait();
			} catch (Exception e) {
			}
		System.out.println(Thread.currentThread().getName() + " : " + n);
		two=true;
		one=false;
		three=false;
		notifyAll();

	}

	public synchronized void print2(int n) {
		while (!two )
			try {
				wait();
			} catch (Exception e) {
			}
		System.out.println(Thread.currentThread().getName() + " : " + n);
		two=false;
		one=false;
		three=true;
		notifyAll();

	}

	public synchronized void print3(int n) {
		while (!three)
			try {
				wait();
			} catch (Exception e) {
			}
		System.out.println(Thread.currentThread().getName() + " : " + n);
		two=false;
		one=true;
		three=false;
		notifyAll();

	}
}
