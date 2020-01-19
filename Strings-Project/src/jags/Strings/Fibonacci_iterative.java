package jags.Strings;

public   class Fibonacci_iterative  {
	

	public static void main(String[] args) 
	{
		fibonacci(18);
		
	}

	public static  int fibonacci(int n)
	{
		int fib=1;
		int prevFib=1;
		int temp;
		
		for(int i=3;i<=n;i++)
		{
			temp=fib;
			fib=fib+prevFib;
			prevFib=temp;
			if(i<=n)
			System.out.println(i+"  "+fib);
			else System.out.println();
		}
	
		return fib;
		
	}

	
}
