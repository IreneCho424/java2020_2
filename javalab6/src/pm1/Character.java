package pm1;

//(�ǽ�1) ���� ĳ���� ����� �ǽ�
//1817022 ���̸�

public abstract class Character{
	private String charName;
	StringBuilder selectedCharacter = new StringBuilder();
	
	public Character() {};
	
	public Character(String charName){
		this.charName = charName;
	}
	
	public void setCharName(String charName) {
		this.charName = charName;
	}
	public abstract void characterSkill();
	public void appendCharacter() {
		selectedCharacter.append("+" + charName);
		System.out.println(selectedCharacter);
	};
}

class Monk extends Character{
	public Monk() {}
	
	public void characterSkill() {
		System.out.println("������ �����մϴ�.");
	}
}

class Archer extends Character{
	public Archer() {}
	
	public void characterSkill() {
		System.out.println("Ȱ ������ �����մϴ�.");
	}
}

class Wizard extends Character{
	public Wizard() {}
	
	public void characterSkill() {
		System.out.println("���� ������ �����մϴ�.");
	}
}

class Knight extends Character{
	public Knight() {}
	
	public void characterSkill() {
		System.out.println("Į ������ �����մϴ�.");
	}
}