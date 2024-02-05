package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test08_me {
	public static void main(String[] args) throws IOException {
		// test08_좋은 수 구하기
		// 주어진 N개의 수에서 다른 두 수의 합으로 표현되는 수가 있다면 그 수를 '좋은 수'라고 한다.
		// N개의 수 중 좋은 수가 총 몇 개인지 출력하시오.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("수의 개수를 입력하세요: ");
		int N = Integer.parseInt(br.readLine());
		
		// N(배열의 데이터 개수)A[N]
		int A[] = new int[N];
		
		System.out.print("배열을 입력하세요: ");
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 배열 선언 for(N만큼 반복) {A 배열에 데이터 저장하기} 
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		// A 배열 정렬하기
		Arrays.sort(A);
		
		// for(N만큼 반복하기){
		//		변수 초기화하기(찾고자 하는 값 k, 포인터 i, 포인터 j)
		/* 		while(i<j){
					if(A[i] + A[j] == 찾고자 하는 값)
						두 포인터 i, j 가 k가 아닐 때 결괏값에 반영 및 while 문 종료하기
						두 포인터 i, j 가 k가 맞을 때 포인터 변경 및 계속 수행하기
					else if (k > M) 포인터 i 증가
					else 포인터 j 증가}} */
		int count = 0;
		
		for (int k = 0; k < N; k++) {
			int i = 0;
			int j = N-1;
			int p = A[k];
			
			while (i<j) {
				if (A[i] + A[j] == p) {
					if (i!=k && j!=k) {
						count++;
						break;
					}
					else if (i==k) {i++;}
					else if (j==k) {j--;}
				}
				else if (A[i] + A[j] < p) i++;
				else j--;
			}
		}
		
		// 좋은 수의 개수 출력하기
		System.out.print("좋은 수의 개수: " + count);
	}
}
