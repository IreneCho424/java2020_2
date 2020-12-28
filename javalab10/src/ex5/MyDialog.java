package ex5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//(예제5) Dialog & Event Handling 예제
//1817022 조이린

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
				String s = txtName.getText(); //TextField 객체에 입력한 값을 String으로 읽어오는 메소드
				JOptionPane.showMessageDialog(frame, "Your name is " + s);
				setVisible(false);
			}
		});
	}
}
