package com.aa;

public class Hello {
public static void main(String[] args) {
	int n=153;
	int sum=0;
	int t=n;
	while(n>0) {
		int r=n%10;
		n=n/10;
		sum=sum+(r*r*r);
	}
	if(sum==t) {
		System.out.println("it's armstrong:"+t);
	}else {
		System.out.println("not armstrong:"+t);
	}
	}
}