package Monster;

import Information.Assignment;
import Information.SelectAssignment;
import Manage.gameManager;
import User.Hero;

public class SelectMonster extends Monster{
	

	public void askProblem(){
		
	}
	
	public boolean isCorrect(int userAnswer) {
		int prb =gameManager.getRecentProblem();
		int sol;
		Assignment ass = assignments.get(prb);
		if(ass instanceof SelectAssignment){
			sol = ((SelectAssignment)ass).getSolutionNum();
		}else{
			System.out.println("this Assignmentis not SelectAssignment");
			return false;
		}
		
		
		if(userAnswer == sol) return true;
		else return false;
	}

	@Override
	public boolean isCorrect() {
		int userAnswer = (int) Hero.pickSolution();
		return isCorrect(userAnswer);
	}
}
