package TeamProject;



// item Class 는 Composed 부분이 있어서 제가 미리 만들어두었습니다.(편동혁)

public class Item {
	
	private String Name;
	private int healingAmount;
	private int healAmount;
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
