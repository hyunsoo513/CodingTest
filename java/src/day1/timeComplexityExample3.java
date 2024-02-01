package day1;

public class timeComplexityExample3 {
	public static void main(String[] args) {
		// 연산 횟수가 N² 인 경우
		int N = 100;
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.println("연산 횟수: " + cnt++);
			}
		}
	}
}
