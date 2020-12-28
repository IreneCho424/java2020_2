package ex1;

import java.io.File;

//(����1) File Ŭ���� - ���丮 �˻� �� ���� ��
//1817022 ���̸�

public class FileTest1 {

	public static void main(String[] args) {
		System.out.println("c: ����̺��� ��ü ���� ���");

		File file = new File("C:\\");
		String[] files = file.list();

		for (String fileName : files) {
			File subFile = new File(file, fileName);

			if (subFile.isDirectory())
				System.out.println("���丮 �̸� : " + fileName);
			else
				System.out.println("���� �̸� : " + fileName + ", ���� ũ�� : " + subFile.length() + "byte");
		}

		File makedir = new File("c:\\data");
		if (!makedir.exists())
			System.out.println("makedir�� ����");

		makedir.mkdir();
		if (makedir.exists())
			System.out.println("makedir�� ������");

		File renamedir = new File("c:\\newdata");
		makedir.renameTo(renamedir);

		if (renamedir.exists())
			System.out.println("makedir�� �̸��� �����");
		if (renamedir.delete())
			System.out.println("renamedir�� ���ŵ�");
	}

}
