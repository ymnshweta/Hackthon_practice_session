package com.aa;

public class largestNumber {

	 int a[]= {1,2,3,4,5,6,7,8,9,10};
	public int largest() {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		largestNumber ll=new largestNumber();
		System.out.println("LargetsNumebr:"+ll.largest());
	}
}
