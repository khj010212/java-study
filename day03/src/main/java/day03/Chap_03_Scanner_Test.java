package day03;

import java.util.Scanner;

public class Chap_03_Scanner_Test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("상품 정보를 입력하세요");
		
		System.out.println("이름: ");
		String name = s.next();
		
		System.out.println("가격: ");
		int price = s.nextInt();
		
		System.out.println("재고량: ");
		int countStock = s.nextInt();
		
		System.out.println("판매량: ");
		int countSold = s.nextInt();
		
		System.out.println(name + ":" + price + ":" + countStock + ":" + countSold);
		
	}
}
