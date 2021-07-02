package net.hb.day0628;

public class BitCamp_3 {
	public BitCamp_3() { this("종로점",7,"phython"); } //기본생성자는 생략가능
	public BitCamp_3(String location) { } //String 타입의 매개인자 있는 생성자
	public BitCamp_3(int floor) { } //int 타입의 매개인자 있는 생성
	public BitCamp_3(String location, int pos, String subject) {
		System.out.println(location + "지점 " + pos + "층 " + subject + " 과정입니다");
	}
	
	public static void main(String[] args) {
		BitCamp_3 bc = new BitCamp_3(); 
		bc.coffee();
	}//end
	
	public void coffee() { //Non-static
		System.out.println("coffee 맥심 카누");
		this.cookie(); //this 키워드 생략가능 / this.( ) = 현재클래스 생성자접근
	}//end

	
	public void cookie() { //Non-static
		System.out.println("cookie 버터링");
	}//end
	
}//class END
