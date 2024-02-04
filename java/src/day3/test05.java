package day3;

import java.io.IOException;
import java.util.Scanner;

public class test05 {

	public static void main(String[] args) throws IOException{
		// test05_������ �� ���ϱ�
		// N���� �� A1, A2, ..., An �� �־����� �� ���ӵ� �κ��� ���� M ���� ����������� ������ ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// ��, Ai + ... + Aj(i<=j)�� ���� M���� ����������� (i,j) ���� ������ ���Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ����������� �ϴ� ���� �Է��ϼ���(���� ����): ");
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		long[] S = new long[N];
		long[] C = new long[M];
		
		long answer = 0;
		
		System.out.print("���� �Է��ϼ���: ");
		S[0] = sc.nextInt();
		for (int i = 1; i < N; i++) {	// ���� �� �迭 �����
			S[i] = S[i-1] + sc.nextInt();
		}
		
		for (int i = 0; i < N; i++) {	// �� �迭�� ��� ���� % ���� �����ϱ�
			int remainder = (int) (S[i] % M);
			// 0 ~ i ������ ���� �� ��ü�� 0�� �� ���信 ���ϱ�
			if (remainder == 0) answer++;
			// �������� ���� �ε����� ���� ī�����ϱ�
			C[remainder]++;
		}
		
		for (int i = 0; i < M; i++) {
			if (C[i] > 1) {
				// �������� ���� �ε��� �� 2���� �̴� ����� ���� ���ϱ�
				answer = answer + (C[i] * (C[i] -1) / 2);
			}
		}
		System.out.println("����� : " + answer);
	}
}
