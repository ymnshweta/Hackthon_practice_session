package com.aa;

public class Pelindrom_practice {

	public static void main(String[] args) {
		String x="abcdbca";
		int i=0,j=x.length()-1;
		
		while(i<j) {
			if(x.charAt(i)!=x.charAt(j)) {
				System.out.println("not pelindrom");
				System.exit(0);
			}
			i++;
			j--;
		}
		
		System.out.println("Pelindrom");
	}
	
}
