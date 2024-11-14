package practice;

import java.util.Random;

public class Cleric {
	private String name;
	private int hp = 50;
	public final int MAX_HP = 50;
	private int mp = 10;
	public final int MAX_MP = 10;
	
	public void selfAid() {
		System.out.println("セルフエイドは魔法を唱えた！");
		this.mp -= - 5;
		this.hp = this.MAX_HP;
		System.out.println("魔力を5消費した");
	}
		
		public int pray(int sec) {
			System.out.println("セルフエイドは祈った！");
			int recover = new Random().nextInt(3) + sec;
			int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
			this.mp += recoverActual;
			return recoverActual;

	}

}
