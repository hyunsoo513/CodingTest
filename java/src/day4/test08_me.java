package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test08_me {
	public static void main(String[] args) throws IOException {
		// test08_���� �� ���ϱ�
		// �־��� N���� ������ �ٸ� �� ���� ������ ǥ���Ǵ� ���� �ִٸ� �� ���� '���� ��'��� �Ѵ�.
		// N���� �� �� ���� ���� �� �� ������ ����Ͻÿ�.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���� ������ �Է��ϼ���: ");
		int N = Integer.parseInt(br.readLine());
		
		// N(�迭�� ������ ����)A[N]
		int A[] = new int[N];
		
		System.out.print("�迭�� �Է��ϼ���: ");
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// �迭 ���� for(N��ŭ �ݺ�) {A �迭�� ������ �����ϱ�} 
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		// A �迭 �����ϱ�
		Arrays.sort(A);
		
		// for(N��ŭ �ݺ��ϱ�){
		//		���� �ʱ�ȭ�ϱ�(ã���� �ϴ� �� k, ������ i, ������ j)
		/* 		while(i<j){
					if(A[i] + A[j] == ã���� �ϴ� ��)
						�� ������ i, j �� k�� �ƴ� �� �ᱣ���� �ݿ� �� while �� �����ϱ�
						�� ������ i, j �� k�� ���� �� ������ ���� �� ��� �����ϱ�
					else if (k > M) ������ i ����
					else ������ j ����}} */
		int count = 0;
		
		for (int k = 0; k < N; k++) {
			int i = 0;
			int j = N-1;
			int p = A[k];
			
			while (i<j) {
				if (A[i] + A[j] == p) {
					if (i!=k && j!=k) {
						count++;
						break;
					}
					else if (i==k) {i++;}
					else if (j==k) {j--;}
				}
				else if (A[i] + A[j] < p) i++;
				else j--;
			}
		}
		
		// ���� ���� ���� ����ϱ�
		System.out.print("���� ���� ����: " + count);
	}
}
