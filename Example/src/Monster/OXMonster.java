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
			return true;
		}
		else {
			//User Ã¤·Â±ð±â
			return false;
		}

	}

	@Override
	public boolean isCorrect(Object o) {
		boolean userAnswer = (boolean) Hero.pickSolution(o);
		return isCorrect(userAnswer);
	}
}
