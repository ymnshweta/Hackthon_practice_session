package com.aa;

public class LeapYear {
	
public void leap(int y) {
	if(y%100==0 && y%400==0 || y%100!=0 && y%4==0) {
		System.out.println("its a leap year");
	}else {
		System.out.println("not leap year");
	}
}
	public static void main(String[] args) {
		
		LeapYear ll=new LeapYear();
		ll.leap(2000);
		ll.leap(2002);
	}
	
}
