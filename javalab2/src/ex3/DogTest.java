package ex3;

//(����3) Dog Ŭ������ ��ü d1, d2
//1817022 ���̸�


public class DogTest{
	public static void main(String[] args) {
		int a = 10, b = 20;
		
		Dog d1 = new Dog();
		d1.setName("Happy");
		
		Dog d2 = new Dog();
		d2.setName("Jong");
		
		//before assignment
		System.out.println("Before Change ");
		System.out.println("a�� ���� " + a + " b�� ���� " + b);
		d1.run(); d2.run();
		
		//assignment
		a = b;
		b = 30;
		d1 = d2; 
		d2.setName("Dot");
		
		System.out.println();
		//after assignment
		System.out.println("After Change ");
		System.out.println("a�� ���� " + a + " b�� ���� " + b);
		d1.run(); d2.run();
	}
}