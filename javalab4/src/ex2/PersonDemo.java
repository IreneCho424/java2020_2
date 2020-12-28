package ex2;

//(���� 2) PersonŬ���� �̿��ϴ� ���� 
//1817022 ���̸�

public class PersonDemo{
	
	public static void main(String[] args) {
		Professor gil = new Professor("Hong, GilDong");		//Professor ��ü ����
		gil.setPhone("011-1234-5678");
		System.out.println(gil.getPhone());
		
		Person hong = gil;									//Person ��ü ���� - gil�� ���� ����(Professor)
		System.out.println(hong.getPhone());
		
		System.out.println();
		
		Person na = new Student("Na, Ewha");				//Person ��ü ���� - Student ��ĳ����
		na.setPhone("010-4321-9876");
		System.out.println(na.getPhone());
		
		System.out.println();
		
		whoAmI("hong", hong);
		whoAmI("na", na);
	}
	
	public static void whoAmI(String instname, Person who) {	//���� ����ϴ� �Լ�. Person Ŭ������ toString() �Լ� ȣ���Ͽ� ���
		System.out.println(instname + " info: " + who.toString());
		
		if(who instanceof Professor) {
			System.out.println(instname + " is instance of \"Professor\" Class.");
		}
		if(who instanceof Student) {
			System.out.println(instname + " is instance of \"Student\" Class.");
		}
		
		System.out.println();
	}
}