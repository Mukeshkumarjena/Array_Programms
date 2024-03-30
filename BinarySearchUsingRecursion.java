package com.arrays.java;

public class BinarySearchUsingRecursion {

	public static void main(String[] args) {
		int[]a={1,2,5,7,9,10,12};
		System.out.println(search(a,10,0,a.length-1));
	}
	static int search(int[] a,int e,int start,int end){
		if(start>end)return -1;
		int mid=(start+end)/2;
		if(e==a[mid])return mid;
		else if(e<a[mid])return search(a,e,start,mid-1);
		else return search(a,e,mid+1,end);
	}

}
