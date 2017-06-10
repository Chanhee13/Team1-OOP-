package Manage;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Information.Assignment;
import Monster.Monster;
import Monster.OXMonster;
import Monster.SelectMonster;
import Monster.TypeMonster;

public class gameManager {
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
	
	public static String nextAssignment(Monster[] mons){
		
		
		gameManager.setRecentProblem(gameManager.getRecentProblem()+1);
		
		ArrayList<Assignment> list = gameManager.getRecentMonster().getAssignment();
		System.out.println("숫자 : "+gameManager.getRecentProblem());
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getProblem());
		}
		if(gameManager.getRecentMonster().getAssignment().size()<=gameManager.getRecentProblem()){
			System.out.println("여기 들어왔다");
			gameManager.setRecentProblem(0);
			System.out.println(gameManager.getRecentMonster());
			if(gameManager.getRecentMonster() instanceof OXMonster){
				gameManager.setRecentMonster(mons[1]);
				return gameManager.getRecentMonster().askProblem();
			}
			else if(gameManager.getRecentMonster() instanceof SelectMonster){
				gameManager.setRecentMonster(mons[2]);
				return gameManager.getRecentMonster().askProblem();
			}
			else if(gameManager.getRecentMonster() instanceof TypeMonster)
			{
				JOptionPane.showMessageDialog(new JFrame(), "Good");
				return "good!";
			}
		}
		return gameManager.getRecentMonster().askProblem();
	}
	
	
}
