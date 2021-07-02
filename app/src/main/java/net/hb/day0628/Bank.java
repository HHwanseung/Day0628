package net.hb.day0628;

public class Bank {
	//자바 어는 객체지향 언어 = OOP = Object Oriented Programming
	//챕터 6장 5 생성자 =constructor = constr
	//기본 생성자만 기술 => 기본생성자 생략가능
	//우리은행거래 
	//비번으로 입금, 송금, 계좌이체, 인출, 잔액
	int pwd = 1234; //private 키워드는 현재클래스에만 적용
	Bank() { }
	
	protected void cal(int m) {System.out.println(pwd);}//입금
	public void cal() { }
	public void cal(String name, int m) { } //어느은행, 입금
		
}//class END
