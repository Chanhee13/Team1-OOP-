package TeamProject;



// 아이템 클래스는 Composed 부분이 있어서 미리 만들어두었습니다.

public class Item {
	
	private String Name;
	private int healingAmount;
	private int healAmount;
	private boolean available;
	
	//------------ getter & setter를 어떻게 지정할지 몰라서 일단 모두 만들어 두었습니다.
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		if(name!=null)
		Name = name;
	}

	public int getHealingAmount() {
		return healingAmount;
	}

	public void setHealingAmount(int healingAmount) {
		if(healingAmount>0)
		this.healingAmount = healingAmount;
	}

	public int getHealAmount() {
		return healAmount;
	}

	public void setHealAmount(int healAmount) {
		if(healAmount>0)
		this.healAmount = healAmount;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public void Beused(){
		// Empty Method(빈 메소드)
	}


}
