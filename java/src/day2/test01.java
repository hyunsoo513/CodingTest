package day2;

import java.util.Scanner;

public class test01 {
	public static void main(String[] args) {
	// test001
	// N���� ���ڰ� ���� ���� �� �ִ�. �� ���ڸ� ��� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	// 1��° �ٿ� ������ ���� N(1<=N<=100), 2��° �ٿ� ���� N���� ���� ���� �־�����.
		Scanner sc = new Scanner(System.in);
		System.out.print("N�� ���� �Է��ϼ���: ");
		int N = sc.nextInt();
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		String sNum = sc.next();
		// �Է°��� String�� ���� sNum�� ������ �� char[]�� ������ ��ȯ
		char [] cNum = sNum.toCharArray();
		int sum = 0;
		
		for (int i = 0; i < cNum.length; i++) {
			sum += cNum[i] - '0';	// cNum[i]�� ���������� ��ȯ�ϸ鼭 sum �� ���Ͽ� ����
		}
		
		System.out.print("sum�� �� : " + sum);
	}
}
