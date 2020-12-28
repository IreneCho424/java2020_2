package ex5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//(����5) Dialog & Event Handling ����
//1817022 ���̸�

public class DialogTest extends JFrame{
	
	MyDialog dlg;

	public DialogTest() {
		super("DialogEx ���� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("Show Dialog");
		dlg = new MyDialog(this, "Test Dialog");
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dlg.setVisible(true);
			}
		});
		
		getContentPane().add(btn);
		setSize(250, 200);
		setVisible(true);
		
	}
	
	//Launch the application
	public static void main(String[] args) {
		DialogTest dtest = new DialogTest();
	}

}
