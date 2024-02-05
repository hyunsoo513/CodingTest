package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.StringTokenizer;

public class test10_me {
	public static void main(String[] args) throws IOException {
		// test10_최솟값 찾기
		// N개의 수 A1, A2, ..., An 과 L이 주어진다. 
		// Ai-l+1 ~ Ai 중 최솟값을 Di 라고 할 때 D에 저장된 수를 출력하는 프로그램을 작성하시오. 
		// 이때 i <= 0 인 Ai는 무시하고 D를 구해야 한다.
		
		// N(데이터 개수) L(최솟값을 구하는 범위)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("데이터 개수와 최솟값을 구하는 범위를 입력하세요(공백 구분): ");
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		
		// Deque<Node> mydeque(데이터를 담을 덱 자료구조)
		// Deque<Node> mydeque = new Deque;
		
		// 배열 선언하기
		long A[] = new long[N+1];
		
		System.out.print(N + "개의 수를 입력하세요(공백구분): ");
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			A[i] = Long.parseLong(st.nextToken());
		}
		
		long D[] = new long[N];
		
		// for (N만큼 반복)	{
		// 		now(현재 데이터 값)
		//		덱의 마지막 위치에서부터 now 보다 큰 값은 덱에서 제거하기
		// 		덱의 마지막 위치에 now 값 저장하기
		// 		덱의 1번째 위치에서부터 L의 범위를 벗어난 값(now index-L <= index)을 덱에서 제거하기
		//		덱의 1번째 데이터 출력하기 }
		
		
		// 덱에 저장할 노드 클래스 별도 생성하기
		// 노드 클래스에는 index(자신의 위치), value(자신의 값) 담기
		
	}
}
