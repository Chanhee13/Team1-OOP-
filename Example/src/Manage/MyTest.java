package Manage;

import TeamProject.*;
import User.Hero;
import User.User;

import java.util.Scanner;

import Dr.Dr_T;

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
		System.out.println("Test Name : "+u.getHero().getName());
		if(u.getHero().isGender()==true)
		{
			System.out.println("Gender is Female");
		}
		else
			System.out.println("Gender is Male");
		
		//------------------------------ Stage Pick Test
		System.out.println("---------------Stage Pick TEST---------------");
		gameManager g = new gameManager();
		
		System.out.println("select stage : ");
		//int picked = scan.nextInt();
		int picked = 2;
		if(picked==0||u.isCleared(picked-1)){
			System.out.println("Start Stage "+picked);
			g.setRecentStage(picked);
		}else{
			System.out.println("Not cleared previous stage");
			g.setRecentStage(0);
		}
		
		
		//------------------------------ In Stage, Dr_T's Teaching Test
		System.out.println("---------------Dr_T's Teaching TEST---------------");
		Dr_T t = new Dr_T();
		t.setToTeach();
		System.out.println(t.GetToTeach());
		System.out.println(t.Celebrate());
		
	}
}
