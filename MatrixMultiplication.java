package com.arrays.java;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int[][]a={ {1,2,1},{4,5,1},{2,1,2} };
		int [][]b={ {5,2,1},{1,3,2},{2,1,4} };
		
		int [][]c=multiply(a,b);
		for(int[]n:c){
			for(int t:n){
				System.out.print(t+"\t");
			}
			System.out.println();
		}
	}
	
	static int[][] multiply(int[][]a,int[][]b){
		int len=a.length;
		int[][] c=new int[len][len];
		
		for(int i=0;i<len;i++){
			for(int j=0;j<len;j++){
				for(int k=0;k<len;k++){
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		return c;
	}
}
