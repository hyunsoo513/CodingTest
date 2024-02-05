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
		// test10_최솟값 찾기
		// N개의 수 A1, A2, ..., An 과 L이 주어진다. 
		// Ai-l+1 ~ Ai 중 최솟값을 Di 라고 할 때 D에 저장된 수를 출력하는 프로그램을 작성하시오. 
		// 이때 i <= 0 인 Ai는 무시하고 D를 구해야 한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 출력을 버퍼에 넣고 한 번에 출력하기 위해 BurreredWriter 사용
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.print("데이터 개수와 최솟값을 구하는 범위를 입력하세요(공백 구분): ");
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		
		System.out.print(N + "개의 수를 입력하세요(공백구분): ");
		st = new StringTokenizer(br.readLine());
		Deque<Node> mydeque = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			int now = Integer.parseInt(st.nextToken());
			// 새로운 값이 들어올 때마다 정렬 대신 현재 수보다 큰 값을 덱에서 제거해 시간 복잡도를 줄임
			
			while (!mydeque.isEmpty() && mydeque.getLast().value > now) {
				mydeque.removeLast();
			}
			mydeque.addLast(new Node(now, i));
			// 범위에서 벗어난 값은 덱에서 제거
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
