package test;

public class Ex18 {
	public static void main(String[] args) {
		/**for(int i = 1; i <= 9; i++) {
			for(int j = 1; j<=9; j++) {
				System.out.println(i + ("x") + j + '=' + (j * i)  );
			}
			System.out.println("=========================================");
		}*/
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j<=9; j++) {
				System.out.print(i + ("x") + j + '=' + (j * i) + "\t ");
			}
		}
	}
}
