package chapter16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h = new Hero("斉藤");
		
		Hero h2 = new Hero("鈴木");
		
		List<Hero> heros = new ArrayList<>();
		heros.add(h);
		heros.add(h2);
		
		for(Hero hlist : heros) {
			System.out.println(hlist.getName());
		}
		
		Map<Hero, Integer> heros2 = new HashMap<Hero, Integer>();
		heros2.put(h,3);
		heros2.put(h2,7);
		
		for(Hero key: heros2.keySet()) {
			int value = heros2.get(key);
			System.out.println(key.getName() + "が倒した敵=" + value);
		}
	}

}
