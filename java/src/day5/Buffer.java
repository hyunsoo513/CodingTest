package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer {

	public static void main(String[] args) throws IOException {
		// ����ó�� �ʼ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������ �Է��ϼ���: ");
		String s = br.readLine();
		System.out.println("String: " + s);
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		// int �� + enter ���� �Է¹��� ��
		int i = Integer.parseInt(br.readLine());
		System.out.println("Int1: " + i);
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		// int ���� �Է¹��� ��
		int j = br.read();
		System.out.println("Int2: " + j);
		
	}
}
