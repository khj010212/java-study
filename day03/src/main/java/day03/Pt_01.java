package day03;

import java.util.Scanner;

public class Pt_01 {
	
		public static void main (String args[]) {
		
			Scanner s = new Scanner(System.in);
			
			System.out.println("수를 입력해주세요: ");
			int n = s.nextInt();
			if(n % 3 == 0) {
				System.out.println("3의 배수입니다.");
			}else {
				System.out.println("3의 배수가 아닙니다.");
				Pt_01.main(args);
			}
		}

}
