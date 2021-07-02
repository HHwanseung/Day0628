package net.hb.day0628;

import java.util.Scanner;

public class Work04Hotel {

	private int floor ; //층 = 헹 3층
	private int room ; //호 = 열 5호 3층 *5열=15방구성
	private String[][] name = new String[3][5];
	private String title;
	
	public Work04Hotel () { }
	public Work04Hotel (String name) { }
	public Work04Hotel (String name, int year) { }

	public void process( ) {
		Scanner sc = new Scanner(System.in);
		int sel = 9;
		
		for( int i = 0; i < 3; i++ ) {
			for(int k = 0; k < 5; k++) {
				name[i][k] = "0";
			}
		}
		
		while(true) {
			System.out.print("\n1.투숙 2.퇴실 3.map 4.list 9.종료 >>>");
			sel = Integer.parseInt(sc.nextLine());
			
			if(sel == 9) {
				System.out.println("호텔예약프로그램을 종료합니다.");
				System.exit(1);
			}
			switch(sel) {
			case 1 : checkIn();
				break;
			case 2 : checkOut();
				break;
			case 3 : map();
				break;
			case 4 : list();
				break;
			}//switch end
		}//while end
	}//end
	
	public void checkIn( ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 층을 원하시나요? 입력(1~3)>>>");
		floor = sc.nextInt();
		System.out.println("몇 호를 원하시나요? 입력(1~5)>>>");
		room = sc.nextInt();
		
		if (name[floor-1][room-1] != "0" ) {
			System.out.println("이미 예약된 방입니다");
		} else {
			System.out.println("이름을 입력 하세요");
			name[floor-1][room-1] = sc.next();
			System.out.printf("%s님 체크인 되셨습니다.", name[floor-1][room-1]);
		}
		
	}//end
	
	public void checkOut( ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 층에 퇴실을 원하시나요? 입력(1~3)>>> ");
		floor = sc.nextInt();
		System.out.println("몇 호에 퇴실을 원하시나요? 입력(1~5)>>> ");
		room = sc.nextInt();
		
		System.out.printf("%s님 체크아웃되셨습니다" , name[floor-1][room-1]);
		name[floor-1][room-1] = "0";
		
		
	}//end
	
	public void map() { //printAll() = list() = display()
		System.out.println("\n\t[ "+ title +" 투숙 상태 ]");
	    for(int i = 0; i < 3; i++){
	      for(int b = 0; b < 5; b++){
	        System.out.print((i+1)+"0"+(b+1)+"\t");
	      }

	      System.out.println(); //이름표시 공백란입니다

	      for(int j = 0; j < 5; j++){
	        if(this.name[i][j] == null){
	          System.out.print("\t");
	          continue;
	        }//if end
	        System.out.print(this.name[i][j]+"\t"); 
	      }//j end
	      System.out.println("\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ"); // \n꼭넣으세요 
	    }//for i end
	  } //map end

	public void list() {
		System.out.println("\n\t[ list ]");
			for(int i = 0; i < 3; i++){
				for(int j = 0; j < 5; j++){
					if(name[i][j] == null) {
						System.out.print( " " + (i+1)+"0"+(j+1) +"호"+"□\t" +"\t"); 
					}else {
						System.out.print( " " + (i+1)+"0"+(j+1) +"호"+"■\t" + name[i][j] + "\t"); 
					}
				} //j end
				System.out.println();
			}//for i end
	}//end
	public static void main(String[] args) {
		System.out.println("**********어서 오세 호텔**********");
		Work04Hotel wh = new Work04Hotel();
		wh.process();
	}//end
}//end
