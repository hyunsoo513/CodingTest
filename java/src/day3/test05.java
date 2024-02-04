package day3;

import java.io.IOException;
import java.util.Scanner;

public class test05 {

	public static void main(String[] args) throws IOException{
		// test05_나머지 합 구하기
		// N개의 수 A1, A2, ..., An 이 주어졌을 때 연속된 부분의 합이 M 으로 나누어떨어지는 구간의 개수를 구하는 프로그램을 작성하시오.
		// 즉, Ai + ... + Aj(i<=j)의 합이 M으로 나누어떨어지는 (i,j) 쌍의 개수를 구하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수열과 나누어떨어져야 하는 수를 입력하세요(공백 구분): ");
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		long[] S = new long[N];
		long[] C = new long[M];
		
		long answer = 0;
		
		System.out.print("값을 입력하세요: ");
		S[0] = sc.nextInt();
		for (int i = 1; i < N; i++) {	// 수열 합 배열 만들기
			S[i] = S[i-1] + sc.nextInt();
		}
		
		for (int i = 0; i < N; i++) {	// 합 배열의 모든 값에 % 연산 수행하기
			int remainder = (int) (S[i] % M);
			// 0 ~ i 까지의 구간 합 자체가 0일 때 정답에 더하기
			if (remainder == 0) answer++;
			// 나머지가 같은 인덱스의 개수 카운팅하기
			C[remainder]++;
		}
		
		for (int i = 0; i < M; i++) {
			if (C[i] > 1) {
				// 나머지가 같은 인덱스 중 2개를 뽑는 경우의 수를 더하기
				answer = answer + (C[i] * (C[i] -1) / 2);
			}
		}
		System.out.println("결과값 : " + answer);
	}
}
