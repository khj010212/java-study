package test;

public class swap {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 30;
		int n3 = 0;
		System.out.println("--초기값--");
		System.out.println("n1 =" + n1);
		System.out.println("n2 =" + n2);
		
		if(n2 > n1) {
			n3 = n2;
			n2 = n1;
			n1 = n3;
		} 
		System.out.println("--결과값--");
		System.out.println("n1 =" + n1);
		System.out.println("n2 =" + n2);
		
		// Q2: 최대값을 판별하는 조건을 완성해 보세요.
		int a1 = 20;
		int a2 = 10;
		int a3 = 50;
		int max = 0;
		if (a1 >= max) {
			max  = a1;
		} 
		if(a2 >= max){
			max = a2;
		}
		if(a3 >= max){
			max = a3;
		}
		System.out.println("최대값은" + max + "이다");

	}
}
