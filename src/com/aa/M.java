package com.aa;

import java.util.Arrays;

public class M {
public static void main(String[] args) {
	int[] a= {1,3,4};
	int[] b= {5,6,7};
	int ci=0;
	int[] c= new int[a.length + b.length];
	
	
	for(int i=0;i<a.length;i++) { 
		c[ci]=a[i];
         ci++;
	}
	for(int i=0;i<b.length;i++) {
		c[ci]=b[i];
	ci++;
	}

	for(int i=0;i<b.length;i++) {
		System.out.println(Arrays.toString(c));
	}
	
}
}
