package Monster;

public class ConditionSelectMonster extends SelectMonster implements ChangeCondition{

	@Override
	public void enhance() {
		
		super.setDamage(super.getDamage()*3);
		
	}



}
