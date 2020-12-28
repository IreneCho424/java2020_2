package pm2;

import java.io.Serializable;

//(�ǽ�2) �ֿϰ� ���� ���α׷� Dog Ŭ����
//1817022 ���̸�

public class Dog extends Pet implements Serializable {
	private String breed;
	private boolean boosterShot;
	
	public Dog() {}
	public Dog(String name, int age, double weight, String breed, boolean boosterShot) {
		super(name, age, weight);
		setBreed(breed);
		setBoosterShot(boosterShot);
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public void setBoosterShot(boolean boosterShot) {
		this.boosterShot = boosterShot;
	}
	public String getBreed() {
		return breed;
	}
	public boolean getBoosterShot() {
		return boosterShot;
	}
	@Override
	public String toString() {	//��ü ���� ���
		char bShot;
		if(getBoosterShot() == true) {
			bShot = 'O';
		}
		else {
			bShot = 'X';
		}
		return getName() + "\t" + getAge() + "\t" + getWeight() + "\t" + breed + "\t\t" + bShot;
	}
	
	
}
