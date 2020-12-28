package ex2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//(����2-1) ���콺 Ŭ�� �߻� �̺�Ʈ ó��_�����ʸ� �������̽� �����Ͽ� �ۼ�
//1817022 ���̸�

public class MouseListenerEx extends JFrame{
	private JLabel la = new JLabel("Hello"); //"Hello" ���ڿ��� ����ϱ� ���� ���̺� ������Ʈ
	
	public MouseListenerEx() {
		setTitle("Mouse �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener()); //����Ʈ�ҿ� �̺�Ʈ ������ �ޱ�
		
		c.setLayout(null); //����Ʈ���� ��ġ������ ����
		la.setSize(50, 20); //���̺��� ũ�� 50x20 ����
		la.setLocation(30, 30); //���̺��� ��ġ (30, 30)���� ����
		c.add(la); //���̺� ������Ʈ ����
		
		setSize(250, 250);
		setVisible(true);
	}
	
	//Mouse ������ ����
	class MyMouseListener implements MouseListener{
		public void mousePressed(MouseEvent e) {
			int x = e.getX(); //���콺 Ŭ�� ��ǥ x
			int y = e.getY(); //���콺 Ŭ�� ��ǥ y
			la.setLocation(x, y); //���̺��� ��ġ�� (x, y)�� �̵�
		}
		//������� �ʴ� �޼��嵵 ��� �����ؾ� ��
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		
	}
	
	public static void main(String[] args) {
		new MouseListenerEx();
	}
	
}