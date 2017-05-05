package Manage;

import TeamProject.*;
import Dr.Dr_T;

public class MyTest {
	
	public static void main(String[] args) {
		
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
		
		User u = new User();
		Hero h = new Hero();
		h.setName("John");
		h.setGender(true);
		u.setHero(h);
		System.out.println("Test pick : "+u.getHero().pickSolution());
		System.out.println("Test Name : "+u.getHero().getName());
		if(u.getHero().isGender()==true)
		{
			System.out.println("Gender is Female");
		}
		else
			System.out.println("Gender is Male");
		
		//------------------------------ User and Hero Composed Test
		Dr_T t = new Dr_T();
		t.setToTeach();
		System.out.println(t.GetToTeach());
		System.out.println(t.Celebrate());
		
	}
}
