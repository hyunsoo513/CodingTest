package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test04 {

	public static void main(String[] args) throws IOException {
		/*
		test04_구간 합 구하기2
		N Ⅹ N개의 수가 N Ⅹ N 크기의 표에 채워져 있다. 표 안의 수 중 (X1, Y1)에서 (X2, Y2)까지의 합을 구하려 한다. 
		X는 행, Y는 열을 의미한다. 예를 들어 N = 4 이고, 표가 다음과 같이 채워져 있을 때를 살펴보자. 
		(2,2)에서 (3,4)까지의 합을 구하면 3 + 4 + 5 + 4 + 5 + 6 = 27 이고, (4,4) 에서 (4,4)까지의 합을 구하면 7이다.
		표에 채워져 있는 수와 합을 구하는 연산이 주어졌을 때 이를 처리하는 프로그램을 작성하시오.
		*/
		
		// N(배열 크기) M(질의 수) 저장하기
		System.out.print("배열 크기와 질의 수를 입력하세요(공백 구분): ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int A[][] = new int[N+1][N+1];
		
		// for(N만큼 반복하기) { for(N만큼 반복하기){원본 배열 저장하기}}
		for (int i = 1; i <= N; i++) {
			System.out.print(i + "행의 값 N개를 입력하세요(공백 구분): ");
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int D[][] = new int[N+1][N+1];
		// for(N만큼 반복하기) { for(N만큼 반복하기)
		// {합 배열 저장하기 D[i][j] = D[i][j-1] + D[i-1[j] - D[i-1][j-1] + A[i][j];}}
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + A[i][j];
//				System.out.println(D[i][j]);
			}
		}
		
		// for(M만큼 반복하기){질의 계산 및 출력하기
		// 결과 = D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1];}
		for (int i = 0; i < M; i++) {
			System.out.print("[x1][y1][x2][y2]의 구간을 입력하세요(공백 구분): ");
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			int result = D[x2][y2] - D[x1 - 1][y2] - D[x2][y1 - 1] + D[x1 - 1][y1 - 1];
			System.out.println("결과 : " + result);
		}
	}

}
