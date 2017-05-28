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
		// Empty Method(빈 메소드)
	}
	
	//------------ getter & setter 부분은 Name이랑 Gender만 설정해두었습니다.
	
	
	
	

}
