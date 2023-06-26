package test;

public class Ex17 {
	public static void main(String[] args) {
		final int POWER = 10;
		int result = 1;
		int i = 0;
		for (i = 0; i < POWER; i++) {
			result *= 2;
		}
		System.out.println("2의 " + POWER + "제곱은 " + result + "입니다.");
	}
}
