package Manage;

import Monster.Monster;

public class gameManager {
	static private int recentStage;
	static private Monster recentMonster;
	static private int recentProblem;
	static String recentSolution;
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
	
	
	
	
	
}
