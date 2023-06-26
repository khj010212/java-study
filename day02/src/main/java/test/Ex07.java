package test;

public class Ex07 {
	public static void main(String[] args) {
		final int Time = 20000;
		int hour = Time/60/60;
		int minute = hour * 60;
		int second = minute * 60;
		
		
		System.out.println(Time + "초는" + hour + "시간" + minute + "분" + second + "초입니다");
	}
}
