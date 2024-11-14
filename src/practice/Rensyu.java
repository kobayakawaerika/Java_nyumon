package practice;

public class Rensyu {
	public static void main(String[] args) {
		
		Greeting greeting = ()->{
			return "こんにちは";
		};
		
		System.out.println(greeting.hello());
		
	}

		}
