package net.hb.day0628;

public class BitCamp_2 extends LA { //LA클래스상속 체리메소드호출
	public static void main(String[] args) {
		BitCamp_2 bc = new BitCamp_2(); 
		bc.book();
		
	}//end
	
	public void book() {
		System.out.println("book 몽블랑");
		super.cherry();  //부모클래스 접근 super
		this.cherry(); //this 생략가능
	}//end

	@Override
	public void cherry() {
		System.out.println("제주산 체리 11:48");
	}//end
	
}//class END
