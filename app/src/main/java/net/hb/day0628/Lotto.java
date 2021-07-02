package net.hb.day0628;

public class Lotto { //단독실행

	public static int[] input() {
		int[] su = new int [6]; //su배열 지역배열기술, 전역배열로 빼지 마세요
		su[0] = 3; su[1]= 4; su[2]= 7;
		su[3] = 5; su[4]= 7; su[5]= 3;
		return su;
	}//end
	
	public static void output(int [] LT) {
		for( int i =0; i<LT.length; i++) {
			System.out.println(LT[i] + "\t");
		}
		System.out.println("로또배열 출력 성공했습니다.");
	}//end
	
	
	public int inputHap() { //Non=static
		int hap = 0;
		int[] su = new int [6]; //su배열 지역배열기술, 전역배열로 빼지 마세요
		su[0] = 3; su[1]= 4; su[2]= 7;
		su[3] = 5; su[4]= 1; su[5]= 6;
		
		for(int i=0; i<su.length; i++) {
			hap = hap + su[i];
			hap += su[i];
		}
		return hap; //이 값에 타입에 따라 위에 int에 타입이 바
	}//end

}//class END
