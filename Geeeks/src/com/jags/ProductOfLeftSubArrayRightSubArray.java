package com.jags;


//Program to find the product of left subarray and right subrray
//excluding element at "i"
//TC:O(n)


public class ProductOfLeftSubArrayRightSubArray {

	
	public  static void main(String[] args) {
		int []a= {2,5,3,6,8,1};
		int n=a.length;
		int []left=prodLeftSubArray(a,n);
		int []right=prodRightSubArray(a,n);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(i+"::"+left[i]*right[i]);
		}
		
		

	}

	private static int[] prodRightSubArray(int[] a, int n) {
		int []arr=a;
		int []right=new int [n];
		right[n-1]=1;
		
		for(int i=n-2;i>0;i--)
		{
			right[i]=arr[i+1]*right[i+1];
		}
		
		return right;
		
	}

	private static  int[] prodLeftSubArray(int[] a,int n) {
		
		int []arr=a;
		int []left=new int[n];
		left[0]=1;
		
		for(int i=1;i<n;i++) 
			left[i]=arr[i-1]*left[i-1];
		return left;

	}
	
	
	
}

