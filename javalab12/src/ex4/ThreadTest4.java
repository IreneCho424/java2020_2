package ex4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//(����4) Ÿ�̸� ������ - Ÿ�̸Ӵ� �ٸ� UI�� ������� �ð��� ��� ǥ�õ�
//1817022 ���̸�

class TimerThread extends Thread{
	private JLabel timerLabel; //Ÿ�̸� ���� ��µǴ� ���̺�
	
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel; //Ÿ�̸� ī��Ʈ�� ����� ���̺�
	}
	//������ �ڵ�. run()�� �����ϸ� ������ ����
	
	public void run() {
		int n = 0; //Ÿ�̸� ī��Ʈ ��;
		while(true) {
			timerLabel.setText(Integer.toString(n)); //���̺� ī��Ʈ �� ���
			n++; //ī��Ʈ ����
			try {
				Thread.sleep(1000); //1�� ���� ���� �ܴ�.
			}catch(InterruptedException e) {
				return; //���ܰ� �߻��ϸ� ������ ����
			}
		}
	}
}

class MyFrame extends JFrame{
	private int cnt = 1; //��ư�� Ŭ���� ������ ī��Ʈ�� ����
	
	public MyFrame() {
		setTitle("Thread�� ��ӹ��� Ÿ�̸� ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		getContentPane().setLayout(new BorderLayout(0,0)); //BorderLayout���� ������Ʈ ����
		
		//Ÿ�̸� ���� ����� ���̺� ����
		JLabel timerLabel = new JLabel();
		timerLabel.setHorizontalAlignment(SwingConstants.CENTER);
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel, BorderLayout.CENTER); //BorderLayout: �߾ӿ� ��ġ
		
		//Ÿ�̸� ������ ��ü ����. Ÿ�̸� ���� ����� ���̺��� �����ڿ� ����
		TimerThread th = new TimerThread(timerLabel);
		
		setSize(300, 270);
		setVisible(true);
		
		th.start(); //Ÿ�̸� �������� ������ �����ϰ� �Ѵ�. ==> run �޼��尡 ȣ���
		
		//��ư ����
		JButton btn = new JButton();
		//��ư Ŭ�� �� ������ ������ ���: �����ʴ� �͸�Ŭ������ ����
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = String.format("���� %d ��° ��ư�� Ŭ���߽��ϴ�.", cnt++);
				JOptionPane.showMessageDialog(null, s);
			}
		});
		
		btn.setText("Click me!");
		c.add(btn, BorderLayout.SOUTH); //BorderLayout: �ϴܿ� ��ġ
	}
}


public class ThreadTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}
