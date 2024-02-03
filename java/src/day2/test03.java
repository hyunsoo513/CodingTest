package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test03 {

	public static void main(String[] args) throws IOException {
		// test03_���� �� ���ϱ�
		// �� N���� �־����� �� i ��° ������ j ��° �������� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.	
		
		// ���ڿ� ���� ���� �Է¹ޱ�
		System.out.print("���� ������ ���� ������ �Է��ϼ���(���� ����): ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTk = new StringTokenizer(br.readLine());
		
		// �Է¹��� �� ������ ���� �־��ֱ�
		int suNo = Integer.parseInt(stringTk.nextToken());
		int quizNo = Integer.parseInt(stringTk.nextToken());
		
		// �迭 �����ϱ�(���� ���ϴ� �������� S[i-1] �κ��� ó���ϱ� ���� ����+1)
		long[] S = new long[suNo + 1];
		
		// �� �Է¹ޱ�
		System.out.print(suNo + "���� ���� �Է��ϼ���(���� ����): ");
		stringTk = new StringTokenizer(br.readLine());
		for (int i = 1; i <= suNo; i++) {
			S[i] = S[i-1] + Integer.parseInt(stringTk.nextToken());
		}
		for (int q = 0; q < quizNo; q++) {
			// �հ踦 ���� ���� �Է¹ޱ�
			System.out.print("���� ������ ������ ������ �Է��ϼ���(���� ����): ");
			stringTk = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(stringTk.nextToken());
			int j = Integer.parseInt(stringTk.nextToken());
			
			// ���� �� ���
			System.out.println("������ ��: " + (S[j] - S[i-1]));
		}
	}
}
