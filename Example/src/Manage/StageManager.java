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
		return true; // 빈 메소드라 return true 해두었습니다.
	}
	
	public void setCleared()
	{
		System.out.println(isCleared()); // Test용으로 이렇게 해두었습니다.
	}
	

}
