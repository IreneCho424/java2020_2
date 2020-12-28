package ex2;

//(예제 2) Person클래스 이용하는 메인 
//1817022 조이린

public class PersonDemo{
	
	public static void main(String[] args) {
		Professor gil = new Professor("Hong, GilDong");		//Professor 객체 생성
		gil.setPhone("011-1234-5678");
		System.out.println(gil.getPhone());
		
		Person hong = gil;									//Person 객체 생성 - gil의 정보 대입(Professor)
		System.out.println(hong.getPhone());
		
		System.out.println();
		
		Person na = new Student("Na, Ewha");				//Person 객체 생성 - Student 업캐스팅
		na.setPhone("010-4321-9876");
		System.out.println(na.getPhone());
		
		System.out.println();
		
		whoAmI("hong", hong);
		whoAmI("na", na);
	}
	
	public static void whoAmI(String instname, Person who) {	//정보 출력하는 함수. Person 클래스의 toString() 함수 호출하여 출력
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