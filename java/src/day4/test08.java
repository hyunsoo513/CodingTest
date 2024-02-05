package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test08 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// test08_좋은 수 구하기
		// 주어진 N개의 수에서 다른 두 수의 합으로 표현되는 수가 있다면 그 수를 '좋은 수'라고 한다.
		// N개의 수 중 좋은 수가 총 몇 개인지 출력하시오.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("수의 개수를 입력하세요: ");
		int N = Integer.parseInt(br.readLine());
		
		int Result = 0;
		long A[] = new long[N];
		
		System.out.print("배열을 입력하세요: ");
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			A[i] = Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(A);
		
		for (int k = 0; k < N; k++) {
			long find = A[k];
			int i = 0;
			int j = N-1;
			
			// 투 포인터 알고리즘
			while (i<j) {
				if (A[i] + A[j] == find) {
					// find 는 서로 다른 두 수의 합이어야 함을 체크
					if (i != k && j != k) {
						Result++;
						break;
					}
					else if (i==k) i++;
					else if (j==k) j--;
				}
				else if (A[i] + A[j] < find) i++;
				else j--;
			}
		}
		
		// 좋은 수의 개수 출력하기
		System.out.print("좋은 수의 개수: " + Result);
		br.close();
	}
}
