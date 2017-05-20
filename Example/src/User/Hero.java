package User;

import game.Item;

public class Hero {
	
	private String Name;
	private boolean Gender; 
	private int HP;
	Item[] item; // Composed to 의 경우에 Private 해야될지 헷갈려서 일단 이렇게 두었습니다.
	
	public void setName(String name) {
		if(name!=null)Name = name;
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

	
	static public Object pickSolution()
	{
		return 0; // 일단 어떻게 넣을지는 정해져있지 않아서 오류 방지를 위해서 return 0 했습니다.
	}
	
	public void useitem()
	{
		// Empty Method(빈 메소드)
	}
	
	//------------ getter & setter 부분은 Name이랑 Gender만 설정해두었습니다.
	
	public String getName() {
		return Name;
	}
	
	

}
