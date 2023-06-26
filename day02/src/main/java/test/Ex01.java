package test;

public class Ex01 {
	public static void main(String[] args) {
		
		int i = 10;
		String s = "Hello";
		System.out.println(i);
		System.out.println(s);
		
		System.out.println("변수 변경 로직(alogirithm)");
		i = 2000;
		s = "Hello World";
		System.out.println(i);
		System.out.println(s);
		
		final double PI = 3.14;
		//PI = 3.141592;
		System.out.println(PI);
		//final 붙은 상수 = value(변경 불가능)  
	}
}
