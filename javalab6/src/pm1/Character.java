package pm1;

//(실습1) 게임 캐릭터 만들기 실습
//1817022 조이린

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
		System.out.println("힐링이 가능합니다.");
	}
}

class Archer extends Character{
	public Archer() {}
	
	public void characterSkill() {
		System.out.println("활 공격이 가능합니다.");
	}
}

class Wizard extends Character{
	public Wizard() {}
	
	public void characterSkill() {
		System.out.println("마법 공격이 가능합니다.");
	}
}

class Knight extends Character{
	public Knight() {}
	
	public void characterSkill() {
		System.out.println("칼 공격이 가능합니다.");
	}
}