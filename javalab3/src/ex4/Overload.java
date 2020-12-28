package ex4;

//(����4) ����� ���ϴ� ���α׷� ���� - overloading�� ���
//1817022 ���̸�

public class Overload{
	
	public static void main(String[] args) {
		double avg1 = Overload.getAverage(40.0, 50.0);
		double avg2 = Overload.getAverage(1.0, 2.0, 3.0);
		char avg3 = Overload.getAverage('a', 'c');
		
		System.out.println("average1 = " + avg1);
		System.out.println("average2 = " + avg2);
		System.out.println("average3 = " + avg3);
	}
	
	public static double getAverage(double n1, double n2) {
		return(n1+n2) / 2.0;
	}
	
	public static double getAverage(double n1, double n2, double n3) {
		return(n1+n2+n3) / 3.0;
	}
	
	public static char getAverage(char c1, char c2) {
		return(char)(((int)c1 + (int)c2) / 2);
	}
}