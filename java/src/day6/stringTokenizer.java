package day6;

import java.util.StringTokenizer;

public class stringTokenizer {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("this is first test!");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
/*
this
is
first
test!
 */