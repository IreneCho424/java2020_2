package pm1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//(실습1) Dvd shop 첫 화면 GUI로 구성하기
//1817022 조이린

public class DvdShopFrame extends JFrame { //첫 화면 - 메뉴 보여주는 화면
	public DvdShopFrame() {
		setTitle("조이린 DVD Shop");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container pane = getContentPane();
		
		JPanel panel = new JPanel();
		GridLayout grid = new GridLayout(3, 4);
		grid.setHgap(5);
		grid.setVgap(5);
		panel.setLayout(grid);

		//종료 버튼
		JButton b0 = new JButton("종료");
		
		//메뉴 버튼
		JButton b1 = new JButton("신규 가입");
		JButton b2 = new JButton("고객 검색");
		JButton b3 = new JButton("전체 고객 검색");
		JButton b4 = new JButton("고객 삭제");
		JButton b5 = new JButton("DVD 등록");
		JButton b6 = new JButton("DVD 검색");
		JButton b7 = new JButton("DVD 전체 검색");
		JButton b8 = new JButton("DVD 삭제");
		JButton b9 = new JButton("DVD 대여");
		JButton b10 = new JButton("DVD 반납");
		JButton b11 = new JButton("대여 목록 전체 검색");
		JButton b12 = new JButton("반납 완료 대여 목록 삭제");
		
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
		
		//메뉴 버튼 아래에 종료 버튼 추가
		pane.add(b0, BorderLayout.SOUTH);
		
		//dialog 생성
		NewGuestDialog dlg = new NewGuestDialog(this);
		
		b1.addActionListener(new ActionListener() {
			//신규 고객 등록
			public void actionPerformed(ActionEvent e) {
				dlg.setVisible(true);
			}
		});
		
		
		pack();
		setVisible(true);

	}
	
	
	//main 함수 - frame 객체 생성
	public static void main(String[] args) {
		DvdShopFrame dframe = new DvdShopFrame();
	}
	
}

//Dialog 사용하기 위한 클래스
class NewGuestDialog extends JDialog {
	
	JTextField t1 = new JTextField();
	JTextField t2 = new JTextField();
	JTextField t3 = new JTextField();
	JTextField t4 = new JTextField();
	JTextField t5 = new JTextField();
	
	JButton btn = new JButton("OK");
	
	public NewGuestDialog(JFrame frame) {
		super(frame, "신규 가입");
		setSize(500, 300);
		
		Container c = getContentPane();

		GridLayout grid = new GridLayout(5, 2);
		grid.setVgap(5);
		
		JPanel panel = new JPanel();
		panel.setLayout(grid);
		
		panel.add(new JLabel("이름"));
		panel.add(t1);
		panel.add(new JLabel("생년월일"));
		panel.add(t2);
		panel.add(new JLabel("아이디"));
		panel.add(t3);
		panel.add(new JLabel("주소"));
		panel.add(t4);
		panel.add(new JLabel("전화번호"));
		panel.add(t5);
		
		c.add(panel, BorderLayout.CENTER);
		c.add(btn, BorderLayout.SOUTH);
		
		frame.pack();
		
	}
}
