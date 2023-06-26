package day03;

import java.util.Scanner;

public class Pt_03 {
	public static void main(String[] args) {
		int result = 0;
		System.out.println("숫자를 입력하세요: ");
		Scanner s = new Scanner(System.in);
		int p = s.nextInt();
		if(p % 2 ==0) {
			for(int i = 0; i <= p; i += 2) {
				
				result = result + i;
			}
		}else if(p % 2 !=0) {
			for(int i = 1; i <= p; i += 2) {
				
				result = result + i;
			}
			
		}
		System.out.println(result);
		Pt_03.main(args);
	}
}
