package pm2;

//(실습2) 학생 정보(학과, 학번) 저장하기 위한 클래스
//1817022 조이린

public class SchoolInfo {
	private String dept;
	private String SchoolID;

	public SchoolInfo(String dept, String SchoolID) {
		this.dept = dept;
		this.SchoolID = SchoolID;
	}

	public String getDept() {
		return dept;
	}

	public String getSchoolID() {
		return SchoolID;
	}
}
