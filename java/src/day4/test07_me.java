package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test07_me {

	public static void main(String[] args) throws IOException {
		// test07_�ָ��� ���
		/*
		�ָ��� ö�ⱺ�� �缺�ϱ� ���� ������Ʈ�� ������. �׷��� ��ö���忡�� ö�ⱺ�� ���� ������ ������ ����ߴ�.
		��ö������ �ָ��� ��ɿ� ������ ���� ������ �����ϴ� �� ������ ����� ������ ���� ������ ��ȣ�� �ְ�, 
		������ 2���� ��Ḧ ����� �� 2���� ����� ������ ��ȣ�� ���� M(1<=M<=10,000,000)�� �Ǹ� ������ ��������ٴ� ����� �߰��ߴ�. 
		��ö������ �ڽ��� ����� �ִ� ���� ������ �� ���� ���� �� �ִ��� �ñ�������. 
		��ö������ �ñ����� Ǯ�� �ֱ� ���� N(1<=N<=15,000)���� ���� M�� �־����� �� �� ���� ������ ���� �� �ִ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		*/
		
		// N(����� ����), M(������ �Ǵ� ��ȣ) �����ϱ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("����� ���� �Է��ϼ���: ");
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		System.out.print("������ �Ǵ� ��ȣ�� �Է��ϼ���: ");
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		
		
		// for(N��ŭ �ݺ�) ��� �迭 �����ϱ�
		long A[] = new long[N+1];
		
		System.out.print("��Ḧ �Է��ϼ���: ");
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(A);
		
		// ��� �迭 �����ϱ�
		// while(i<j) {
		//		if(��� �� < M) ���� ��ȣ ��Ḧ �� ĭ ���� �����ϱ�
		//		else if (��� �� > M) ū ��ȣ ��Ḧ �� ĭ �Ʒ��� �����ϱ�
		//		else ����� �� ����, ���� index ���� �����ϱ� }
		int i=0;
		int j=N;
		int count = 0;
		
		while (i<j) {
			if ((A[i]+A[j]) < M) i++;
			else if ((A[i]+A[j]) > M) j--;
			else {
				count++;
				i++;
				j--;
			}
		}
		
		// count ����ϱ�
		System.out.println("count: " + count);
	}

}
