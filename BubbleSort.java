package com.arrays.java;

public class BubbleSort {

	public static void main(String[] args) {
		int[]a={2,4,1,6,9,2,6,4,9};
		sort(a);
		for(int n:a){
			System.out.print(n+" ");
		}
	}
	static void sort(int[]a){
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
}
