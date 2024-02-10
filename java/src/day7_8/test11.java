package day7_8;

import java.util.Scanner;
import java.util.Stack;

public class test11 {

	public static void main(String[] args) {
		// test11_코드 구현하기
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		Stack<Integer> stack = new Stack<>();
		
		StringBuffer br = new StringBuffer();
		int num = 1;			// 오름차순 수
		boolean result = true;
		for (int i = 0; i < A.length; i++) {
			int su = A[i];		// 현재 수열의 수
			if (su >= num) {	// 현재 수열 값 >= 오름차순 자연수: 값이 같아질 때 까지 push() 수행
				while (su >= num) {	// push()
					stack.push(num++);
					br.append("+\n");
				}
				stack.pop();
				br.append("-\n");
			}
			else {				// 현재 수열 값 < 오름차순 자연수: pop()을 수행해 수열 원소를 꺼냄
				int n = stack.pop();
				// 스택의 가장 위의 수가 만들어야 하는 수열의 수보다 크면 수열을 출력할 수 없음
				if (n > su) {
					System.out.println("NO");
					result = false;
					break;
				}
				else {
					br.append("-\n");
				}
			}
		}
		if (result) System.out.println(br.toString());
	}

}
