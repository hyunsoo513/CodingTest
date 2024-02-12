package day7_8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class test12 {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[]A = new int[n];		// ���� �迭 ����
		int[]ans = new int[n];		// ���� �迭 ����
		
		String[] str = br.readLine().split(" ");
		
		for (int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(str[i]);
		}
		
		Stack<Integer> myStack = new Stack<>();
		myStack.push(0);			// ó������ �׻� ������ ��� �����Ƿ� ���� ���� push�� �ʱ�ȭ
		for (int i = 1; i < n; i++) {
			// ������ ��� ���� �ʰ� ���� ������ ���� top �ε����� ����Ű�� �������� Ŭ ���
			while (!myStack.isEmpty() && A[myStack.peek()] < A[i]) {
				ans[myStack.pop()] = A[i];	// ���� �迭�� ��ū���� ���� ������ �����ϱ�
			}
			myStack.push(i);				// �ű� ������ push
		}
		while (!myStack.empty()) {
			// �ݺ����� �� ���� ���Դµ� ������ ��� ���� �ʴٸ� �� ������
			ans[myStack.pop()] = -1;
			// ���ÿ� ���� index�� -1�� �ְ�
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < n; i++) {
			bw.write(ans[i] + " ");
			// ����Ѵ�
		}
		bw.write("\n");
		bw.flush();
	}

}
