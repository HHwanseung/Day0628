package net.hb.day0628;

public interface AAA {
	public void apple() ;
	public void memo();
	public boolean nullCheck(int key);
	//추상메소드 구성원이라서 AAA인터페이스로 개체생성하면 에러
	//AAA 인터페이스 상속 안 하면 개체화 확인
}
