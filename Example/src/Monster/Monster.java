package Monster;
import Information.*;
import Manage.gameManager;

import java.util.*;

public abstract class Monster {
	static int i =0;
	private String name = "monster "+i;
	private int HP=0;
	private int damage=5;
	private ArrayList<Assignment> assignments = new ArrayList<Assignment> ();
	
	Monster(){
		i++;
	}
	public void addAssignment(Assignment e){
		assignments.add(e);
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHP() {
		return HP;
	}
	
	public void setHP(int HP) {
		this.HP = HP;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	//������� ���� getter�� setter ����
	
	public ArrayList<Assignment> getAssignment() {
		return assignments;
	}

	public void setAssignment(ArrayList<Assignment> assignment) {
		 int stage = gameManager.getRecentStage();
		 Information info = new Information(stage);
		 this.assignments = info.getAssingments();
	}

	public Assignment askProblem()
	{
		int prb = gameManager.getRecentProblem();
		Assignment ass = assignments.get(prb);
		System.out.println(ass.getProblem());
		return ass;
	}
	

	abstract public boolean isCorrect(Object o);

	
	
	public boolean isDead() {
		if( this.getHP() <= 0) {
			return true;
		}
		else {
			return false;
		}
	}
}