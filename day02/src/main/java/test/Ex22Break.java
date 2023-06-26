package test;

public class Ex22Break {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		while(true) {
			if(sum>5000) {
				break;
			}
			sum += i;
			i++;
		}
		System.out.println("1에서 차례대로 더했을때 5000 이상이 되는 최소 결과값은" + sum + "이다.");
	}
}
