package Monster;

public class ConditionSelectMonster extends SelectMonster implements ChangeCondition{

	@Override
	public void enhance() {
		
		super.setDamage(super.getDamage()*3);
		
	}

	@Override
	public void poison(){
		
		
		
	}
	


}
