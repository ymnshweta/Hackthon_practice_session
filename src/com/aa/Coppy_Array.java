package com.aa;

public class Coppy_Array {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int b[]=new int[a.length];
		
		for(int i=0;i<a.length;i++) 
			b[i]=a[i];
		
		
		System.out.println("Content of a[]");
		for(int i=0;i<a.length;i++) 
			System.out.println(a[i]+"   ");
		
		System.out.println("\nContent of b[]");
		for(int i=0;i<b.length;i++) 
			System.out.println(b[i]+"  ");
		}
	}

