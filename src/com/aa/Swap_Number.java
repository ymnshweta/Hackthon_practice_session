package com.aa;

public class Swap_Number {

	static void num(int m,int n) {
	
		int temp=m;
		m=n;
		n=temp;
		System.out.println(("Value of m: "+m+" Value of n:"+n));
	}
	
	public static void main(String[] args) {
		int m=10,n=9;
		num(m,n);
	}
	}

