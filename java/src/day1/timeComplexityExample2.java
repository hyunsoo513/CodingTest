package day1;

public class timeComplexityExample2 {
	public static void main(String[] args) {
		// ���� Ƚ���� 3N�� ���
		int N = 100000;
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			System.out.println("���� Ƚ��: " + cnt++);
		}
		for (int i = 0; i < N; i++) {
			System.out.println("���� Ƚ��: " + cnt++);
		}
		for (int i = 0; i < N; i++) {
			System.out.println("���� Ƚ��: " + cnt++);
		}
	}

}
