package ex5;

import javax.swing.*;
import java.awt.*;

//(예제5) GridLayout 배치관리자 활용
//1817022 조이린

public class GridLayoutEx extends JFrame{

	public GridLayoutEx() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4, 2);
		grid.setVgap(5); //두 행 사이의 수직 간격이 5픽셀로 설정됨
		
		Container c = getContentPane();
		c.setLayout(grid);
		c.add(new JLabel("이름"));
		c.add(new JTextField(""));
		c.add(new JLabel("학번"));
		c.add(new JTextField(""));
		c.add(new JLabel("학과"));
		c.add(new JTextField(""));
		c.add(new JLabel("과목"));
		c.add(new JTextField(""));
		setSize(300, 200);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
