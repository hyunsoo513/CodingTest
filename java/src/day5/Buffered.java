package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Buffered {

	public static void main(String[] args) throws IOException {
		// 예외처리 필수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		System.out.println("String: " + s);
		
		int i = Integer.parseInt(br.readLine());
		System.out.println("Int: " + i);
		
		String s2[] = br.readLine().split(" ");
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int arr[] = new int[st.countTokens()];
		int count = 0;
		while (st.hasMoreTokens()) {
			arr[count] = Integer.parseInt(st.nextToken());
			System.out.println(arr[count++]);
		}
	}

}
