package com.aa;

public class Vowels {

	public void vv( char y) {
		if(y=='a' ||y=='e' ||y=='i' || y=='o' || y=='u' ) {
			System.out.println("its its vowel");
		}else {
			System.out.println("Its constant");
		}
	}
	public static void main(String[] args) {
		
		Vowels aa=new Vowels();
		
		aa.vv('i');
		
		aa.vv('z');
		
	}
}