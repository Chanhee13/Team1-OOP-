package Manage;

import Monster.Monster;
import User.Hero;

public class gameManager {
	static Hero hero=new Hero();
	static private Hero recentHero= hero;
	static private int recentStage;
	static private Monster recentMonster;
	static private int recentProblem;
	static private boolean recentOXSolution;
	static private int recentSelectSolution;
	static private String recentTypeSolution;
	public static boolean isRecentOXSolution() {
		return recentOXSolution;
	}
	public static void setRecentOXSolution(boolean recentOXSolution) {
		gameManager.recentOXSolution = recentOXSolution;
	}
	public static int getRecentSelectSolution() {
		return recentSelectSolution;
	}
	public static void setRecentSelectSolution(int recentSelectSolution) {
		gameManager.recentSelectSolution = recentSelectSolution;
	}
	public static String getRecentTypeSolution() {
		return recentTypeSolution;
	}
	public static void setRecentTypeSolution(String recentTypeSolution) {
		gameManager.recentTypeSolution = recentTypeSolution;
	}
	public static int getRecentStage() {
		return recentStage;
	}
	public static void setRecentStage(int recentStage) {
		gameManager.recentStage = recentStage;
	}
	public static Monster getRecentMonster() {
		return recentMonster;
	}
	public static void setRecentMonster(Monster recentMonster) {
		gameManager.recentMonster = recentMonster;
	}
	public static int getRecentProblem() {
		return recentProblem;
	}
	public static void setRecentProblem(int recentProblem) {
		gameManager.recentProblem = recentProblem;
	}
	public static Hero getRecentHero() {
		return recentHero;
	}
	public static void setRecentHero(Hero recentHero) {
		gameManager.recentHero = recentHero;
	}

	
	
	
	
	
}
