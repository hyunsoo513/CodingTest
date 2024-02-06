package day5;

import java.util.Scanner;

public class scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정수, 소수, String 값으로 읽을 수 있음
		System.out.print("int형, 숫자를 입력하세요: ");
		int num1 = sc.nextInt();
		
		System.out.print("long형, 숫자를 입력하세요: ");
		long num2 = sc.nextLong();
		
		System.out.print("short형, 숫자를 입력하세요: ");
		short num3 = sc.nextShort();
		
		System.out.println("입력된 숫자1: " + num1);
		System.out.println("입력된 숫자2: " + num2);
		System.out.println("입력된 숫자3: " + num3);
		
	}
}