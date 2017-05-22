package Monster;

public class ConditionOXMonster extends OXMonster implements ChangeCondition{

	@Override
	public void enhance() {
		
		super.setDamage(super.getDamage()*3);
	}
	@Override
	public void poison(){
		
		
		
	}
	

}
