package Monster;

public class ConditionTypeMonster extends TypeMonster implements ChangeCondition{

	@Override
	public void enhance() {
		
	super.setHP(super.getHP()*3);
		
	}

	@Override
	public void poison(){
		
		super.setDamage(super.getDamage()*3);
		
	}
	


}
