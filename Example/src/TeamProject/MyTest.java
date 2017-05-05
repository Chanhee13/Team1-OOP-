package TeamProject;



import java.io.File;
import java.io.IOException;

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
			System.out.println("Gender is male");
		}
		else
			System.out.println("Gender is Female");
		
		//------------------------------ User and Hero Composed Test
		
	}
}
