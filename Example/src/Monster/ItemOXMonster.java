package Monster;

import game.Item;

public class ItemOXMonster extends OXMonster implements ItemThrowable{
	Item item;

	@Override
	public void ItemThrow() {
		
		item = new Item();
		
	}
	
}
