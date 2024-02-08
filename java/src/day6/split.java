package day6;

import java.util.StringTokenizer;

public class split {

	public static void main(String[] args) {
		String test = "this,is,,,split,test!";
		String arr[] = test.split(",");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
		
		System.out.println("");
		
		// StringTokenizer ¿Í ºñ±³
		StringTokenizer st = new StringTokenizer(test, ",");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
/*
arr[0] : this
arr[1] : is
arr[2] : 
arr[3] : 
arr[4] : split
arr[5] : test!

this
is
split
test!
 */