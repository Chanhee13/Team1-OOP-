package Monster;

import Information.Assignment;
import Information.OXAssignment;
import Manage.gameManager;
import User.Hero;

public class OXMonster extends Monster{

	
	public void askProblem() {
		
	}

	public boolean isCorrect(boolean userAnswer) {
		int prb =gameManager.getRecentProblem();
		boolean sol;
		Assignment ass = assignments.get(prb);
		if(ass instanceof OXAssignment){
			sol = ((OXAssignment)ass).getSolution();
		}else{
			System.out.println("this Assignmentis not OXAssignment");
			return false;
		}
		
		
		if(userAnswer == sol) return true;
		else return false;

	}

	@Override
	public boolean isCorrect() {
		boolean userAnswer = (boolean) Hero.pickSolution();
		return isCorrect(userAnswer);
	}
}
