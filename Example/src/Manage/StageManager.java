package Manage;



public class StageManager {
	
	private int picked;
	
	
	public int getPicked() {
		return picked;
	}

	public void setPicked(int picked) {
		this.picked = picked;
	}

	public boolean isCleared()
	{
		return true; // �� �޼ҵ�� return true �صξ����ϴ�.
	}
	
	public void setCleared()
	{
		System.out.println(isCleared()); // Test������ �̷��� �صξ����ϴ�.
	}
	

}
