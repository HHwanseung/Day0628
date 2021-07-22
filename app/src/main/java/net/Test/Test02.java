package net.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class Test02 {
  Connection CN=null; //DB������������ ����ip�ּ� ����id,pwd
  Statement ST=null;  //ST=CN.createStatement()��ɾ���� ����,�űԵ��,��ȸ�϶�
  ResultSet RS=null;  //select��ȸ����� ��ü�����͸� ����մϴ�
  String msg="isud=crud���������";
  static Scanner sc = new Scanner(System.in);

  public void conect() {
    try {   
      Class.forName("oracle.jdbc.driver.OracleDriver"); //����Ŭ����̺�ε�
      String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE" ;
      CN=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","1234");
      System.out.println("����Ŭ ����̺�� �������Ἲ�� ");

      //ù��°��ɾ����
      ST = CN.createStatement();
    }catch (Exception e) { }
  }

  public void input() {
    try {
      //�ι�° Ű���忡�� ������ �Է�
      System.out.print("\n�ڵ��Է�(4�ڸ���)>>>"); 
      int a=Integer.parseInt(sc.nextLine());
      System.out.print("�̸��Է�>>>"); 
      String b=sc.nextLine();  
      System.out.print("�����Է�>>>"); 
      String c=sc.nextLine();

      //3��° �������ϼ�
      msg="insert into test(code,name,title,wdate,cnt) values("+a+",'"+b+"','"+c+"',sysdate,0)";   
      System.out.println(msg);

      //4��° �������� ���� executeUpdate("insert ~~")
      int OK = ST.executeUpdate(msg);
      if (OK>0){
        System.out.println(a+"�ڵ� ���强���߽��ϴ�");
      }else { System.out.println(a+"�ڵ� ��������߽��ϴ�");}

    }catch (Exception e) { }
  }

  public void select () {
    try {
      System.out.println("���α׷� ��ü������ �о������...��� ��ٷ� �ּ���");
      Thread.sleep(3000);
      msg = "select * from  test " ; //���ڿ��� ��ɾ� �ν��ؼ� �����ϵ��� Statement
      RS = ST.executeQuery(msg);

      System.out.println("�ڵ�\t�̸�\t");
      while(RS.next()==true) {
        //�ʵ������ؼ� �����Ͱ����ö� getXXX()
        int ucode = RS.getInt("code");
        String uname = RS.getString("name");
        System.out.println(ucode +"\t" + uname);
      }
      sc.close();
    }catch(Exception ex) { System.out.println("�������� " + ex);}   

  }

  public static void main(String[] args) {
    Test02 ts = new Test02();
    ts.conect();

    int sel = 9;
    while (true) {
      System.out.println("1.�Է�, 2.��ȸ ... 9.����");
      sel = Integer.parseInt(sc.nextLine());

      if(sel == 9) {
        System.out.println("����~~");
        break;
      }
      switch (sel) {
        case 1: ts.input();
        break;
        case 2: ts.select();
        break;
        default:
          System.out.println("�߸��� �Է��Դϴ�");
          break;
      }
    }

  }//main end

  //�űԵ��,��ü��¼����� �޼ҵ�����ؼ� �ִ��� �޼ҵ�Ȱ��
}//class END
