package ex1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//(����1-1) ��ư �ؽ�Ʈ �ٲٱ�_�����ʸ� ������ Ŭ������ �ۼ�
//1817022 ���̸�

public class IndepClassListener extends JFrame {

	public IndepClassListener() {
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JButton btn = new JButton("Action"); // ��ư ��ġ
		btn.addActionListener(new MyActionListener()); // Action �̺�Ʈ ������ �ޱ�
		c.add(btn);

		setSize(350, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new IndepClassListener();
	}
}

//������ Ŭ������ �̺�Ʈ �����ʸ� �ۼ�
class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource(); //�̺�Ʈ �ҽ� ��ư �˾Ƴ���
		if(b.getText().equals("Action"))	//��ư�� ���ڿ��� "Action"���� ��
			b.setText("�׼�");		//��ư�� ���ڿ��� "�׼�"���� ����
		else
			b.setText("Action"); //��ư�� ���ڿ��� "Action"���� ����
	}
}
