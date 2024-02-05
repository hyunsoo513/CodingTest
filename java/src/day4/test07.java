package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test07 {

	public static void main(String[] args) throws IOException {
		// test07_�ָ��� ���
		/*
		�ָ��� ö�ⱺ�� �缺�ϱ� ���� ������Ʈ�� ������. �׷��� ��ö���忡�� ö�ⱺ�� ���� ������ ������ ����ߴ�.
		��ö������ �ָ��� ��ɿ� ������ ���� ������ �����ϴ� �� ������ ����� ������ ���� ������ ��ȣ�� �ְ�, 
		������ 2���� ��Ḧ ����� �� 2���� ����� ������ ��ȣ�� ���� M(1<=M<=10,000,000)�� �Ǹ� ������ ��������ٴ� ����� �߰��ߴ�. 
		��ö������ �ڽ��� ����� �ִ� ���� ������ �� ���� ���� �� �ִ��� �ñ�������. 
		��ö������ �ñ����� Ǯ�� �ֱ� ���� N(1<=N<=15,000)���� ���� M�� �־����� �� �� ���� ������ ���� �� �ִ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("����� ���� �Է��ϼ���: ");
		int N = Integer.parseInt(br.readLine());
		System.out.print("������ �Ǵ� ��ȣ�� �Է��ϼ���: ");
		int M = Integer.parseInt(br.readLine());
		
		int[] A = new int[N];
		
		System.out.print("��Ḧ �Է��ϼ���: ");
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(A);
		
		int count = 0;
		int i=0;
		int j=N-1;
		
		while (i<j) {		// �� ������ �̵� ��Ģ ���� �����͸� �̵��ϸ� ó��
			if ( A[i] + A[j] < M) i++;
			else if ( A[i] + A[j] > M) j--;
			else {
				count++;
				i++;
				j--;
			}
		}
		
		System.out.println("count: " + count);
		br.close();
	}

}
