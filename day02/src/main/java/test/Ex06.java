package test;

public class Ex06 {
	public static void main(String[] args) {
		int a = 3;
		int b = 7;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		System.out.println(-a);
		
		++a;
		//a += 1;
		//a = a + 1;
		System.out.println(a);//4
		a++;
		System.out.println(a++);//5
		
		System.out.println(a);//6
		
		System.out.println(++a);//7
		
		System.out.println(--a);//6
		
		System.out.println(a);//6
	
		System.out.println(a--);//6
		
		System.out.println(a);//5
	}
}
