package chapter13;

public class Wand {
	private String name;
	private double power;
	
	public String getName() {
		return this.name;
	}
	
	public double getPower() {
		return this.power;
	}
	
	public void setName(String name) {
		if(name.length() < 3 || name == null) {
			System.out.println("3文字以上入力してください");
			throw new IllegalArgumentException();
		}
		this.name = name;
	}
	
	public void setGetPower(double power) {
		if(power < 0.5 || power > 100) {
			throw new IllegalArgumentException("不正な数値です");
		}
		this.power = power;
	}

}
