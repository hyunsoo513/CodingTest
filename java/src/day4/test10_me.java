package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.StringTokenizer;

public class test10_me {
	public static void main(String[] args) throws IOException {
		// test10_�ּڰ� ã��
		// N���� �� A1, A2, ..., An �� L�� �־�����. 
		// Ai-l+1 ~ Ai �� �ּڰ��� Di ��� �� �� D�� ����� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
		// �̶� i <= 0 �� Ai�� �����ϰ� D�� ���ؾ� �Ѵ�.
		
		// N(������ ����) L(�ּڰ��� ���ϴ� ����)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������ ������ �ּڰ��� ���ϴ� ������ �Է��ϼ���(���� ����): ");
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		
		// Deque<Node> mydeque(�����͸� ���� �� �ڷᱸ��)
		// Deque<Node> mydeque = new Deque;
		
		// �迭 �����ϱ�
		long A[] = new long[N+1];
		
		System.out.print(N + "���� ���� �Է��ϼ���(���鱸��): ");
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			A[i] = Long.parseLong(st.nextToken());
		}
		
		long D[] = new long[N];
		
		// for (N��ŭ �ݺ�)	{
		// 		now(���� ������ ��)
		//		���� ������ ��ġ�������� now ���� ū ���� ������ �����ϱ�
		// 		���� ������ ��ġ�� now �� �����ϱ�
		// 		���� 1��° ��ġ�������� L�� ������ ��� ��(now index-L <= index)�� ������ �����ϱ�
		//		���� 1��° ������ ����ϱ� }
		
		
		// ���� ������ ��� Ŭ���� ���� �����ϱ�
		// ��� Ŭ�������� index(�ڽ��� ��ġ), value(�ڽ��� ��) ���
		
	}
}
