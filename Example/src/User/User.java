package User;

import game.Stage_GUI;

public class User{
	
	private String ID;

	Hero hero;
	private boolean[] cleared={true,true,false,false,false,false}; 

	
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
	
	public boolean isCleared(int stage){
		return cleared[stage];
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
