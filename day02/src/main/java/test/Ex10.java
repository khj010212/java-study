package test;

public class Ex10 {
	public static void main(String[] args) {
		/**
		 * ! not 부정
		 * !false => true
		 * !true => false
		 * 
		 * && and 논리곱
		 * true && false => false
		 * false && true => false
		 * false && false => false
		 * true && true => true
		 * 
		 * || or 논리합
		 * true || false => true
		 * false || true => true
		 * false || false => false
		 * true || true => true
		 * 
		 * ^ xor 베타적논리합
		 * true ^ false => true
		 * false ^ true => true
		 * false ^ false => false
		 * true ^ true => false
		 */
		System.out.println(!(3 !=2));//false
		System.out.println(3 > 2 && 3 > 4);//false
		System.out.println(3 != 2 || -1 > 0);//true
		System.out.println(3 < 2 ^ 3 < 4);//false
		
	}
}
