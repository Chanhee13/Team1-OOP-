package Monster;
import Information.*;
import java.util.*;

public abstract class Monster {
	private String name;
	private int HP;
	private int damage;
	private ArrayList<Assignment> assignment = new ArrayList<Assignment> ();
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public int getHP() {
		return HP;
	}
	
	public void setHP(int HP) {
		this.HP = HP;
	}
	
	public int getdamage() {
		return damage;
	}
	
	public void setdamage(int damage) {
		this.damage = damage;
	}
	
	//������� ���� getter�� setter ����
	
	public ArrayList<Assignment> getAssignment() {
		return assignment;
	}

	public void setAssignment(ArrayList<Assignment> assignment) {
		this.assignment = assignment;
	}

	public void askProblem()
	{
		System.out.println(/* ���⿡ ���� ���� ������? */);
	}
	
	public boolean isCorrect()
	{
		if( 1== 1) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public boolean isDead() {
		if( this.getHP() <= 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
