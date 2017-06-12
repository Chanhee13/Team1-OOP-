package Monster;

import Information.Assignment;
import Information.SelectAssignment;
import Manage.gameManager;
import User.Hero;

public class SelectMonster extends Monster{
	
	public boolean isCorrect(String userAnswer) {
		int prb =gameManager.getRecentProblem();
		String sol;
		Assignment ass = this.getAssignment().get(prb);
		if(ass instanceof SelectAssignment){
			sol = ((SelectAssignment)ass).getSolution();
		}else{
			System.out.println("this Assignmentis not SelectAssignment");
			return false;
		}
		
		
		if(userAnswer == sol) {
			this.setHP(this.getHP()-10);
			gameManager.getRecentHero().setSolve(gameManager.getRecentHero().getSolve()+1);
			System.out.println("User's Solution is Correct.");
			return true;
		}
		else{
			gameManager.getRecentHero().setUnSolve(gameManager.getRecentHero().getUnSolve()+1);
			gameManager.getRecentHero ().setHP(gameManager.getRecentHero ().getHP()-10);;
			System.out.println("User's Solution is NOT Correct.");
			return false;
	}}

	@Override
	public boolean isCorrect(Object o) {
		System.out.println(o);
		String userAnswer = (String) Hero.pickSolution(o);
		return isCorrect(userAnswer);
	}
}
