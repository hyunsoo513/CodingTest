package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test05_me {

	public static void main(String[] args) throws IOException {
		// test05_������ �� ���ϱ�
		// N���� �� A1, A2, ..., An �� �־����� �� ���ӵ� �κ��� ���� M ���� ����������� ������ ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// ��, Ai + ... + Aj(i<=j)�� ���� M���� ����������� (i,j) ���� ������ ���Ͻÿ�.
		
		System.out.print("������ ����������� �ϴ� ���� �Է��ϼ���(���� ����): ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// N �Է¹ޱ�(������ ����)
		int N = Integer.parseInt(st.nextToken());
		
		// M �Է¹ޱ�(����������� �ϴ� ��)
		int M = Integer.parseInt(st.nextToken());
		
		// �� �Է¹ޱ�
		int A[] = new int[N+1];
		System.out.print("���� �Է��ϼ���: ");
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		// S �����ϱ�(�� �迭)
		int S[] = new int[N+1];
		
		// C �����ϱ�(���� �������� �ε����� ī��Ʈ�ϴ� �迭)
		int C[] = new int[N+1];
		
		// for(i -> 1 ~ N){ S[i] = S[i-1] + A[i] // �� �迭 ����}
		for (int i = 1; i <= N; i++) {
			S[i] = S[i-1] + A[i];
		}
		
		// for(i -> 0 ~ N){ remainder = S[i] % M // �� �迭�� M���� ���� ������ �� 
		// 					if(remainder == 0) ������ 1 ������Ű��
		//					C[remainder]�� ���� 1 ������Ű��}
		int result = 0;
		for (int i = 0; i < N; i++) {
			C[i] = S[i] % M;
			if (C[i] == 0) {
				result += 1;
			}
			// for(i -> 0 ~ M) { C[i](i�� �������� �ε����� ����)���� 2������ �̴� ����� ���� ���信 ���ϱ�
			// 					 C[i]�� �� 2���� �̴� ����� �� ��� ���� C[i] * (C[i] -1)/2 }
			for (int j = 0; j < N-1; j++) {
				if (i>j && C[i]-C[j] == 0) {
					result +=1;
				}
			}
		}
		// �����(answer) ���
		System.out.println("answer ��: " + result);
	}
}
