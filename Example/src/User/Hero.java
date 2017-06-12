package User;

import Manage.gameManager;

public class Hero {
	
	private String Name;
	private int HP = 50;
	private boolean alive=true;
	private int solve=0;
	private int unSolve=0;
	
	
	public int getSolve() {
		return solve;
	}
	public void setSolve(int solve) {
		this.solve = solve;
	}
	public int getUnSolve() {
		return unSolve;
	}
	public void setUnSolve(int unSolve) {
		this.unSolve = unSolve;
	}
	public void setName(String name) {
		if(name!=null)Name = name;
	}
	public String getName() {
		return Name;
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
	

	
	public void setAlive(boolean alive){
		this.alive=alive;
	}
	
	public boolean isAlive() {
		return this.alive;
	}

	

}
