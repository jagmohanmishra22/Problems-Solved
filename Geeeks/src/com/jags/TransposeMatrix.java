package com.jags;



public class TransposeMatrix {
 public static void main(String[] args) {
	
	int [][]a= {{1,3,5,0},{1,5,78,0},{5,7,6,5},{4,2,0,5}};
	
	
	int length=a.length;
	int [][]b=new int[length][length];
	
	for(int i=0;i<length;i++)
	{
		System.out.println();
		for(int j=0;j<a.length;j++) {
			System.out.print(a[i][j]+"\t");
		}
	}
	
	System.out.println();
	System.out.println("Output");
	for(int i=0;i<length;i++)
	{
		
		for(int j=0;j<a.length;j++) {
			b[i][j]=a[j][i];
		}
	}
	
	for(int i=0;i<length;i++)
	{
		System.out.println();
		for(int j=0;j<a.length;j++) {
			System.out.print(b[i][j]+"\t");
		}
	}
	 
}

}
	
	
