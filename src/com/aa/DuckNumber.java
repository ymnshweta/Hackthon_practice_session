package com.aa;

public class DuckNumber {
public static void main(String[] args) {
	int n=8540;
	int r,c=0;
	
	while(n!=0) {
		r=n%10;
		if(r==0) {
			++c;
		}
		n=n/10;
	}
	if(c>0) {
		System.out.println("Duck number");
	}else {
		System.out.println("Not Duck Number");
	}
}
}
