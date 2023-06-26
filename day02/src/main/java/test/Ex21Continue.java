package test;

public class Ex21Continue {
	public static void main(String[] args) {
		testFor();
		//testWhile();
	}
	public static void testFor() {
		for(int i = 0; i< 10 ; i++	) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}
	public static void testWhile() {
		int i = 0;
		while(i < 10) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i);
			i++;
		}
	}
}
