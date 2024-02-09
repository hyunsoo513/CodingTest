package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test09 {
	static int checkArr[];
	static int myArr[];
	static int checkSecret;
	
	public static void main(String[] args) throws IOException {
		// test09_DNA 비밀번호
		/* 평소 문자열을 이용해 노는 것을 좋아하는 민호는 DNA 문자열을 알게 됐다. 
		DNA 문자열은 모든 문자열에 등장하는 문자가 {'A', 'C', 'G', 'T'} 인 문자열을 말한다. 
		예를 들어 "ACKA" 는 DNA 문자열이 아니지만, "ACCA" 는 DNA 문자열이다. 
		이런 신비한 문자열에 완전히 매료된 민호는 임의의 DNA 문자열을 만들고 만들어진 DNA 문자열의 부분 문자열을 비밀번호로 사용하기로 마음먹었다.
		하지만 민호는 이 방법에는 큰 문제가 있다는 것을 발견했다. 
		임의의 DNA 문자열의 부분 문자열을 뽑았을 때 "AAAA" 와 같이 보안에 취약한 비밀번호가 만들어질 수 있기 때문이다. 
		그래서 민호는 부분 문자열에서 등장하는 문자의 개수가 특정 개수 이상이어야 비밀번호로 사용할 수 있다는 규칙을 만들었다. 
		예를 들어 임의의 DNA 문자열이 "AAACCTGCCAA" 이고, 민호가 뽑을 부분 문자열의 길이를 4라고 가정해보자. 
		그리고 부분 문자열에 'A' 는 1개 이상, 'C'는 1개 이상, 'G'는 1개 이상, 'T'는 0개 이상 등장해야 비밀번호로 사용할 수 있다고 가정해보자. 
		이때 "ACCT"는 'G'가 1개 이상 등장해야 한다는 조건을 만족하지 못해 비밀번호로 사용할 수 없지만, "GCCA"은 모든 조건을 만족하므로 비밀번호로 사용할 수 있다.
		민호가 만든 임의의 DNA 문자열과 비밀번호로 사용할 부분 문자열의 길이 그리고 {'A', 'C', 'G', 'T'}가 각각 몇 번 이상 등장해야 비밀번호로 사용할 수 있는지, 
		순서대로 주어졌을 때 민호가 만들 수 있는 비밀번호의 종류의 수를 구하는 프로그램을 작성하시오. 
		단, 부분 문자열이 등장하는 위치가 다르면 부분 문자열의 내용이 같더라도 다른 문자열로 취급한다.
		*/
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		int Result = 0;
		
		char A[] = new char[S];
		checkArr = new int[4];
		myArr = new int[4];
		
		checkSecret = 0;
		A = br.readLine().toCharArray();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			if (checkArr[i] == 0) checkSecret++;
		}
		for (int i = 0; i < P; i++) {		// 초기 P 부분 문자열 처리 부분
			Add(A[i]);
		}
		if (checkSecret == 4)
			Result++;
		// 슬라이딩 윈도우 처리 부분
		for (int i = P; i < S; i++) {
			int j = i - P;
			Add(A[i]);
			Remove(A[j]);
			if (checkSecret == 4)			// 4자릿수와 관련된 크기가 모두 충족될 때 유효한 비밀번호
				Result++;
		}
		System.out.println(Result);
		br.close();
	}
	
	private static void Add(char c) {		// 새로 들어온 문자를 처리하는 함수
		switch (c) {
		case 'A':
			myArr[0]++;
			if (myArr[0] == checkArr[0])
				checkSecret++;
			break;
		case 'C':
			myArr[1]++;
			if (myArr[1] == checkArr[1])
				checkSecret++;
			break;
		case 'G':
			myArr[2]++;
			if (myArr[2] == checkArr[2])
				checkSecret++;
			break;
		case 'T':
			myArr[3]++;
			if (myArr[3] == checkArr[3])
				checkSecret++;
			break;
		}
	}
	
	private static void Remove(char c) {	// 제거되는 문자를 처리하는 함수
		switch (c) {
		case 'A':
			if (myArr[0] == checkArr[0])
				checkSecret--;
			myArr[0]--;
			break;
		case 'C':
			if (myArr[1] == checkArr[1])
				checkSecret--;
			myArr[1]--;
			break;
		case 'G':
			if (myArr[2] == checkArr[2])
				checkSecret--;
			myArr[2]--;
			break;
		case 'T':
			if (myArr[3] == checkArr[3])
				checkSecret--;
			myArr[3]--;
			break;
		}
	}
}
