package net.hb.day0628;

public class Child extends Father {
	//Father 부모소속 car()메소드 호출
	//child 자식소속 car() 메소드 호출
	
	public static void main(String[] args) {
		Child ck = new Child();
		ck.book();
	}//end
	
	public void book() {
		super.car();
		this.car();
	}
	
	@Override
	public void car() {
		System.out.println("Father 클래스 car 메소드");
	}//end
	
}//class END
