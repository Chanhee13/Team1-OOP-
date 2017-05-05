package PyeonDongHyuk_Part;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager{
	
	File[] file= new File[3];
	User user;
	ArrayList<File> f = new ArrayList<File>();
	
	public void CreateFile() // 만드는건 void라 판단한거 같아서 일단 void로 해두었어요.
	{
		//Test 용으로 설정 해두었습니다.
		for(int i=0;i<3;i++){
			
			this.file[i] = new File("Test"+i+".txt"); // 이 부분은 텍스트파일 생성인데 안보셔도 됩니다.
			try {
				file[i].createNewFile();
				file[i].mkdirs();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public String MakeID()
	{
		
		return user.getID();
	}
	
	public User makeUser(){
		
		return user;
	}
	
	public void addFile()
	{
		for(int i=0;i<3;i++)
		{
			f.add(this.file[i]);
		}
	}
	
	public void removeFile()
	{
		f.remove(this.file[0]);
	}
	
	public void loadFile()
	{
		System.out.println("Test loading : "+this.f);
	}
	

}
