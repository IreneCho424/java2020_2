package pm1;

//(�ǽ�1) ���� ���� class
//1817022 ���̸�

public class Grade{
	private int math;
	private int science;
	private int english;
	
	public Grade(int math, int science, int english){
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	public double average() {		//�� ������ ��� ���Ͽ� �����ϴ� �޼ҵ�
		double average = (this.math + this.science + this.english) / 3.0;
		return average;
	}
}