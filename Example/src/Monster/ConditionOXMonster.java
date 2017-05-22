package Monster;
public class ConditionOXMonster extends OXMonster implements ChangeCondition{

	@Override
	public void enhance() {
		
	super.setHP(super.getHP()*3);
		
	}
	@Override
	public void poison(){
		
		super.setDamage(super.getDamage()*3);
		
	}
	
	

}
