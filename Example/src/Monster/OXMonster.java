
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
			gameManager.getRecentHero().setSolve(gameManager.getRecentHero().getSolve()+1);
			System.out.println("User's Solution is Correct.");
			this.popUp(true);
			return true;
		}
		else {
			gameManager.getRecentHero().setUnSolve(gameManager.getRecentHero().getUnSolve()+1);
			System.out.println("------------------------깎이기 전에 몇?----------------\n"+gameManager.getRecentHero().getHP());
			gameManager.getRecentHero ().setHP(gameManager.getRecentHero ().getHP()-10);;
			System.out.println("------------------------여기서는 몇?----------------\n"+gameManager.getRecentHero().getHP());
			System.out.println("User's Solution is NOT Correct.");
			this.popUp(false);
			return false;
		}

	}

	@Override
	public boolean isCorrect(Object o) {
		boolean userAnswer = (boolean) Hero.pickSolution(o);
		return isCorrect(userAnswer);
	}
}
