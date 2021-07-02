package net.common.bit;

public class NewSJUser {
	  public static void main(String[] args) {
		  NewSJ sj = new NewSJ();
		  
		  String id = "빌런";
		  int su = 70;
		  int su2 = 80;
		  int total = sj.getTotal(id, su, su2);
		  double avg = sj.getMean(total);
		  char grade = sj.getGrade(avg);
		  
		  System.out.println("합계" + total);
		  System.out.println("평균" + avg);
		  System.out.println("학점" + grade);
		  
		  


	  }//main end
	}//class END

