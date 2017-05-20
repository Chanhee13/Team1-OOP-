package Monster;

public class ConditionTypeMonster extends TypeMonster implements ChangeCondition{

	@Override
	public void enhance() {
		
		super.setDamage(super.getDamage()*3);
		
	}



}
