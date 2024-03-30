package com.arrays.java;

public class LinearSearch {//it search the index of an unsorted-array

	public static void main(String[] args) {
		int[]a={3,5,7,4,9,2};
		System.out.println(search(a,4));
		
	}
	
	private static int search(int[]a,int e){
		for(int i=0
				;i<a.length;i++){
			if(e==a[i])return i;
		}
		return -1;
	}

}
