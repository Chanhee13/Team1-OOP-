package PyeonDongHyuk_Part;

public class User {
	
	private String ID;
	Hero hero;
	private boolean[] cleared; 
	
	
	public Hero MakeHero()
	{
		return hero; // 아직 정해져있지 않아 return hero 해두었습니다.
	}
	
	//------------ getter & setter 부분 구체적으로는 정하지 않았습니다.
	
	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		if(iD!=null)
		ID = iD;
	}


	public boolean[] getCleared() {
		return cleared;
	}


	public void setCleared(boolean[] cleared) {
		this.cleared = cleared;
	}

	public Hero getHero() {
		return hero;
	}

	public void setHero(Hero hero) {
		this.hero = hero;
	}
	
	
	
	

}
