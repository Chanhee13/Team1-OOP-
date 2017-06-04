package Manage;

import Monster.Monster;

public class gameManager {
	static private int recentStage;
	static private Monster recentMonster;
	static private int recentProblem;
	static private boolean recentOXSolution;
	static private int recentSelectSolution;
	static private String recentStringSolution;
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
	public static String getRecentStringSolution() {
		return recentStringSolution;
	}
	public static void setRecentStringSolution(String recentStringSolution) {
		gameManager.recentStringSolution = recentStringSolution;
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
	
	
	
	
	
}
