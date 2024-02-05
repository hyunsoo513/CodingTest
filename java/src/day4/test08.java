package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test08 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// test08_���� �� ���ϱ�
		// �־��� N���� ������ �ٸ� �� ���� ������ ǥ���Ǵ� ���� �ִٸ� �� ���� '���� ��'��� �Ѵ�.
		// N���� �� �� ���� ���� �� �� ������ ����Ͻÿ�.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���� ������ �Է��ϼ���: ");
		int N = Integer.parseInt(br.readLine());
		
		int Result = 0;
		long A[] = new long[N];
		
		System.out.print("�迭�� �Է��ϼ���: ");
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			A[i] = Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(A);
		
		for (int k = 0; k < N; k++) {
			long find = A[k];
			int i = 0;
			int j = N-1;
			
			// �� ������ �˰���
			while (i<j) {
				if (A[i] + A[j] == find) {
					// find �� ���� �ٸ� �� ���� ���̾�� ���� üũ
					if (i != k && j != k) {
						Result++;
						break;
					}
					else if (i==k) i++;
					else if (j==k) j--;
				}
				else if (A[i] + A[j] < find) i++;
				else j--;
			}
		}
		
		// ���� ���� ���� ����ϱ�
		System.out.print("���� ���� ����: " + Result);
		br.close();
	}
}
