package User;


public class Hero {
	
	private String Name;
	private boolean Gender; 
	private int HP = 50;

	
	public void setName(String name) {
		if(name!=null)Name = name;
	}
	public String getName() {
		return Name;
	}
	
	public boolean isGender() {
		return Gender;
	}

	public void setGender(boolean gender) {
		Gender = gender;
	}
	
	public int getHP() {
		return HP;
	}

	public void setHP(int HP) {
		this.HP = HP;
	}
	
	public static Object pickSolution(Object o){
		return o;
	}
	
	public void useitem()
	{
		// Empty Method(�� �޼ҵ�)
	}
	
	//------------ getter & setter �κ��� Name�̶� Gender�� �����صξ����ϴ�.
	
	
	
	

}
