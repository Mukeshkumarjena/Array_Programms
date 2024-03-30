package com.arrays.java;

public class BinarySearch {//search a char if the array is sorted(here for Ascending)

	public static void main(String[] args) {
		int[]a={2,3,5,7,9,11,14,16};
		System.out.println(search(a,5));
		
	}
	private static int search(int[]a,int e){
		int start=0;
		int end=a.length-1;
		while(start<=end){
			int mid=(start+end)/2;
			if(e==mid)return mid;
			if(e<a[mid])return mid-1;
			else start =mid+1;
		}
		return -1;
	}

}
