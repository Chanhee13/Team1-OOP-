package Monster;
import Information.*;
import java.util.*;

public abstract class Monster {
	private String name;
	private int HP;
	private int damage;
	private ArrayList<Assignment> assignment = new Arraylist<Assignment> ();
	
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
	
	public ArrayList<Assignment> getAssingment() {
		return assingment;
	}
	
	public void setAssingment(ArrayList<Assignment> assingment) {
		this.assingment = assingment;
	}
	//여기까지 변수 getter와 setter 선언
	
	public String askProblem()
	{
		System.out.println(/* 여기에 문제 질문 들어가겠죠? */);
	}
	
	public boolean isCorrect()
	{
		if( == 1) {
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
