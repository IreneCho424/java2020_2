package ex3;

import java.util.Iterator;
import java.util.Vector;

//(����3) Iterator�� �̿��� ���� �˻�
//1817022 ���̸�

public class VectorTest {

	public static void main(String[] args) {
		Vector<String> vt = new Vector<String>();
		vt.add("����");
		vt.add("��õ");
		vt.add("����");
		vt.add("�뱸");
		vt.add("�λ�");
		
		for (int i = 0; i < vt.size(); i++) {
			System.out.println("vt.get(" + i + ") = " + vt.get(i));
		}
		System.out.println();
		
		System.out.println("Iterator�� ��� ���");
		Iterator<String> it = vt.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		System.out.println("foreach�� ��� ���");
		
		for(String s : vt) {
			System.out.println(s);
		}
	}

}
