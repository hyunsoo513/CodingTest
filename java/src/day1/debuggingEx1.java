package day1;
import java.util.Scanner;
public class debuggingEx1 {
	public static void main(String[] args) {
		// TODO �迭���� �־��� ������ ���� ���ϴ� ���α׷��� ���Ͻÿ�
		Scanner sc = new Scanner(System.in);
		System.out.print("testcase ���� �Է��ϼ���: ");
		int testcase = sc.nextInt();
		int answer = 0;
		long A[] = new long[100001];
		long S[] = new long[100001];
		
//		int A[] = new int[100001]; ���� int�� ������ �Ѿ� ������ ��µǾ� long ���� ����
//		int S[] = new int[100001];
		
		for (int i = 1; i < 100000; i++) 
//		for (int i = 1; i < 10000; i++) ���� ���������� 10000 ���� S ���� 0 ���� ���
		{
			A[i] = (int) (Math.random() * Integer.MAX_VALUE);
			S[i] = S[i-1] + A[i];
		}
		for (int t = 1; t < testcase; t++) 
		{
			System.out.print("query ���� �Է��ϼ���: ");
			int query = sc.nextInt();
			for (int i = 0; i < query; i++) 
			{
				System.out.print("start ���� �Է��ϼ���: ");
				int start = sc.nextInt();
				System.out.print("end ���� �Է��ϼ���: ");
				int end = sc.nextInt();
				answer += S[end] - S[start - 1];
				System.out.println(t + " " + answer);
//				System.out.println(testcase + " " + answer); ��� ���� ������
			}
		}
	}
}
