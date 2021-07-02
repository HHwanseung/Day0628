package net.common.bit;

public class NewSJ {
	public int getTotal(String name, int a, int b) {
		System.out.println(name +"님의 성적합계처리");
		int hap = a + b;
		return hap;
	}//end
	
	public double getMean(int value) {
		double bb = (double)value/2 ;
		return bb;
	}
	
	public char getGrade(double data) {
		char grade = 'F';
		
		switch((int)data/10) {
		case 10:
			grade = 'A';
		break;
		case 9:
			grade = 'A';
		break;
		case 8:
			grade = 'B';
		break;
		case 7:
			grade = 'C';
		break;
		case 6:
			grade = 'D';
		break;
		default :
			grade = 'E';
		}
		return grade;
		
	}
	
}//class END

