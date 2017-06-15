package Manage;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Information.*;
import Monster.Monster;

import Monster.OXMonster;
import Monster.SelectMonster;
import Monster.TypeMonster;

import User.Hero;
import User.User;
import game.*;

public class gameManager {
	static Hero hero=new Hero();
	static private Hero recentHero= hero;
	static private int recentStage;
	static private Monster recentMonster;
	static private int recentProblem;
	static private boolean recentOXSolution;
	static private String recentSelectSolution;
	static private String recentTypeSolution;
	static private Assignment recentAssignment;
	static private User recnetUser;
	static private Dungeon recentDungeon;
	
	

	public static User getRecnetUser() {
		return recnetUser;
	}
	public static void setRecnetUser(User recnetUser) {
		gameManager.recnetUser = recnetUser;
	}
	public static Assignment getRecentAssignment() {
		return recentAssignment;
	}
	public static void setRecentAssignment(Assignment recentAssignment) {
		gameManager.recentAssignment = recentAssignment;
	}
	public static boolean isRecentOXSolution() {
		return recentOXSolution;
	}
	public static void setRecentOXSolution(boolean recentOXSolution) {
		gameManager.recentOXSolution = recentOXSolution;
	}
	public static String getRecentSelectSolution() {
		return recentSelectSolution;
	}
	public static void setRecentSelectSolution(String sol) {
		gameManager.recentSelectSolution = sol;
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

	
	
	public static Dungeon getRecentDungeon() {
		return recentDungeon;
	}
	public static void setRecentDungeon(Dungeon recentDungeon) {
		gameManager.recentDungeon = recentDungeon;
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
			gameManager.setRecentProblem(0);
			System.out.println(gameManager.getRecentMonster());
			if(gameManager.getRecentMonster() instanceof OXMonster){
				System.out.println("monster changed : "+ mons[0]+" to "+mons[1]);
				gameManager.setRecentMonster(mons[1]);
			}
			else if(gameManager.getRecentMonster() instanceof SelectMonster){
				gameManager.setRecentMonster(mons[2]);
			}
			else if(gameManager.getRecentMonster() instanceof TypeMonster)
			{
				if(gameManager.getRecentHero().isAlive()){
					JOptionPane.showMessageDialog(null, "Hero's HP: "+gameManager.getRecentHero().getHP()+"\nHero is alive!\nCongratulations!\n"
							+"Correct : "+gameManager.getRecentHero().getSolve()+"\nNOT Correct : "+gameManager.getRecentHero().getUnSolve(),
							 "Congratulations!", JOptionPane.INFORMATION_MESSAGE);
					gameManager.getRecnetUser().setCleared(gameManager.getRecentStage(), true);
					System.out.println("지금 스테이지는 어디? "+ gameManager.getRecentStage());
					System.out.println(gameManager.getRecnetUser().isCleared(1));
					gameManager.getRecnetUser().setCleared(gameManager.getRecentStage(),true);
					gameManager.getRecnetUser().setLastCleard(gameManager.getRecentStage());
					
					System.out.println(gameManager.getRecnetUser().getCleared());
				}
				gameManager.setRecentDungeon(null);
				Information.getAssingments().clear();
				return "End";
			}
		}
		return gameManager.getRecentMonster().askProblem();
	}
	
	
}
