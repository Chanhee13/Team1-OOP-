package Monster;

public class ConditionTypeMonster extends TypeMonster implements ChangeCondition{

	@Override
	public void enhance() {
		
		super.setdamage(super.getdamage()*3);
		
	}



}
