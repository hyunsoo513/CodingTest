package day3;

import java.util.Scanner;

public class test06 {

	public static void main(String[] args) {
		// test06_���ӵ� �ڿ����� �� ���ϱ�
		/*
		��� �ڿ��� N�� �� ���� ���ӵ� �ڿ����� ������ ��Ÿ�� �� �ִ�.
		����� � �ڿ��� N(1<=N<=10,000,000)�� �� ���� ���ӵ� �ڿ����� ������ ��Ÿ���� �������� �˰� �ʹ�. �̶� ����ϴ� �ڿ����� N�̾�� �Ѵ�.
		���� ��� 15�� ��Ÿ���� ����� 15,7+8,4+5+6,1+2+3+4+5�̴�. �ݸ�,10�� ��Ÿ���� ����� 10,1+2+3+4�̴�.
		N�� �Է¹޾� ���ӵ� �ڿ����� ������ ��Ÿ���� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ڿ����� �Է��ϼ���: ");
		int N = sc.nextInt();
		
		int count = 1;
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		
		while (end_index != N ) {
			if (sum == N) {			// sum == N: end_index++; sum=sum+end_index; count++;
				count++;
				end_index++;
				sum=sum+end_index;
			}
			else if (sum > N) {		// sum > N: sum = sum - start_index; start_index++;
				sum = sum - start_index;
				start_index++;
			}
			else {					// sum < N: end_index++; sum=sum+end_index;
				end_index++;
				sum=sum+end_index;
			}
		}
		System.out.print("count: " + count);
	}

}
