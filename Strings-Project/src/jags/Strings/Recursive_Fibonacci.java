package jags.Strings;

public class Recursive_Fibonacci {

	static int n;
	static int []fib=new int[n+1];
public static void main(String[] args) 
{
	fib(18);
}

static void fib(int n)
{
	
	fib[0]=0;fib[1]=1;
	for(int i=2;i<=n;i++)
	{
		if(fib[i]==0) {
		fib[i]=fib[i-1]+fib[i-2];
		System.out.println(fib[i]);
		
		
	}
		printRev(fib[n]);		
	}
}

private static void printRev(int fib) {
	
	if(n==0)return;
	int i=n;
	System.out.println(fib[i]);
	
	
}
}
