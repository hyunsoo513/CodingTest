package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer {

	public static void main(String[] args) throws IOException {
		// 예외처리 필수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("내용을 입력하세요: ");
		String s = br.readLine();
		System.out.println("String: " + s);
		
		System.out.print("숫자를 입력하세요: ");
		// int 값 + enter 까지 입력받을 때
		int i = Integer.parseInt(br.readLine());
		System.out.println("Int1: " + i);
		
		System.out.print("숫자를 입력하세요: ");
		// int 형을 입력받을 때
		int j = br.read();
		System.out.println("Int2: " + j);
		
	}
}
