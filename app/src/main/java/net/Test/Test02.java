package net.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class Test02 {
  Connection CN=null; //DB서버연결정보 서버ip주소 계정id,pwd
  Statement ST=null;  //ST=CN.createStatement()명령어생성 삭제,신규등록,조회하라
  ResultSet RS=null;  //select조회결과값 전체데이터를 기억합니다
  String msg="isud=crud쿼리문기술";
  static Scanner sc = new Scanner(System.in);

  public void conect() {
    try {   
      Class.forName("oracle.jdbc.driver.OracleDriver"); //오라클드라이브로드
      String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE" ;
      CN=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","1234");
      System.out.println("오라클 드라이브및 서버연결성공 ");

      //첫번째명령어생성
      ST = CN.createStatement();
    }catch (Exception e) { }
  }

  public void input() {
    try {
      //두번째 키보드에서 데이터 입력
      System.out.print("\n코드입력(4자릿수)>>>"); 
      int a=Integer.parseInt(sc.nextLine());
      System.out.print("이름입력>>>"); 
      String b=sc.nextLine();  
      System.out.print("제목입력>>>"); 
      String c=sc.nextLine();

      //3번째 쿼리문완성
      msg="insert into test(code,name,title,wdate,cnt) values("+a+",'"+b+"','"+c+"',sysdate,0)";   
      System.out.println(msg);

      //4번째 서버에서 실행 executeUpdate("insert ~~")
      int OK = ST.executeUpdate(msg);
      if (OK>0){
        System.out.println(a+"코드 저장성공했습니다");
      }else { System.out.println(a+"코드 저장실패했습니다");}

    }catch (Exception e) { }
  }

  public void select () {
    try {
      System.out.println("프로그램 전체데이터 읽어오는중...잠시 기다려 주세요");
      Thread.sleep(3000);
      msg = "select * from  test " ; //문자열을 명령어 인식해서 실행하도록 Statement
      RS = ST.executeQuery(msg);

      System.out.println("코드\t이름\t");
      while(RS.next()==true) {
        //필드접근해서 데이터가져올때 getXXX()
        int ucode = RS.getInt("code");
        String uname = RS.getString("name");
        System.out.println(ucode +"\t" + uname);
      }
      sc.close();
    }catch(Exception ex) { System.out.println("에러이유 " + ex);}   

  }

  public static void main(String[] args) {
    Test02 ts = new Test02();
    ts.conect();

    int sel = 9;
    while (true) {
      System.out.println("1.입력, 2.조회 ... 9.종료");
      sel = Integer.parseInt(sc.nextLine());

      if(sel == 9) {
        System.out.println("종료~~");
        break;
      }
      switch (sel) {
        case 1: ts.input();
        break;
        case 2: ts.select();
        break;
        default:
          System.out.println("잘못된 입력입니다");
          break;
      }
    }

  }//main end

  //신규등록,전체출력성공후 메소드생성해서 최대한 메소드활용
}//class END
