package game;



// item Class �� Composed �κ��� �־ ���� �̸� �����ξ����ϴ�.(����)

public class Item {
	
	private String Name;
	private int healingAmount;
	private boolean available;
	
	//------------ getter & setter�� �ϴ� �̷��� ���صξ����ϴ�.
	
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

	public void Beused(){
		// Empty Method(�� �޼ҵ�)
	}


}
