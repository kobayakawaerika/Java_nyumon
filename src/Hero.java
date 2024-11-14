import java.util.HashMap;
import java.util.Map;

public class Hero {
	private String name;
	public Hero(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public static void main(String[] args) {
		Hero saitou = new Hero("斉藤");
		Hero suzuki = new Hero("鈴木");
		
		Map<Hero, Integer> attack = new HashMap<Hero, Integer>();
		attack.put(saitou, 3);
		attack.put(suzuki, 7);
		
		for(Hero key: attack.keySet()) {
			int value = attack.get(key);
			System.out.println(key.getName() + "が倒した敵=" + value);
		}
		

		}
	
}


