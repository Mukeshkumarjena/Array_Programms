package com.arrays.java;

public class PascalTriangle {
	
	public static void main(String[] args) {
		int n=6;
		int[][] a=new int[n][];
		for(int i=0;i<a.length;i++){
			a[i]=new int[i+1];
			for(int j=0;j<=i;j++){
				if(j==0 || i==j){
					a[i][j]=1;
				}
				else{
					a[i][j]=a[i-1][j-1]+a[i-1][j];
				}
			}
		}
	for(int i=0;i<n;i++){
		for(int j=n-i;j>1;j--){
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++){
			System.out.print(a[i][j]+" ");
	}
		System.out.println();
 }
}
}
