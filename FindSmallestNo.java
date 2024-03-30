package com.arrays.java;

public class FindSmallestNo {

	public static void main(String[] args) {
		int [] a={3,8,1,3,6,7};
		int small=a[0];
		
		for(int i=0;i<a.length;i++){
			if(a[i]<small)small=a[i];
		}
		System.out.println(small);
	}

}
