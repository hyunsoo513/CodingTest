package day2;

import java.io.IOException;
import java.util.Scanner;

public class test03_me {

	public static void main(String[] args) throws IOException {
		// test03_구간 합 구하기
		// 수 N개가 주어졌을 때 i 번째 수에서 j 번째 수까지의 합을 구하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		
		// suNo(숫자 개수), quizNo(질의 개수) 저장하기
		System.out.print("숫자 개수와 질의 개수를 입력하세요(공백 구분): ");
		int suNo = sc.nextInt();
		int quizNo = sc.nextInt();
		
		long S[] = new long[suNo+1];
		long A[] = new long[suNo+1];
		System.out.print(suNo + "개의 값을 입력하세요: ");
		
		// for(숫자 개수만큼 반복하기) 합 배열 생성하기(S[i]=S[i-1]+A[i])
		for (int i = 1; i <= suNo; i++) {
			A[i] = sc.nextInt();
			S[i] = S[i-1] + A[i];
//			System.out.println("합계 : " + S[i]);
		}
		
		// for(질의 개수만큼 반복하기) {질의 범위 받기(i~j) 구간 합 출력하기(S[j] - S[i-1])}
		for (int i = 0; i < quizNo; i++) {
			System.out.print("시작 구간과 마지막 구간을 입력하세요(공백 구분): ");
			int start = sc.nextInt();
			int end = sc.nextInt();
			System.out.println("구간의 합: " + (S[end] - S[start-1]));
//			System.out.println("end: " + S[end]);
//			System.out.println("start: " + S[start]);
		}
	}

}
