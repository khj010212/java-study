package test;

public class Ex14WhileLoop {
	public static void main(String[] args) {
		final int LOOP_COUNT = 10;
		
		//loop 탈출 조
		int i = 0;
		while(i < LOOP_COUNT) {
			System.out.println(i + ". hello");
			i++;
		}
	}
}
