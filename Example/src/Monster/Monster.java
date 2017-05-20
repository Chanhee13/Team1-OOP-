package Monster;
import Information.*;
import Manage.gameManager;

import java.util.*;

public abstract class Monster {
	private String name;
	private int HP;
	private int damage;
	protected ArrayList<Assignment> assignments = new ArrayList<Assignment> ();
	
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
			
			//To Do:
			//		
			//		Information File ��ġ�� ��ȸ�ϸ鼭 Stage�� �´� Information�� ��� �ɴϴ�.
		 this.assignments = info.getAssingment();
	}

	public void askProblem()
	{
		int prb = gameManager.getRecentProblem();
		Assignment ass = assignments.get(prb);
		System.out.println(ass.getProblem());
	}
	
	abstract public boolean isCorrect();

	
	public boolean isDead() {
		if( this.getHP() <= 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
