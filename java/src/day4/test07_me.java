package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test07_me {

	public static void main(String[] args) throws IOException {
		// test07_주몽의 명령
		/*
		주몽은 철기군을 양성하기 위한 프로젝트에 나섰다. 그래서 야철대장에게 철기군이 입을 갑옷을 만들라고 명령했다.
		야철대장은 주몽의 명령에 따르기 위해 연구에 착수하던 중 갑옷을 만드는 재료들은 각각 고유한 번호가 있고, 
		갑옷은 2개의 재료를 만드는 데 2가지 재료의 고유한 번호를 합쳐 M(1<=M<=10,000,000)이 되면 갑옷이 만들어진다는 사실을 발견했다. 
		야철대장은 자신이 만들고 있는 재료로 갑옷을 몇 개나 만들 수 있는지 궁금해졌다. 
		야철대장의 궁금증을 풀어 주기 위해 N(1<=N<=15,000)개의 재료와 M이 주어졌을 때 몇 개의 갑옷을 만들 수 있는지를 구하는 프로그램을 작성하시오.
		*/
		
		// N(재료의 개수), M(갑옷이 되는 번호) 저장하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("재료의 수를 입력하세요: ");
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		System.out.print("갑옷이 되는 번호를 입력하세요: ");
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		
		
		// for(N만큼 반복) 재료 배열 저장하기
		long A[] = new long[N+1];
		
		System.out.print("재료를 입력하세요: ");
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(A);
		
		// 재료 배열 저장하기
		// while(i<j) {
		//		if(재료 합 < M) 작은 번호 재료를 한 칸 위로 변경하기
		//		else if (재료 합 > M) 큰 번호 재료를 한 칸 아래로 변경하기
		//		else 경우의 수 증가, 양쪽 index 각각 변경하기 }
		int i=0;
		int j=N;
		int count = 0;
		
		while (i<j) {
			if ((A[i]+A[j]) < M) i++;
			else if ((A[i]+A[j]) > M) j--;
			else {
				count++;
				i++;
				j--;
			}
		}
		
		// count 출력하기
		System.out.println("count: " + count);
	}

}
