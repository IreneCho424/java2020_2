package ex6;

//(����6) ���ʸ� �޼ҵ� ���
//1817022 ���̸�

public class ClientDemo {

	public static void main(String[] args) {
		Integer iarray[] = {1, 2, 3, 4, 5};
		Double darray[] = {11.0, 12.0, 13.0};
		String sarray[] = {"sun", "mon", "tue"};
		//PrintAllClass�� �޼ҵ� ȣ��
		PrintAllClass.printAll(iarray);
		PrintAllClass.printAll(darray);
		PrintAllClass.printAll(sarray);
		
		System.out.println();
		
		//PrintAllClass2�� �޼ҵ� ȣ��
		PrintAllClass2.printAll(iarray);
		PrintAllClass2.printAll(darray);
		PrintAllClass2.printAll(sarray);
		
	}

}
