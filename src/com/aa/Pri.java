package com.aa;

public class Pri {
public static void main(String[] args) {
	int n=10;
	int cnt=0;
	
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			cnt++;
		}
	}
	if(cnt==2) {
		System.out.println("its prime number"+n);
	}else {
		System.out.println("it not a prie number"+n);
	}
}
}
