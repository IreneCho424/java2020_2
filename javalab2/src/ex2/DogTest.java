package ex2;

//(예제2) Dog 클래스의 객체 d
//1817022 조이린

public class DogTest{
	public static void main(String[] args) {
		Dog d = new Dog();
		d.setSize(30);
		d.bark(3);
		d.setSize(0);
		d.bark(3);
		d.setSize(15);
		d.bark(3);
		d.setSize(50);
		d.bark(3);
		
		System.out.println("Dog one: " + d.getSize());
	}
}