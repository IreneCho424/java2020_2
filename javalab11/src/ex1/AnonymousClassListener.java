package ex1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//(예제1-2) 버튼 텍스트 바꾸기_리스너를 익명 클래스로 작성
//1817022 조이린

public class AnonymousClassListener extends JFrame {

	public AnonymousClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JButton btn = new JButton("Action"); // 버튼 배치
		btn.addActionListener(new MyActionListener() { //anonymous class open block
			public void actionPerformed(ActionEvent e) {	//actionPerformed open block
				JButton b = (JButton)e.getSource();
				if(b.getText().contentEquals("Action"))
					b.setText("액션");
				else
					b.setText("Action");
				
				//AnonymousClassListener의 멤버나 JFrame의 멤버를 호출할 수 있음
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
