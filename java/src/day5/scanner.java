package day5;

import java.util.Scanner;

public class scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ����, �Ҽ�, String ������ ���� �� ����
		System.out.print("int��, ���ڸ� �Է��ϼ���: ");
		int num1 = sc.nextInt();
		
		System.out.print("long��, ���ڸ� �Է��ϼ���: ");
		long num2 = sc.nextLong();
		
		System.out.print("short��, ���ڸ� �Է��ϼ���: ");
		short num3 = sc.nextShort();
		
		System.out.println("�Էµ� ����1: " + num1);
		System.out.println("�Էµ� ����2: " + num2);
		System.out.println("�Էµ� ����3: " + num3);
		
		sc.close();
		
		String test = "1 bun 2 bun three bun �� bun";
		Scanner sc2 = new Scanner(test).useDelimiter("\\s*bun\\s*");
		System.out.println(sc2.nextInt());
		System.out.println(sc2.nextInt());
		System.out.println(sc2.next());
		System.out.println(sc2.next());
		sc2.close();
	}
}