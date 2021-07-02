package net.Test;

public class NewSJUser {
	  public static void main(String[] args) {
		  NewSJ sj = new NewSJ();
		  
		  String id = "개똥";
		  int s1 = 85;
		  int s2 = 45;
		  
		  int total = sj.getTotal(id, s1, s2);
		  double avg = sj.getMean(total)/2 ;
		  char data = sj.getGrade(avg) ;
		  
		  
		  System.out.println("합계" + total);
		  System.out.println("평균" + avg);
		  System.out.println("학점" + data);
		  
	  }//main end
	}//class END

