package ex4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//(예제4) 타이머 스레드 - 타이머는 다른 UI와 상관없이 시간이 계속 표시됨
//1817022 조이린

class TimerThread extends Thread{
	private JLabel timerLabel; //타이머 값이 출력되는 레이블
	
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel; //타이머 카운트를 출력할 레이블
	}
	//스레드 코드. run()이 종료하면 스레드 종료
	
	public void run() {
		int n = 0; //타이머 카운트 값;
		while(true) {
			timerLabel.setText(Integer.toString(n)); //레이블에 카운트 값 출력
			n++; //카운트 증가
			try {
				Thread.sleep(1000); //1초 동안 잠을 잔다.
			}catch(InterruptedException e) {
				return; //예외가 발생하면 스레드 종료
			}
		}
	}
}

class MyFrame extends JFrame{
	private int cnt = 1; //버튼을 클릭할 때마다 카운트할 변수
	
	public MyFrame() {
		setTitle("Thread를 상속받은 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		getContentPane().setLayout(new BorderLayout(0,0)); //BorderLayout으로 컴포넌트 조정
		
		//타이머 값을 출력할 레이블 생성
		JLabel timerLabel = new JLabel();
		timerLabel.setHorizontalAlignment(SwingConstants.CENTER);
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel, BorderLayout.CENTER); //BorderLayout: 중앙에 배치
		
		//타이머 스레드 객체 생성. 타이머 값을 출력할 레이블을 생성자에 전달
		TimerThread th = new TimerThread(timerLabel);
		
		setSize(300, 270);
		setVisible(true);
		
		th.start(); //타이머 스레드의 실행을 시작하게 한다. ==> run 메서드가 호출됨
		
		//버튼 생성
		JButton btn = new JButton();
		//버튼 클릭 시 실행할 리스너 등록: 리스너는 익명클래스로 정의
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = String.format("현재 %d 번째 버튼을 클릭했습니다.", cnt++);
				JOptionPane.showMessageDialog(null, s);
			}
		});
		
		btn.setText("Click me!");
		c.add(btn, BorderLayout.SOUTH); //BorderLayout: 하단에 배치
	}
}


public class ThreadTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}
