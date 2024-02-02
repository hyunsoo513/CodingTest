package day2;

import java.util.Scanner;

public class test01 {
	public static void main(String[] args) {
	// test001
	// N개의 숫자가 공백 없이 써 있다. 이 숫자를 모두 합해 출력하는 프로그램을 작성하시오.
	// 1번째 줄에 숫자의 개수 N(1<=N<=100), 2번째 줄에 숫자 N개가 공백 없이 주어진다.
		Scanner sc = new Scanner(System.in);
		System.out.print("N의 값을 입력하세요: ");
		int N = sc.nextInt();
		
		System.out.print("숫자를 입력하세요: ");
		String sNum = sc.next();
		// 입력값을 String형 변수 sNum에 저장한 후 char[]형 변수로 변환
		char [] cNum = sNum.toCharArray();
		int sum = 0;
		
		for (int i = 0; i < cNum.length; i++) {
			sum += cNum[i] - '0';	// cNum[i]를 정수형으로 변환하면서 sum 에 더하여 누적
		}
		
		System.out.print("sum의 합 : " + sum);
	}
}
