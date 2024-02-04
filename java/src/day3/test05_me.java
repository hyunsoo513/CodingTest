package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test05_me {

	public static void main(String[] args) throws IOException {
		// test05_나머지 합 구하기
		// N개의 수 A1, A2, ..., An 이 주어졌을 때 연속된 부분의 합이 M 으로 나누어떨어지는 구간의 개수를 구하는 프로그램을 작성하시오.
		// 즉, Ai + ... + Aj(i<=j)의 합이 M으로 나누어떨어지는 (i,j) 쌍의 개수를 구하시오.
		
		System.out.print("수열과 나누어떨어져야 하는 수를 입력하세요(공백 구분): ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// N 입력받기(수열의 개수)
		int N = Integer.parseInt(st.nextToken());
		
		// M 입력받기(나누어떨어져야 하는 수)
		int M = Integer.parseInt(st.nextToken());
		
		// 값 입력받기
		int A[] = new int[N+1];
		System.out.print("값을 입력하세요: ");
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		// S 선언하기(합 배열)
		int S[] = new int[N+1];
		
		// C 선언하기(같은 나머지의 인덱스를 카운트하는 배열)
		int C[] = new int[N+1];
		
		// for(i -> 1 ~ N){ S[i] = S[i-1] + A[i] // 합 배열 저장}
		for (int i = 1; i <= N; i++) {
			S[i] = S[i-1] + A[i];
		}
		
		// for(i -> 0 ~ N){ remainder = S[i] % M // 합 배열을 M으로 나눈 나머지 값 
		// 					if(remainder == 0) 정답을 1 증가시키기
		//					C[remainder]의 값을 1 증가시키기}
		int result = 0;
		for (int i = 0; i < N; i++) {
			C[i] = S[i] % M;
			if (C[i] == 0) {
				result += 1;
			}
			// for(i -> 0 ~ M) { C[i](i가 나머지인 인덱스의 개수)에서 2가지를 뽑는 경우의 수를 정답에 더하기
			// 					 C[i]개 중 2개를 뽑는 경우의 수 계산 공식 C[i] * (C[i] -1)/2 }
			for (int j = 0; j < N-1; j++) {
				if (i>j && C[i]-C[j] == 0) {
					result +=1;
				}
			}
		}
		// 결과값(answer) 출력
		System.out.println("answer 값: " + result);
	}
}
