package com.arrays.java;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[]a={2,3,6,9,1,8,9,3,55,1,76};
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	static void sort(int[]a){
		for(int i=0;i<a.length-1;i++){
			int index=i;
			for(int j=i+1;j<a.length;j++){
				if(a[j]<a[index])index=j;
			}
			if(i!=index)
			{
				int temp=a[i];
				a[i]=a[index];
				a[index]=temp;
			}
		}
	}

}
