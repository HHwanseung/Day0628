package net.hb.day0628;

public class TestJumin {

	public static void main(String[] args) {
		//java.lang패키지 Strung 클래스의 메소드 char chatAt(int)
		//java.lang패키지 Strung 클래스의 메소드 int indexOf(int/String)
		//java.lang패키지 Strung 클래스의 메소드 String substring(1시작,2끝-1)
		//java.lang패키지 Strung 클래스의 메소드 String substring(1시작) 시작부터 끝까지
		String min = "871024-1541965";
		int pos = min.indexOf("-");
		System.out.println("pos=" + pos);
		//10월 24일 생일이네
		
		String month = min.substring(2,4);
		String day = min.substring(4,6);
		System.out.println(month+"월" + day+"일 생일이네요");
		
		
		String last = min.substring(7); //시작점, 끝X
		System.out.println(last);
		
		
		
		int len = min.length();
		System.out.println("총자릿수=" + len);
		
	}//end
}//class END

/* 성별체크
 * 
public class TestJumin {
	public static void main(String[] args) {
		String min = "871024-1541965";
		char gender = min.charAt(7);
		String message = "성별출력합니다";
		
		if(gender == '1') {
			message = "당신은 남자입니다";
		}else if(gender == '2') {
			message = "당신은 여자입니다";
		}else { message = "성별이 잘못 표기 되었습니다" ;}
		
		System.out.println(message);
		
	}
}
*/
