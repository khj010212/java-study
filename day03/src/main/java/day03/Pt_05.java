package day03;

public class Pt_05 {
	public static void main(String[] args) {
		for(int i = 1; i < 100; i++) {
			System.out.println(i);
			
			int a = i/10; //십의 자리 수
			int b = i%10; //1의 자리 수
			int cnt=0;
			
			if(i <10) { //i이 1의 자리인 경우
				if (b%3 == 0 )
					cnt++;
			}
			
			else {  //i이 10의 자리인 경우
				if(a %3 == 0) { //10의 자리수가 3으로 나뉠 때
					cnt++;
				}
				if(b%3 == 0 ){//1의 자리수가 3으로 나뉠 때
					cnt++;
				}
			}
			
			switch(cnt) {
			case 0:
				break;
			case 1:
				System.out.println("박수짝");
				break;
			case 2:
				System.out.println("박수짝짝");
				break;	
			}
		}
	}
}
