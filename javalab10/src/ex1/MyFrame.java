package ex1;

import javax.swing.JFrame;

//(����1) Swing ������ �����
//1817022 ���̸�

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("300x300 ���� ������ �����");
		setSize(300, 300); //������ ũ�� 300x300
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true); //������ ���
	}
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}
