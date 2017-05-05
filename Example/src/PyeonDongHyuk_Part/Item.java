package PyeonDongHyuk_Part;

// ������ Ŭ������ ��� �κе� �־ �ϴ� �̸� ���� �����ξ����ϴ�.

public class Item {
	
	private String Name;
	private int healingAmount;
	private int healAmount;
	private boolean available;
	
	//------------ getter & setter�� ��� �������� ���� �ϴ� ��� ����� �ξ����ϴ�.
	
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
		// Empty Method(�� �޼ҵ�)
	}


}
