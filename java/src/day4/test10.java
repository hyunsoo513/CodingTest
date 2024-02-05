package day4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.xml.soap.Node;

public class test10 {
	public static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		// test10_�ּڰ� ã��
		// N���� �� A1, A2, ..., An �� L�� �־�����. 
		// Ai-l+1 ~ Ai �� �ּڰ��� Di ��� �� �� D�� ����� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
		// �̶� i <= 0 �� Ai�� �����ϰ� D�� ���ؾ� �Ѵ�.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ����� ���ۿ� �ְ� �� ���� ����ϱ� ���� BurreredWriter ���
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.print("������ ������ �ּڰ��� ���ϴ� ������ �Է��ϼ���(���� ����): ");
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		
		System.out.print(N + "���� ���� �Է��ϼ���(���鱸��): ");
		st = new StringTokenizer(br.readLine());
		Deque<Node> mydeque = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			int now = Integer.parseInt(st.nextToken());
			// ���ο� ���� ���� ������ ���� ��� ���� ������ ū ���� ������ ������ �ð� ���⵵�� ����
			
			while (!mydeque.isEmpty() && mydeque.getLast().value > now) {
				mydeque.removeLast();
			}
			mydeque.addLast(new Node(now, i));
			// �������� ��� ���� ������ ����
			if (mydeque.getFirst().index <= i - L) {
				mydeque.removeFirst();
			}
			bw.write(mydeque.getFirst().value + " ");
		}
		bw.flush();
		bw.close();
	}
	
	static class Node{
		public int value;
		public int index;
		
		Node(int value, int index){
			this.value = value;
			this.index = index;
		}
	}
}
