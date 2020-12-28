package ex3;

//(����3) ��ü ���� ���� ���� ����
//1817022 ���̸�

public class DObjectDemo{
	public static void main(String[] args) {
		DObject start, n, obj;
		start = new Line();			//1�� Line ��ü ����
		n = start;
		
		obj = new Rect();			//2�� Rect ��ü ����
		n.next = obj; 				//1�� Line -> 2�� Rect ����
		n = obj;

		obj = new Line();			//3�� Line ��ü ����
		n.next = obj;				//2�� Rect -> 3�� Line ����
		n = obj;
		
		obj = new Circle();			//4�� Circle ��ü ����
		n.next = obj;				//3�� Line -> 4�� Circle ����
		
		while(start != null) {
			start.draw();
			start = start.next;
		}
	}
}