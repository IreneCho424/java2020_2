package pm1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//(�ǽ�1) Dvd shop ù ȭ�� GUI�� �����ϱ�
//1817022 ���̸�

public class DvdShopFrame extends JFrame { //ù ȭ�� - �޴� �����ִ� ȭ��
	public DvdShopFrame() {
		setTitle("���̸� DVD Shop");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container pane = getContentPane();
		
		JPanel panel = new JPanel();
		GridLayout grid = new GridLayout(3, 4);
		grid.setHgap(5);
		grid.setVgap(5);
		panel.setLayout(grid);

		//���� ��ư
		JButton b0 = new JButton("����");
		
		//�޴� ��ư
		JButton b1 = new JButton("�ű� ����");
		JButton b2 = new JButton("�� �˻�");
		JButton b3 = new JButton("��ü �� �˻�");
		JButton b4 = new JButton("�� ����");
		JButton b5 = new JButton("DVD ���");
		JButton b6 = new JButton("DVD �˻�");
		JButton b7 = new JButton("DVD ��ü �˻�");
		JButton b8 = new JButton("DVD ����");
		JButton b9 = new JButton("DVD �뿩");
		JButton b10 = new JButton("DVD �ݳ�");
		JButton b11 = new JButton("�뿩 ��� ��ü �˻�");
		JButton b12 = new JButton("�ݳ� �Ϸ� �뿩 ��� ����");
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(b10);
		panel.add(b11);
		panel.add(b12);

		pane.add(panel, BorderLayout.CENTER);
		
		//�޴� ��ư �Ʒ��� ���� ��ư �߰�
		pane.add(b0, BorderLayout.SOUTH);
		
		//dialog ����
		NewGuestDialog dlg = new NewGuestDialog(this);
		
		b1.addActionListener(new ActionListener() {
			//�ű� �� ���
			public void actionPerformed(ActionEvent e) {
				dlg.setVisible(true);
			}
		});
		
		
		pack();
		setVisible(true);

	}
	
	
	//main �Լ� - frame ��ü ����
	public static void main(String[] args) {
		DvdShopFrame dframe = new DvdShopFrame();
	}
	
}

//Dialog ����ϱ� ���� Ŭ����
class NewGuestDialog extends JDialog {
	
	JTextField t1 = new JTextField();
	JTextField t2 = new JTextField();
	JTextField t3 = new JTextField();
	JTextField t4 = new JTextField();
	JTextField t5 = new JTextField();
	
	JButton btn = new JButton("OK");
	
	public NewGuestDialog(JFrame frame) {
		super(frame, "�ű� ����");
		setSize(500, 300);
		
		Container c = getContentPane();

		GridLayout grid = new GridLayout(5, 2);
		grid.setVgap(5);
		
		JPanel panel = new JPanel();
		panel.setLayout(grid);
		
		panel.add(new JLabel("�̸�"));
		panel.add(t1);
		panel.add(new JLabel("�������"));
		panel.add(t2);
		panel.add(new JLabel("���̵�"));
		panel.add(t3);
		panel.add(new JLabel("�ּ�"));
		panel.add(t4);
		panel.add(new JLabel("��ȭ��ȣ"));
		panel.add(t5);
		
		c.add(panel, BorderLayout.CENTER);
		c.add(btn, BorderLayout.SOUTH);
		
		frame.pack();
		
	}
}
