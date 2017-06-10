package Manage;

import User.Hero;
import User.User;

import java.util.ArrayList;
import java.util.Scanner;

import Dr.Dr_T;
import Information.*;
import Monster.*;

public class MyTest {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		FileManager m = new FileManager();
		m.CreateFile();
		m.addFile();
		m.loadFile();
		m.removeFile();
		m.loadFile();
		//------------------------- File Manager Test
		
		StageManager st = new StageManager();
		st.setCleared();
		//-------------------------- Stage Manager Test
		System.out.println("---------------Make Hero TEST---------------");
		User u = new User();
		Hero h = new Hero();
		h.setName("Jhon");
		h.setGender(true);
		u.setHero(h);
		System.out.println("Name : "+u.getHero().getName());
		if(u.getHero().isGender()==true)
		{
			System.out.println("Gender : Female");
		}
		else
			System.out.println("Gender : Male");
		
		//------------------------------ Stage Pick Test
		System.out.println("---------------Stage Pick TEST---------------");
		
		//System.out.println("select stage : ");
		//int picked = scan.nextInt();
		int picked = 1;
		if(picked==0||u.isCleared(picked-1)){
			System.out.println("Start Stage "+picked);
			gameManager.setRecentStage(picked);
		}else{
			System.out.println("Not cleared previous stage");
			gameManager.setRecentStage(0);
		}
		Information info = new Information(gameManager.getRecentStage());
		
		//------------------------------ In Stage, Dr_T's Teaching Test
		System.out.println("---------------Dr_T's Teaching TEST---------------");
		System.out.println(Dr_T.GetToTeach());
		
		
		//------------------------------ In Stage, Monster vs. Hero Test
		System.out.println("---------------Monster vs. Hero TEST---------------");
		OXMonster ox = new OXMonster();
		SelectMonster se = new SelectMonster();
		TypeMonster ty = new TypeMonster();
		
		ArrayList<Assignment> as = info.getAssingments();
		for(int i=0; i<as.size(); i++){
			System.out.println(as.get(i).getProblem());
			if(as.get(i) instanceof OXAssignment){
				ox.addAssignment(as.get(i));
				ox.setHP(ox.getHP()+10);
				System.out.println("OX");
			}else if(as.get(i) instanceof SelectAssignment){
				se.addAssignment(as.get(i));
				se.setHP(se.getHP()+10);
				System.out.println("SE");
			}else if(as.get(i) instanceof TypeAssignment){
				ty.addAssignment(as.get(i));
				ty.setHP(ty.getHP()+10);
				System.out.println("TY");
			}
		}
		
		int point=0;
		for(int i=0; i<ox.getAssignment().size(); i++){
			ox.askProblem();
			if(ox.isCorrect((boolean)Hero.pickSolution(true))){
				System.out.println("Good!");
				ox.setHP(ox.getHP()-10);
			}else{
				System.out.println("ば.ば");
			}
		}
		if(ox.isDead()){
			System.out.println(ox.getName()+" is Dead!");
			point++;
		}
		for(int i=0; i<se.getAssignment().size(); i++){
			se.askProblem();
			if(se.isCorrect((int)Hero.pickSolution(0))){
				System.out.println("Good!");
				ox.setHP(ox.getHP()-10);
			}else{
				System.out.println("ば.ば");
			}
		}
		
		if(ox.isDead()){
			System.out.println(se.getName()+" is Dead!");
			point++;
		}
		for(int i=0; i<ty.getAssignment().size(); i++){
			ty.askProblem();
			if(ty.isCorrect((String)Hero.pickSolution("sol"))){
				System.out.println("Good!");
				ox.setHP(ox.getHP()-10);
			}else{
				System.out.println("ば.ば");
			}
		}
		if(ox.isDead()){
			System.out.println(ty.getName()+" is Dead!");
			point++;
		}
		
		if(point==3){
			System.out.println(Dr_T.Celebrate());
		}
		
	}
}
