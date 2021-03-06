package Monster;
import Information.*;
import Manage.gameManager;

import java.util.*;

import javax.swing.JOptionPane;


public abstract class Monster {
	static int i =0;
	private String name = "monster "+i;
	private int HP=0;
	private int damage=5;
	private int deadCount=0;
	private ArrayList<Assignment> assignments = new ArrayList<Assignment> ();
	private int prbNum=0;
	
	
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
	
	//여기까지 변수 getter와 setter 선언
	
	public ArrayList<Assignment> getAssignment() {
		return assignments;
	}


	public String askProblem()
	{
		String ass = assignments.get(gameManager.getRecentProblem()).getProblem();
		return ass;
	}
	
	public int getDeadCount() {
		return deadCount;
	}

	public void setDeadCount(int deadCount) {
		this.deadCount = deadCount;
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


	public int getPrbNum() {
		return prbNum;
	}


	public void setPrbNum(int prbNum) {
		this.prbNum = prbNum;
	}
	
	public void popUp(boolean correctness){
		if(correctness){
			JOptionPane.showMessageDialog(null,"Correct","Result",JOptionPane.INFORMATION_MESSAGE);
		}else{
			JOptionPane.showMessageDialog(null,"NOT Correct","Result",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
}
