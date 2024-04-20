package com.aa;

public class Swp_Examle {

	public void swap(int m,int n) {
		int temp=m;
		m=n;
		n=temp;
		System.out.println("Vaue of m: "+m+ " , Vale of n: "+n);
	}
	public static void main(String[] args) {
		Swp_Examle ss=new Swp_Examle();
		ss.swap(10,20);
	}
}
