package test;

public class Ex12 {
	public static void main(String[] args) {
		char grade = ' ';
		int score = 92;
		/**if (score >= 90) {
			grade = 'A';
		}
		else if(score >= 80) {
			grade = 'B';
		}
		else if(score >= 70) {
			grade = 'C';
		}
		else if(score >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		*/
		
		switch (score / 10) {
		case 10:
		case 9: {
			grade = 'A';
			System.out.println("학점은" + grade + "입니다");
			break;
		}
		case 8: {
			grade = 'B';
			System.out.println("학점은" + grade + "입니다");
			break;
		}
		case 7: {
			grade = 'C';
			System.out.println("학점은" + grade + "입니다");
			break;
		}
		case 6: {
			grade = 'D';
			System.out.println("학점은" + grade + "입니다");
			break;
		}
		
		
		default:
			grade = 'F';
			System.out.println("학점은" + grade + "입니다");
			break;
		}
		
		
	}
}
