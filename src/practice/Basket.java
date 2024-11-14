package practice;

class Basket<E extends Fruit> {
	private E elem;
	private final int PRICE = 100;
	
	public Basket(E e) {
		elem = e;
	}
	
	public void replace(E e) {
		elem = e;
	}
	
	public E get() {
		return elem;
	}

	public void printName() {
		System.out.println("籠の中身は" + elem.getName() + "です");
	}
	
	public void printTotalPrice() {
		int totalPrice = PRICE + elem.getPrice();
		System.out.println(elem.getName() + "の入った籠は合計" + totalPrice + "円です。");
	}
}
