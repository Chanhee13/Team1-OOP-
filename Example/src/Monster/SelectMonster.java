package Monster;

import Information.Assignment;
import Information.SelectAssignment;
import Manage.gameManager;
import User.Hero;

public class SelectMonster extends Monster{
	
	public boolean isCorrect(int userAnswer) {
		int prb =gameManager.getRecentProblem();
		int sol;
		Assignment ass = this.getAssignment().get(prb);
		if(ass instanceof SelectAssignment){
			sol = ((SelectAssignment)ass).getSolutionNum();
		}else{
			System.out.println("this Assignmentis not SelectAssignment");
			return false;
		}
		
		
		if(userAnswer == sol) {
			this.setHP(this.getHP()-10);
			return true;
		}
		else return false;
	}

	@Override
	public boolean isCorrect(Object o) {
		System.out.println(o);
		int userAnswer = (int) Hero.pickSolution(o);
		return isCorrect(userAnswer);
	}
}
