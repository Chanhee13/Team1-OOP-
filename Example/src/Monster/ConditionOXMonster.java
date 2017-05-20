package Monster;

public class ConditionOXMonster extends OXMonster implements ChangeCondition{

	@Override
	public void enhance() {
		
		super.setdamage(super.getdamage()*2);
	}
	

}
