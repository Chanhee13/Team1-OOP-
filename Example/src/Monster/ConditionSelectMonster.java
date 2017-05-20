package Monster;

public class ConditionSelectMonster extends SelectMonster implements ChangeCondition{

	@Override
	public void enhance() {
		
		super.setdamage(super.getdamage()*3);
		
	}



}
