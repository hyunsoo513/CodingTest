package day3;

import java.util.Scanner;

public class test06_me {

	public static void main(String[] args) {
		// test06_���ӵ� �ڿ����� �� ���ϱ�
		/*
		��� �ڿ��� N�� �� ���� ���ӵ� �ڿ����� ������ ��Ÿ�� �� �ִ�.
		����� � �ڿ��� N(1<=N<=10,000,000)�� �� ���� ���ӵ� �ڿ����� ������ ��Ÿ���� �������� �˰� �ʹ�. �̶� ����ϴ� �ڿ����� N�̾�� �Ѵ�.
		���� ��� 15�� ��Ÿ���� ����� 15,7+8,4+5+6,1+2+3+4+5�̴�. �ݸ�,10�� ��Ÿ���� ����� 10,1+2+3+4�̴�.
		N�� �Է¹޾� ���ӵ� �ڿ����� ������ ��Ÿ���� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		*/
		
		// N ���� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("�ڿ����� �Է��ϼ���: ");
		int N = sc.nextInt();
		
		// ��� ���� �ʱ�ȭ(count = 1, start_index = 1, end_index = 1, sum = 1)
		int count = 1;
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		
		// while(end_index != N) {
		//		if(sum == N) count ����, end_index ����, sum�� ����
		//		else if(sum > N) sum �� ����, start_index ����
		//		else if(sum < N) end_index ����, sum �� ���� }
		while (end_index != N ) {
			if (sum == N) {
				count++;
				end_index++;
				sum=sum+end_index;
			}
			else if (sum > N) {
				start_index++;
				sum = start_index;
				end_index=start_index;
			}
			else if (sum < N) {
				end_index++;
				sum=sum+end_index;
			}
		}
		
		// count ����ϱ�
		System.out.print("count: " + count);
	}

}
