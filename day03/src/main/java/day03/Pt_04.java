package day03;

import java.util.Scanner;

public class Pt_04 {
	public static void main(String[] args) {
		System.out.println("문자열을 입력해주세요: ");
		Scanner s = new Scanner(System.in);
		String p = s.next();
		String[] array_p;
		
		array_p = p.split("");
		for(int j = 0; j <p.length()+1;j++) {
		for(int i = 0; i < j; i++) {
			System.out.print(array_p[i]);
		}
		System.out.println();
		}
		
	}
}
