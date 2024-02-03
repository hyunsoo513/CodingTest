package day2;

import java.io.IOException;
import java.util.Scanner;

public class test03_me {

	public static void main(String[] args) throws IOException {
		// test03_���� �� ���ϱ�
		// �� N���� �־����� �� i ��° ������ j ��° �������� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		
		// suNo(���� ����), quizNo(���� ����) �����ϱ�
		System.out.print("���� ������ ���� ������ �Է��ϼ���(���� ����): ");
		int suNo = sc.nextInt();
		int quizNo = sc.nextInt();
		
		long S[] = new long[suNo+1];
		long A[] = new long[suNo+1];
		System.out.print(suNo + "���� ���� �Է��ϼ���: ");
		
		// for(���� ������ŭ �ݺ��ϱ�) �� �迭 �����ϱ�(S[i]=S[i-1]+A[i])
		for (int i = 1; i <= suNo; i++) {
			A[i] = sc.nextInt();
			S[i] = S[i-1] + A[i];
//			System.out.println("�հ� : " + S[i]);
		}
		
		// for(���� ������ŭ �ݺ��ϱ�) {���� ���� �ޱ�(i~j) ���� �� ����ϱ�(S[j] - S[i-1])}
		for (int i = 0; i < quizNo; i++) {
			System.out.print("���� ������ ������ ������ �Է��ϼ���(���� ����): ");
			int start = sc.nextInt();
			int end = sc.nextInt();
			System.out.println("������ ��: " + (S[end] - S[start-1]));
//			System.out.println("end: " + S[end]);
//			System.out.println("start: " + S[start]);
		}
	}

}
