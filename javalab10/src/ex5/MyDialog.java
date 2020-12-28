package ex5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//(����5) Dialog & Event Handling ����
//1817022 ���̸�

class MyDialog extends JDialog{
	JTextField txtName = new JTextField(10);
	JButton btnOk = new JButton("OK");
	
	public MyDialog(JFrame frame, String title) {
		super(frame, title);
		setLayout(new FlowLayout());
		add(txtName);
		add(btnOk);
		setSize(200, 100);
		
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = txtName.getText(); //TextField ��ü�� �Է��� ���� String���� �о���� �޼ҵ�
				JOptionPane.showMessageDialog(frame, "Your name is " + s);
				setVisible(false);
			}
		});
	}
}
