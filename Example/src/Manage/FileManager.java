package Manage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import User.Hero;
import User.User;

public class FileManager {

	private File[] file = new File[3];
	private User user = new User();
	private ArrayList<File> f = new ArrayList<File>();

	public void CreateFile() // 만드는건 void라 판단한거 같아서 일단 void로 해두었어요.
	{
		// Test 용으로 설정 해두었습니다.
		for (int i = 0; i < 3; i++) {

			this.file[i] = new File("Test" + i + ".txt"); // 이 부분은 텍스트파일 생성인데
															// 안보셔도 됩니다.
			try {
				file[i].createNewFile();
				file[i].mkdirs();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void MakeID(String ID) throws IOException {
		FileWriter fw = new FileWriter("text1.txt"); // 일단 text1에 저장해 두었음
		User user = new User();
		String data = user.getID(); //받은 것을 저장하는 것인지 파일에서 받아서 저장하는 것인지모르겠음 일단 받은 것을 저장하는 것으로 해놓았음
		fw.write(data);
		fw.close();
	}

	public User makeUser() {

		User user = new User();
		// 나중에는 Scanner나 GUI의 함수로 값을 받아오겠지만
		// 지금은 그냥 직접 값을 넣도록 한다.
		user.setID("temp");
		user.setHero(new Hero());
		boolean[] cleard = { true, false, false, false, false, false, false, false };
		user.setCleared(cleard);
		return user;
	}

	public void addFile() {
		for (int i = 0; i < 3; i++) {
			f.add(this.file[i]);
		}
	}

	public void removeFile() {
		f.remove(this.file[0]);
	}

	public void loadFile() {
		System.out.println("Test loading : " + this.f);
	}

}
