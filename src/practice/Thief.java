package practice;

public class Thief {
	String name;
	int hp;
	int mp;
	
	public Thief(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
	public Thief(String name, int hp) {
		this(name, hp, 40);
	}
	
	public Thief(String name) {
		this(name, 40, 5);
	}

	//baseHP = 25;
	//t =　アサカ, 40, 5, baseHp25
	//heal hp + baseHp = 65

}
