package ex5;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

//(예제5) 자동차 경주
//1817022 조이린

class RaceThread extends Thread{
	private JLabel label;
	private int x, y;
	private JFrame frame;
	
	public RaceThread(JFrame frame, String fname, int x, int y) {
		this.frame = frame;
		this.x = x;
		this.y = y;
		
		label = new JLabel();
		label.setIcon(new ImageIcon(fname));
		label.setBounds(x, y, 120, 100);
		this.frame.add(label);
	}
	
	public void run() {
		for (int i = 0; i < 200; i++) {
			x += 10*Math.random();
			label.setBounds(x, y, 120, 100);
			frame.repaint();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

public class CarGame extends JFrame{
	
	public CarGame() {
		setTitle("CarRace");
		setSize(1600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null); //absolute layout(절대좌표로 위치 지정)
		
		//세 대의 자동차 경주를 위한 스레드 세개 생성
		RaceThread car1 = new RaceThread(this, "car1.png", 100, 0);
		RaceThread car2 = new RaceThread(this, "car2.png", 100, 80);
		RaceThread car3 = new RaceThread(this, "car3.png", 100, 160);
		
		car1.start();
		car2.start();
		car3.start();
		
		setVisible(true);
	}

	public static void main(String[] args) {
		CarGame t = new CarGame();
	}

}
