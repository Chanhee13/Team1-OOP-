package game;

// item Class 는 Composed 부분이 있어서 제가 미리 만들어두었습니다.(편동혁)

public class Item {
	
	private String Name;
	private int healingAmount;
	private boolean available;
	
	//------------ getter & setter는 일단 이렇게 정해두었습니다.
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		if(name!=null&&name!="")
		Name = name;
	}

	public int getHealingAmount() {
		return healingAmount;
	}

	public void setHealingAmount(int healingAmount) {
		if(healingAmount>0)
		this.healingAmount = healingAmount;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public boolean beUsed(){ //우선 아이템 쓴 것을 T로 정하고 임시로 만들어 둠 
		// Empty Method(빈 메소드)
	boolean a=true;
	return a;
	}

}
