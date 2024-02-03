package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test03 {

	public static void main(String[] args) throws IOException {
		// test03_구간 합 구하기
		// 수 N개가 주어졌을 때 i 번째 수에서 j 번째 수까지의 합을 구하는 프로그램을 작성하시오.	
		
		// 숫자와 질의 개수 입력받기
		System.out.print("숫자 개수와 질의 개수를 입력하세요(공백 구분): ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTk = new StringTokenizer(br.readLine());
		
		// 입력받은 값 변수에 각각 넣어주기
		int suNo = Integer.parseInt(stringTk.nextToken());
		int quizNo = Integer.parseInt(stringTk.nextToken());
		
		// 배열 생성하기(합을 구하는 과정에서 S[i-1] 부분을 처리하기 위해 길이+1)
		long[] S = new long[suNo + 1];
		
		// 값 입력받기
		System.out.print(suNo + "개의 값을 입력하세요(공백 구분): ");
		stringTk = new StringTokenizer(br.readLine());
		for (int i = 1; i <= suNo; i++) {
			S[i] = S[i-1] + Integer.parseInt(stringTk.nextToken());
		}
		for (int q = 0; q < quizNo; q++) {
			// 합계를 구할 구간 입력받기
			System.out.print("시작 구간과 마지막 구간을 입력하세요(공백 구분): ");
			stringTk = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(stringTk.nextToken());
			int j = Integer.parseInt(stringTk.nextToken());
			
			// 구간 합 출력
			System.out.println("구간의 합: " + (S[j] - S[i-1]));
		}
	}
}
