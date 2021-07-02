package net.hb.day0628;

public class Work01jumin {
	public static void main(String[] args) {
		String min = "871024-1541965"; //키보드입력 대신 초기값
		String min1 = "871024";
		String min2 = "1541965";
		
		//문제1 총자릿수 6 - 7 13자릿수, 14자릿수
	    int len = min.length();
	    System.out.println("총자릿수 = " + len);
		
		
		
		//문제2 ******-1541965
		String data = min.substring(min.indexOf("-")+1);
		System.out.println("******-"+data);
		
		//문제3 1/3남자 2/4여자
		char gender = min.charAt(7);
		switch (gender) {
		case'1' :
		case'3' :
			System.out.println("남자입니다.");
		case'2' :
		case'4' : 
			System.out.println("여자입니다.");
		break;
		default :
			System.out.println("잘못된 성별입니다.");
		break;
		}
		//length(),substring(),indexOF(),charAt()

		
		
		
		
		
	}//end
}//class END
