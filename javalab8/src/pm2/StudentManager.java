package pm2;

import java.util.HashMap;
import java.util.Scanner;

//(�ǽ�2) �л� ���� �����ϰ� �˻��ϴ� ���α׷�
//1817022 ���̸�

public class StudentManager {

	public static void main(String[] args) {
		HashMap<String, SchoolInfo> student = new HashMap<String, SchoolInfo>();
		Scanner sin = new Scanner(System.in);
		System.out.println("�̸� �а� �й� ������ �л� 5���� ������ �Է��Ͻÿ�.");
		for (int i = 0; i < 5; i++) {
			String name = sin.next();
			String dept = sin.next();
			String schoolID = sin.next();
			SchoolInfo si = new SchoolInfo(dept, schoolID);
			student.put(name, si);
		}

		while (true) {
			System.out.print("�˻��� �л��� �̸��� �Է��Ͻÿ�. �������� �̸��� '��'�̶�� �Է��Ͻÿ�. ");
			String findName = sin.next();
			if (findName.contentEquals("��")) {
				System.out.println("�ȳ�!");
				break;
			}
			else {
				if (!student.containsKey(findName)) {
					System.out.println("�л��� �������� �ʽ��ϴ�.");
					sin = new Scanner(System.in);
				} else {
					System.out.println(findName + ">>" + student.get(findName).getDept() + "," + student.get(findName).getSchoolID());
					sin = new Scanner(System.in);
				}
			}
		}
		sin.close();
	}

}
