package day1;
import java.util.Scanner;
public class debuggingEx1 {
	public static void main(String[] args) {
		// TODO 배열에서 주어진 범위의 합을 구하는 프로그램을 구하시오
		Scanner sc = new Scanner(System.in);
		System.out.print("testcase 값을 입력하세요: ");
		int testcase = sc.nextInt();
		int answer = 0;
		long A[] = new long[100001];
		long S[] = new long[100001];
		
//		int A[] = new int[100001]; 값이 int형 범위를 넘어 음수로 출력되어 long 으로 선언
//		int S[] = new int[100001];
		
		for (int i = 1; i < 100000; i++) 
//		for (int i = 1; i < 10000; i++) 범위 오기입으로 10000 이후 S 값이 0 으로 출력
		{
			A[i] = (int) (Math.random() * Integer.MAX_VALUE);
			S[i] = S[i-1] + A[i];
		}
		for (int t = 1; t < testcase; t++) 
		{
			System.out.print("query 값을 입력하세요: ");
			int query = sc.nextInt();
			for (int i = 0; i < query; i++) 
			{
				System.out.print("start 값을 입력하세요: ");
				int start = sc.nextInt();
				System.out.print("end 값을 입력하세요: ");
				int end = sc.nextInt();
				answer += S[end] - S[start - 1];
				System.out.println(t + " " + answer);
//				System.out.println(testcase + " " + answer); 출력 변수 오기입
			}
		}
	}
}
