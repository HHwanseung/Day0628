package net.hb.day0628;

public class SJUser { //use소비자
	public static void main(String[] args) {
		SJ sj = new SJ();
		
		String id = "길동";
		int first = 85;
		int second = 80;
		
		int total = sj.getTotal(id, first, second);
		double avg = sj.getMean(total);
		char grade = sj.getGrade(avg);
		//합격조건 평균이 70점부터, 각과목별 60점부터
		//함수의 중복 = 오버로딩 = overLoading
		String info = sj.result(avg);
		
		
		System.out.println("합계" + total);
		System.out.println("평균" + avg);
		System.out.println("학점" + grade);
		System.out.println("결과" + info);
	}//main end
	
}//class END
