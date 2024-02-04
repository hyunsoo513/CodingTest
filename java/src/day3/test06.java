package day3;

import java.util.Scanner;

public class test06 {

	public static void main(String[] args) {
		// test06_연속된 자연수의 합 구하기
		/*
		어떠한 자연수 N은 몇 개의 연속된 자연수의 합으로 나타낼 수 있다.
		당신은 어떤 자연수 N(1<=N<=10,000,000)을 몇 개의 연속된 자연수의 합으로 나타내는 가짓수를 알고 싶다. 이때 사용하는 자연수는 N이어야 한다.
		예를 들어 15를 나타내는 방법은 15,7+8,4+5+6,1+2+3+4+5이다. 반면,10을 나타내는 방법은 10,1+2+3+4이다.
		N을 입력받아 연속된 자연수의 합으로 나타내는 가짓수를 출력하는 프로그램을 작성하시오.
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수를 입력하세요: ");
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
