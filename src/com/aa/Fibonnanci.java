package com.aa;

public class Fibonnanci {

	public static void main(String[] args) {
		int n1=0,n2=1,n3;
		for(int i=2;i<=10;i++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}
}
