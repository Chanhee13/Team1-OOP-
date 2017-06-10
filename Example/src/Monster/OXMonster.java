package Monster;

import Information.Assignment;
import Information.OXAssignment;
import Manage.gameManager;
import User.Hero;

public class OXMonster extends Monster{

	public boolean isCorrect(boolean userAnswer) {
		int prb =gameManager.getRecentProblem();
		boolean sol;
		Assignment ass = this.getAssignment().get(prb);
		if(ass instanceof OXAssignment){
			sol = ((OXAssignment)ass).getSolution();
		}else{
			System.out.println("this Assignmentis not OXAssignment");
			
			return false;
		}
		
		
		if(userAnswer == sol) {
			this.setHP(this.getHP()-10);
			System.out.println("User's Solution is Correct.");
			return true;
		}
		else {
			Hero recentHero = null;
			gameManager.getRecentHero().setHP(getHP() - 10);
			System.out.println("User's Solution is NOT Correct.");
			return false;
		}

	}

	@Override
	public boolean isCorrect(Object o) {
		boolean userAnswer = (boolean) Hero.pickSolution(o);
		return isCorrect(userAnswer);
	}
}
