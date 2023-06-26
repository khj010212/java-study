package day03;

public class Chap_02 {

	public static void main(String[] args) {
		// 선언 시 크기를 지정할 수 없다.
		// int[10] a;
		
		// 비추
		int a1[] = new int[10];
		System.out.println(a1.length);
		
		// 강추
		int[] a2 = new int[10];
		System.out.println(a2.length);
		
		// 초기화1
		int[] a3 = {0, 1, 2, 3, 4};
		System.out.println(a3.length);
		
		// 초기화2
		int[] a4 = new int[5];
		for(int i = 0; i < a4.length; i++) {
			a4[i] = i;
		}
		// 초기화3
		int[] a5 = new int[] {0,1,2,3,4};
		System.out.println(a5.length);
		
		//사용1 : 랜덤 접근
		
		System.out.println(a5[3]);
		
		//사용 2: 순회(iteration)
		for(int j = 0; j< a5.length; j++) {
			System.out.println(a5[j]);
		}
	}

}
