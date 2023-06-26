package test;

public class Ex16 {
	public static void main(String[] args) {
		final int POWER = 10;
		int result = 1;
		int n = 0;
		while(n < POWER) {
			result *= 2;
			 n++;
		}
		System.out.println("2의 " + POWER + "제곱은 " + result + "입니다.");
	}
}
