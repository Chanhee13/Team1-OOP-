package User;

public class User {
	
	private String ID;
	private Hero hero;
	private boolean[] cleared; 
	
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
