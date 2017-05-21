package Monster;

import Information.Assignment;
import Information.TypeAssignment;
import Manage.gameManager;
import User.Hero;

public class TypeMonster extends Monster{
	private String guess;
	
	public boolean isCorrect(String userAnswer) {
		int prb =gameManager.getRecentProblem();
		String sol;
		Assignment ass = this.getAssignment().get(prb);
		if(ass instanceof TypeAssignment){
			sol = ((TypeAssignment)ass).getSolution();
		}else{
			System.out.println("this Assignmentis not TypeAssignment");
			return false;
		}
		
		
		if(userAnswer == sol) {
			this.setHP(this.getHP()-10);
			return true;
		}
		else return false;
	}

	public String getguess() {
		return guess;
	}
	
	public void setguess(String guess) {
		this.guess = guess;
	}
	
	public boolean isCorrect(Object o) {
		String userAnswer = (String) Hero.pickSolution(o);
		return isCorrect(userAnswer);
	}
}
