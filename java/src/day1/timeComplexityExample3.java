package day1;

public class timeComplexityExample3 {
	public static void main(String[] args) {
		// ���� Ƚ���� N�� �� ���
		int N = 100;
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.println("���� Ƚ��: " + cnt++);
			}
		}
	}
}
