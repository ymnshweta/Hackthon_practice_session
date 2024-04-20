package com.aa;

public class Reverse {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int rev[]=new int[a.length];
		
		for(int i=a.length-1,j=0;i>=0;i--,j++) {
			rev[j]=a[i];
		}
		for(int i=0;i<rev.length;i++) {
			System.out.println(rev[i]);
		}
	}
}
