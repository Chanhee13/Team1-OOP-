package Monster;

import Information.Assignment;
import Information.SelectAssignment;
import Information.TypeAssignment;
import Manage.gameManager;
import User.Hero;

public class TypeMonster extends Monster{
	private String guess;
	
	public boolean isCorrect(String userAnswer) {
		int prb =gameManager.getRecentProblem();
		String sol;
		Assignment ass = assignments.get(prb);
		if(ass instanceof TypeAssignment){
			sol = ((TypeAssignment)ass).getSolution();
		}else{
			System.out.println("this Assignmentis not TypeAssignment");
			return false;
		}
		
		
		if(userAnswer == sol) return true;
		else return false;
	}

	public String getguess() {
		return guess;
	}
	
	public void setguess(String guess) {
		this.guess = guess;
	}
	
	public boolean isCorrect() {
		String userAnswer = (String) Hero.pickSolution();
		return isCorrect(userAnswer);
	}
}
