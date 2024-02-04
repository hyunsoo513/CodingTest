package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test04 {

	public static void main(String[] args) throws IOException {
		/*
		test04_���� �� ���ϱ�2
		N �� N���� ���� N �� N ũ���� ǥ�� ä���� �ִ�. ǥ ���� �� �� (X1, Y1)���� (X2, Y2)������ ���� ���Ϸ� �Ѵ�. 
		X�� ��, Y�� ���� �ǹ��Ѵ�. ���� ��� N = 4 �̰�, ǥ�� ������ ���� ä���� ���� ���� ���캸��. 
		(2,2)���� (3,4)������ ���� ���ϸ� 3 + 4 + 5 + 4 + 5 + 6 = 27 �̰�, (4,4) ���� (4,4)������ ���� ���ϸ� 7�̴�.
		ǥ�� ä���� �ִ� ���� ���� ���ϴ� ������ �־����� �� �̸� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		*/
		
		// N(�迭 ũ��) M(���� ��) �����ϱ�
		System.out.print("�迭 ũ��� ���� ���� �Է��ϼ���(���� ����): ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int A[][] = new int[N+1][N+1];
		
		// for(N��ŭ �ݺ��ϱ�) { for(N��ŭ �ݺ��ϱ�){���� �迭 �����ϱ�}}
		for (int i = 1; i <= N; i++) {
			System.out.print(i + "���� �� N���� �Է��ϼ���(���� ����): ");
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int D[][] = new int[N+1][N+1];
		// for(N��ŭ �ݺ��ϱ�) { for(N��ŭ �ݺ��ϱ�)
		// {�� �迭 �����ϱ� D[i][j] = D[i][j-1] + D[i-1[j] - D[i-1][j-1] + A[i][j];}}
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + A[i][j];
//				System.out.println(D[i][j]);
			}
		}
		
		// for(M��ŭ �ݺ��ϱ�){���� ��� �� ����ϱ�
		// ��� = D[x2][y2] - D[x1-1][y2] - D[x2][y1-1] + D[x1-1][y1-1];}
		for (int i = 0; i < M; i++) {
			System.out.print("[x1][y1][x2][y2]�� ������ �Է��ϼ���(���� ����): ");
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			int result = D[x2][y2] - D[x1 - 1][y2] - D[x2][y1 - 1] + D[x1 - 1][y1 - 1];
			System.out.println("��� : " + result);
		}
	}

}
