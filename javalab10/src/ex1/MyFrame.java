package ex1;

import javax.swing.JFrame;

//(예제1) Swing 프레임 만들기
//1817022 조이린

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("300x300 스윙 프레임 만들기");
		setSize(300, 300); //프레임 크기 300x300
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true); //프레임 출력
	}
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}
