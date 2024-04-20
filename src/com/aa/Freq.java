package com.aa;

public class Freq {
public static void main(String[] args) {
	String s="noonp";
	char ch='p';
	int freq=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==ch) {
			freq++;
		}
	}
	System.out.println(freq);

}
}
