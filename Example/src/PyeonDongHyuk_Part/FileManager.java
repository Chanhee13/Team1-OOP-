package PyeonDongHyuk_Part;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager{
	
	File[] file= new File[3];
	User user;
	ArrayList<File> f = new ArrayList<File>();
	
	public void CreateFile() // ����°� void�� �Ǵ��Ѱ� ���Ƽ� �ϴ� void�� �صξ����.
	{
		//Test ������ ���� �صξ����ϴ�.
		for(int i=0;i<3;i++){
			
			this.file[i] = new File("Test"+i+".txt"); // �� �κ��� �ؽ�Ʈ���� �����ε� �Ⱥ��ŵ� �˴ϴ�.
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
