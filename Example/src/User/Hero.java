package User;

import Manage.gameManager;

public class Hero {
	
	private String Name;
	private boolean Gender; 
	private int HP = 50;
	private boolean alive=true;
	
	
	public void setName(String name) {
		if(name!=null)Name = name;
	}
	public String getName() {
		return Name;
	}
	//
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
		if(this.HP<=0){
			this.setAlive(false);
		}
		
	}

	
	public static Object pickSolution(Object o){
		return o;
	}
	
	public void useitem()
	{
		// Empty Method(�� �޼ҵ�)
	}
	
	public void setAlive(boolean alive){
		this.alive=alive;
	}
	
	public boolean isAlive() {
		return this.alive;
	}
	
	//------------ getter & setter �κ��� Name�̶� Gender�� �����صξ����ϴ�.
	

}
