package practice;

class Peach extends Fruit {

	public Peach(String name, int price) {
		super(name, price);
	}

	protected String getName() {
		return name;
	}

	protected int getPrice() {
		return price;
	}

}
