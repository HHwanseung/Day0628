package net.hb.day0706;

import java.util.Scanner;

public class Test {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String msg = "";

    System.out.print("����Է�>>>");
    int a = Integer.parseInt(sc.nextLine());  

    System.out.print("�̸��Է�>>>");
    String b = sc.nextLine();  

    System.out.print("�μ��Է�>>>");
    String c = sc.nextLine();  

    msg= "insert into insa(sabun,name,buse) values(" +a+", '" +b+"', '" + c +"') " ;
    System.out.println( msg ) ;
  }
}//class END
