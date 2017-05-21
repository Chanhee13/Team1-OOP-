package User;

import game.Item;

public class Hero {
	
	private String Name;
	private boolean Gender; 
	private int HP = 50;
	Item[] item; // Composed to 의 경우에 Private 해야될지 헷갈려서 일단 이렇게 두었습니다.
	
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

	public Item[] getItem() {
		return item;
	}

	public void setItem(Item[] item) {
		this.item = item;
	}

	
	public static Object pickSolution(Object o){
		return o;
	}
	
	public void useitem()
	{
		// Empty Method(빈 메소드)
	}
	
	//------------ getter & setter 부분은 Name이랑 Gender만 설정해두었습니다.
	
	
	
	

}
