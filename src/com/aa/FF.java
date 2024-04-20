package com.aa;

public class FF {
public static void main(String[] args) {
	String s="noon";
	char ch='o';
	int fre=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==ch) {
			fre++;
		}
	}
	System.out.println(fre);
}
}
