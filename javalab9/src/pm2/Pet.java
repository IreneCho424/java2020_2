package pm2;

import java.io.Serializable;

//(�ǽ�2) �ֿϰ� ���� ���α׷� Pet Ŭ����
//1817022 ���̸�

public class Pet implements Serializable{	//����ȭ�� ���� implements Serializable
	private String name;
	private int age;
	private double weight;
	
	public Pet() {}
	public Pet(String name, int age, double weight) {
		setPet(name, age, weight);
	}
	
	public void setPet(String newName, int newAge, double newWeight) {
		this.name = newName;
		this.age = newAge;
		this.weight = newWeight;
	}
	public void setName(String newName) {
		this.name = newName;
	}
	public void setAge(int newAge) {
		this.age = newAge;
	}
	public void setWeight(double newWeight) {
		this.weight = newWeight;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getWeight() {
		return weight;
	}
}
