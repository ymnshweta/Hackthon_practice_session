package com.aa;

public class FrequencyOfCharacter {

	
		public static void main(String[] args) 
		 { 
		 String s = "boon";
		 char ch='o';
		 int freq = 0; 
		 for(int i = 0; i <s.length(); i++) 
		 { 
		 if(s.charAt(i) == ch) 
		 freq++;
		 } 
		 System.out.println("Frequency of given character is "+freq); 
		 }

	}


