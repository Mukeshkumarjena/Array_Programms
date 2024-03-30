package com.arrays.java;

public class SpiralParttern {

	public static void main(String[] args) {
		int[][]a=spiral(5);
		for(int[] b:a){
			for(int t:b){
				System.out.print(t+"\t");
			}
			System.out.println();
		}	
	}	
	static int[][] spiral(int size){
		int [][] a= new int[size][size];
		int r=0,c=-1;
		char dir='r';
		for(int i=1;i<=size*size;i++){
			switch(dir){
			case 'r':c++; a[r][c]=i;
					 if(c==size-1-r) dir='d';
					 break;
			case 'd':r++; a[r][c]=i;
					 if(r==c) dir='l';
					 break;
			case 'l':c--; a[r][c]=i;
					 if(r==size-1-c) dir='u';
					 break;
			case 'u':r--; a[r][c]=i;
					 if(r==c+1) dir='r';
			
			}
		}
		return a;	
	}

}
