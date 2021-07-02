package net.hb.day0628;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Memo extends Frame implements WindowListener, ActionListener {
	private Button btnExit = new Button(" exit ");
	private Button btnSend = new Button(" send ");		
	private TextField tf = new TextField(20); //한줄입력
	private TextArea ta = new TextArea();// 가로row * 세로column
	private Font ff = new Font("consolas", Font.BOLD, 20);
	private Panel pan = new Panel(); //레이아웃받침대 = 쟁반역할
	
	public Memo() {
		//초간단 메모장
		pan.add(tf); pan.add(btnSend); pan.add(btnExit); //
		
		ta.setFont(ff);
		add("Center", ta);
		add("South", pan); //pan=Panel판넬
		
		//이벤트 연결 리스너추가
		this.addWindowListener(this); //앞this Memo를 가르킴 뒤this
		tf.addActionListener(this);
		btnSend.addActionListener(this);
		btnExit.addActionListener(this);
		
		//프레임의 메소드값 변경
		ta.setBackground(Color.YELLOW);
		this.setSize(400, 500);
		this.setTitle("초간단메모장"); //부모가 만든걸 가르킴
		this.setVisible(true);
	}
	
	@Override public void windowClosing(WindowEvent e) {myExit();}
	@Override public void windowOpened(WindowEvent e) { }//end
	@Override public void windowClosed(WindowEvent e) {  }//end
	@Override public void windowIconified(WindowEvent e) { }//end
	@Override public void windowDeiconified(WindowEvent e) { }//end
	@Override public void windowActivated(WindowEvent e) { }//end
	@Override public void windowDeactivated(WindowEvent e) { }//end

	@Override
	public void actionPerformed(ActionEvent ae) {
		//actionPerformed메소드는 버튼클릭, 이미지클릭, 입력란 enter
		if(ae.getSource() ==tf) { //tf한줄입력란
			myText();
		}else if(ae.getSource() ==btnSend) {
			myText();
		}else if(ae.getSource() ==btnExit) {
			myExit();
		}else { }
	}//end
	
	public void myText() {
		//첫번째 tf입력란 데이터 가져오기
		//두번째 tf내용을 ta에 추가후 tf내용삭제, tf입력란에 초점
		String data = tf.getText();
		ta.append(data+"\n");
		tf.setText("");
		tf.requestFocus();
	}//end
	
	public void  myExit( ) {
	    System.out.println("초간단 메모장 프로그램을 종료 1:16 2:38");
	    System.exit(0);
	  }//end
	
	
	public static void main(String[] args) {
		Memo pad = new Memo(); //생성자 호출
		//AAA aa = null ; //선언만
		//AAA ac = new AAA(); 에러발생
		//pad.windowClosed(null);
		//WindowListener wl = new WindowListener();
	}//end
}//class END
