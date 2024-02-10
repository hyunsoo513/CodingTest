package day7_8;

import java.util.Scanner;
import java.util.Stack;

public class test11 {

	public static void main(String[] args) {
		// test11_�ڵ� �����ϱ�
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		Stack<Integer> stack = new Stack<>();
		
		StringBuffer br = new StringBuffer();
		int num = 1;			// �������� ��
		boolean result = true;
		for (int i = 0; i < A.length; i++) {
			int su = A[i];		// ���� ������ ��
			if (su >= num) {	// ���� ���� �� >= �������� �ڿ���: ���� ������ �� ���� push() ����
				while (su >= num) {	// push()
					stack.push(num++);
					br.append("+\n");
				}
				stack.pop();
				br.append("-\n");
			}
			else {				// ���� ���� �� < �������� �ڿ���: pop()�� ������ ���� ���Ҹ� ����
				int n = stack.pop();
				// ������ ���� ���� ���� ������ �ϴ� ������ ������ ũ�� ������ ����� �� ����
				if (n > su) {
					System.out.println("NO");
					result = false;
					break;
				}
				else {
					br.append("-\n");
				}
			}
		}
		if (result) System.out.println(br.toString());
	}

}
