package day2;

public class test01transform {
	public static void main(String[] args) {
		// 자바에서의 형 변환
		// String -> 숫자형(int, double, float)
		String sNum = "1234";		// String형 변수
		int i1 = Integer.parseInt(sNum);
		int i2 = Integer.valueOf(sNum);
		double d = Double.valueOf(sNum);
		float f = Float.valueOf(sNum);
		long l = Long.parseLong(sNum);
		short s = Short.parseShort(sNum);
		
		System.out.println("sNum: " + sNum);
		System.out.println("i1: " + i1);
		System.out.println("i2: " + i2);
		System.out.println("d: " + d);
		System.out.println("f: " + f);
		System.out.println("l: " + l);
		System.out.println("s: " + s);
		
		// 숫자형(int, double, float) -> String형
		int i = 1234;			// int형 변수
		String s1 = String.valueOf(i);
		System.out.println("String.valueOf(i): " + s1);
		String s2 = Integer.toString(i);
		System.out.println("Integer.toString(i): " + s2);
		float ff = 1.23f;
		double dd = 1.23;
		String s3 = String.valueOf(ff);
		System.out.println("String.valueOf(ff): " + s3);
		String s4 = String.valueOf(dd);
		System.out.println("String.valueOf(dd): " + s4);
		String s5 = Float.toString(ff);
		System.out.println("Float.toString(ff): " + s5);
		String s6 = Double.toString(dd);
		System.out.println("Double.toString(dd): " + s6);
	}
}
