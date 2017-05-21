package Monster;

import game.Item;

public class ItemSelectMonster extends SelectMonster implements ItemThrowable {
	static Item item;
	static int i = 1;
	static void setItem(){
		item.setName("portion "+i);
		i++;
		item.setHealingAmount(15);
		item.setAvailable(false);
	}
	
	@Override
	public Item ItemThrow() {
		item.setAvailable(true);
		return item;
	}
}
