package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test09 {
	static int checkArr[];
	static int myArr[];
	static int checkSecret;
	
	public static void main(String[] args) throws IOException {
		// test09_DNA ��й�ȣ
		/* ��� ���ڿ��� �̿��� ��� ���� �����ϴ� ��ȣ�� DNA ���ڿ��� �˰� �ƴ�. 
		DNA ���ڿ��� ��� ���ڿ��� �����ϴ� ���ڰ� {'A', 'C', 'G', 'T'} �� ���ڿ��� ���Ѵ�. 
		���� ��� "ACKA" �� DNA ���ڿ��� �ƴ�����, "ACCA" �� DNA ���ڿ��̴�. 
		�̷� �ź��� ���ڿ��� ������ �ŷ�� ��ȣ�� ������ DNA ���ڿ��� ����� ������� DNA ���ڿ��� �κ� ���ڿ��� ��й�ȣ�� ����ϱ�� �����Ծ���.
		������ ��ȣ�� �� ������� ū ������ �ִٴ� ���� �߰��ߴ�. 
		������ DNA ���ڿ��� �κ� ���ڿ��� �̾��� �� "AAAA" �� ���� ���ȿ� ����� ��й�ȣ�� ������� �� �ֱ� �����̴�. 
		�׷��� ��ȣ�� �κ� ���ڿ����� �����ϴ� ������ ������ Ư�� ���� �̻��̾�� ��й�ȣ�� ����� �� �ִٴ� ��Ģ�� �������. 
		���� ��� ������ DNA ���ڿ��� "AAACCTGCCAA" �̰�, ��ȣ�� ���� �κ� ���ڿ��� ���̸� 4��� �����غ���. 
		�׸��� �κ� ���ڿ��� 'A' �� 1�� �̻�, 'C'�� 1�� �̻�, 'G'�� 1�� �̻�, 'T'�� 0�� �̻� �����ؾ� ��й�ȣ�� ����� �� �ִٰ� �����غ���. 
		�̶� "ACCT"�� 'G'�� 1�� �̻� �����ؾ� �Ѵٴ� ������ �������� ���� ��й�ȣ�� ����� �� ������, "GCCA"�� ��� ������ �����ϹǷ� ��й�ȣ�� ����� �� �ִ�.
		��ȣ�� ���� ������ DNA ���ڿ��� ��й�ȣ�� ����� �κ� ���ڿ��� ���� �׸��� {'A', 'C', 'G', 'T'}�� ���� �� �� �̻� �����ؾ� ��й�ȣ�� ����� �� �ִ���, 
		������� �־����� �� ��ȣ�� ���� �� �ִ� ��й�ȣ�� ������ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
		��, �κ� ���ڿ��� �����ϴ� ��ġ�� �ٸ��� �κ� ���ڿ��� ������ ������ �ٸ� ���ڿ��� ����Ѵ�.
		*/
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		int Result = 0;
		
		char A[] = new char[S];
		checkArr = new int[4];
		myArr = new int[4];
		
		checkSecret = 0;
		A = br.readLine().toCharArray();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			if (checkArr[i] == 0) checkSecret++;
		}
		for (int i = 0; i < P; i++) {		// �ʱ� P �κ� ���ڿ� ó�� �κ�
			Add(A[i]);
		}
		if (checkSecret == 4)
			Result++;
		// �����̵� ������ ó�� �κ�
		for (int i = P; i < S; i++) {
			int j = i - P;
			Add(A[i]);
			Remove(A[j]);
			if (checkSecret == 4)			// 4�ڸ����� ���õ� ũ�Ⱑ ��� ������ �� ��ȿ�� ��й�ȣ
				Result++;
		}
		System.out.println(Result);
		br.close();
	}
	
	private static void Add(char c) {		// ���� ���� ���ڸ� ó���ϴ� �Լ�
		switch (c) {
		case 'A':
			myArr[0]++;
			if (myArr[0] == checkArr[0])
				checkSecret++;
			break;
		case 'C':
			myArr[1]++;
			if (myArr[1] == checkArr[1])
				checkSecret++;
			break;
		case 'G':
			myArr[2]++;
			if (myArr[2] == checkArr[2])
				checkSecret++;
			break;
		case 'T':
			myArr[3]++;
			if (myArr[3] == checkArr[3])
				checkSecret++;
			break;
		}
	}
	
	private static void Remove(char c) {	// ���ŵǴ� ���ڸ� ó���ϴ� �Լ�
		switch (c) {
		case 'A':
			if (myArr[0] == checkArr[0])
				checkSecret--;
			myArr[0]--;
			break;
		case 'C':
			if (myArr[1] == checkArr[1])
				checkSecret--;
			myArr[1]--;
			break;
		case 'G':
			if (myArr[2] == checkArr[2])
				checkSecret--;
			myArr[2]--;
			break;
		case 'T':
			if (myArr[3] == checkArr[3])
				checkSecret--;
			myArr[3]--;
			break;
		}
	}
}
