package net.hb.day0628;

public class SJ { //make공급처
	
	public int getTotal(String name, int kor, int eng) {
		System.out.println(name + "님의 성적합계처리");
		int hap = kor + eng;
		return hap;
	}//end
	
	public double getMean(int value) {
		double dd = (double)value/2;
		return dd;
	}//end
	
	public char getGrade(double data) { //평균 데이터 점수 int정수화
		char grade = 'F';

		switch((int)data/10) {
			case 10:
			//	grade = 'A'; break;
			case 9:
				grade = 'A'; break;
			case 8:
				grade = 'B'; break;
			case 7:
				grade = 'C'; break;
			case 6:
				grade = 'D'; break;
			default :
				grade = 'F'; break;
		}
		return grade;
				
	}//end
	
	public String result(double data) {
		String msg = "합격여부안내문";
		if(data>=70) {
			msg = "축합격";
		}else {
			msg = "재시험";
		}
		
		return msg;
	}
	
	public String result(double data, int x, int y) {
		String msg = "합격여부안내문";
		if(data>=70 && x>=60 &&y>=60) {
			msg = "축합격";
		}else {
			msg = "재시험";
		}
		
		return msg;
	}
}//class END
