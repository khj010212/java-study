package test;

public class Ex13Switch {
	public static void main(String[] args) {
		char grade = 'A';
		
		/**if(grade =='A') {
			System.out.println("참 잘했어요");
		}
		else if(grade =='B') {
			System.out.println("잘했어요");
		}
		else if(grade =='C') {
			System.out.println("못했어요");
		}
		else if(grade =='D') {
			System.out.println("참 못했어요");
		}
		else if(grade =='F') {
			System.out.println("다시하세요");
		}
		else {
			System.out.println("잘못된 학점");
		}
		*/
		switch (grade) {
		case 'A': {
			
			System.out.println("참 잘했어요");
			break;
		}
		case 'B': {
	
			System.out.println(" 잘했어요");
			break;
		}
		case 'C': {
	
			System.out.println("참 했어요");
			break;
		}
		case 'D': {
	
			System.out.println("했어요");
			break;
		}
		case 'F': {
			
			System.out.println("어");
			break;
		}
		
		default:
			System.out.println("잘못된 학점");
			break;
		}
	}
}
