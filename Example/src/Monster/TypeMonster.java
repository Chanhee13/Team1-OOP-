package Monster;

import Information.Assignment;
import Information.TypeAssignment;
import Manage.gameManager;
import User.Hero;

public class TypeMonster extends Monster {
	private String guess;

	public boolean isCorrect(String userAnswer) {
		int prb = gameManager.getRecentProblem();
		String sol;
		Assignment ass = this.getAssignment().get(prb);
		sol = ((TypeAssignment) ass).getSolution();
		//정답확인
		System.out.println("Solution: "+sol); //왜 솔루션이 null이지? 
		if (userAnswer.equals(sol)) {
			gameManager.getRecentHero().setSolve(gameManager.getRecentHero().getSolve()+1);
			this.setHP(this.getHP() - 10);
			System.out.println("User's Solution is Correct.");
			return true;
		} else {
			gameManager.getRecentHero().setUnSolve(gameManager.getRecentHero().getUnSolve()+1);
			gameManager.getRecentHero ().setHP(gameManager.getRecentHero ().getHP()-10);;
			System.out.println("User's Solution is NOT Correct.");
			return false;

		}
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
