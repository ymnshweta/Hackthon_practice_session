package com.aa;

public class Coppy_Of_Array {

	public static void main(String[] args) 
	{ 
	int a[] = {1,6,8,23,46,8,3};
	int b[] = new int[a.length]; 
	for (int i = 0; i < a.length; i++) 
	b[i] = a[i];
	System.out.println("Contents of a[] "); 
	for (int i = 0; i < a.length; i++) 
	System.out.print(a[i] + " ");
	System.out.println("\n\nContents of b[] "); 
	for (int i = 0; i < b.length; i++) 
	System.out.print(b[i] + " "); 
	}
}
