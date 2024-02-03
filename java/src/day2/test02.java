package day2;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		// test02_평균 구하기
		// 세준이는 기말고사를 망쳤다. 그래서 점수를 조작해 집에 가져가기로 결심했다.
		// 일단 세준이는 자기 점수 중 최댓값을 골랐다. 그런 다음 최댓값을 M이라 할 때 모든 점수를 점수/M*100 으로 고쳤다.
		// 예를 들어 세준이의 최고점이 70점, 수학 점수가 50점이라면 수학 점수는 50/70*100 이므로 71.43점이다.
		// 세준이의 성적을 이 방법으로 계산했을 때 새로운 평균을 구하는 프로그램을 작성하시오.
		
		// 변수 N에 과목 수 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("과목 수를 입력하세요: ");
		int N = sc.nextInt();
		
		// 길이가 N인 1차원 배열 A[] 선언하기
		int A[] = new int[N];
		
		// for(A[] 길이만큼 반복하기) A[i]에 각 점수 저장하기
		for (int i = 0; i < N; i++) {
			System.out.print("점수를 입력하세요: ");
			A[i] = sc.nextInt();
		}

		long max = 0;
		long sum = 0;
		
		// for(A[] 길이만큼 반복하기) 최고점은 변수 max에, 총점은 변수 sum에 저장하기
		for (int i = 0; i < N; i++) {
			if (A[i] > max) max = A[i];
			sum = sum + A[i];
		}
		// sum * 100 / max / N 출력하기
		// System.out.println("세준이의 조작된 성적의 평균 : " + sum*100/max/N);
		// --==>> 출력된 값이 정수형태로 나오기 때문에 소수점을 얻기 위해서는 .0 을 넣어주어야함
		
		// 한 과목과 관련된 수식을 총합한 후 관련된 수식으로 변환해 로직이 간단해짐
		System.out.println("세준이의 조작된 성적의 평균 : " + sum*100.0/max/N);
		
	}
}
