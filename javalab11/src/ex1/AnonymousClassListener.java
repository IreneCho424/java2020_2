package ex1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//(����1-2) ��ư �ؽ�Ʈ �ٲٱ�_�����ʸ� �͸� Ŭ������ �ۼ�
//1817022 ���̸�

public class AnonymousClassListener extends JFrame {

	public AnonymousClassListener() {
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JButton btn = new JButton("Action"); // ��ư ��ġ
		btn.addActionListener(new MyActionListener() { //anonymous class open block
			public void actionPerformed(ActionEvent e) {	//actionPerformed open block
				JButton b = (JButton)e.getSource();
				if(b.getText().contentEquals("Action"))
					b.setText("�׼�");
				else
					b.setText("Action");
				
				//AnonymousClassListener�� ����� JFrame�� ����� ȣ���� �� ����
				setTitle(b.getText());
			} //actionPerformed close block
		} );
		c.add(btn);

		setSize(350, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new AnonymousClassListener();
	}
}
