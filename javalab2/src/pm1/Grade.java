package pm1;

//(실습1) 성적 관리 class
//1817022 조이린

public class Grade{
	private int math;
	private int science;
	private int english;
	
	public Grade(int math, int science, int english){
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	public double average() {		//세 과목의 평균 구하여 리턴하는 메소드
		double average = (this.math + this.science + this.english) / 3.0;
		return average;
	}
}