package ex5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//(예제5) Dialog & Event Handling 예제
//1817022 조이린

public class DialogTest extends JFrame{
	
	MyDialog dlg;

	public DialogTest() {
		super("DialogEx 예제 프레임");
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
