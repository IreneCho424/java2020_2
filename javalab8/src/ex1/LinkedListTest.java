package ex1;

import java.util.LinkedList;

//(����1) LinkedList �Լ� Ȱ��
//1817022 ���̸�

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> lnkList = new LinkedList<String>();
		lnkList.add("SM5");
		lnkList.add("�ҳ�Ÿ");
		lnkList.offer("�ƿ��");
		lnkList.offer("��Ƽ��");
		
		for (int i = 0; i < lnkList.size(); i++) {
			System.out.println(lnkList.get(i));
		}
		System.out.println();
		
		lnkList.add(2, "���ʽý�");
		
		for (int i = 0; i < lnkList.size(); i++) {
			System.out.println(lnkList.get(i));
		}
		System.out.println();
		
		lnkList.remove(3);
		
		for (int i = 0; i < lnkList.size(); i++) {
			System.out.println(lnkList.get(i));
		}
		System.out.println();
		
		System.out.println("peek ==> " + lnkList.peek());
		//System.out.println("element ==> " + lnkList.element()); //peek�� ���� �۾�
		for (int i = 0; i < lnkList.size(); i++) {
			System.out.println(lnkList.get(i));
		}
		System.out.println();
		
		System.out.println("poll ==> " + lnkList.poll());
		//System.out.println("remove ==> " + lnkList.remove());	//poll�� ���� �۾�
		for (int i = 0; i < lnkList.size(); i++) {
			System.out.println(lnkList.get(i));
		}
		System.out.println();

	}

}
