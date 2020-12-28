package pm2;

import java.util.HashMap;
import java.util.Scanner;

//(실습2) 학생 정보 저장하고 검색하는 프로그램
//1817022 조이린

public class StudentManager {

	public static void main(String[] args) {
		HashMap<String, SchoolInfo> student = new HashMap<String, SchoolInfo>();
		Scanner sin = new Scanner(System.in);
		System.out.println("이름 학과 학번 순서로 학생 5명의 정보를 입력하시오.");
		for (int i = 0; i < 5; i++) {
			String name = sin.next();
			String dept = sin.next();
			String schoolID = sin.next();
			SchoolInfo si = new SchoolInfo(dept, schoolID);
			student.put(name, si);
		}

		while (true) {
			System.out.print("검색할 학생의 이름을 입력하시오. 끝내려면 이름을 '끝'이라고 입력하시오. ");
			String findName = sin.next();
			if (findName.contentEquals("끝")) {
				System.out.println("안녕!");
				break;
			}
			else {
				if (!student.containsKey(findName)) {
					System.out.println("학생이 존재하지 않습니다.");
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
